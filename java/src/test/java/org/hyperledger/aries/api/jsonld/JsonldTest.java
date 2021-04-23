/*
 * Copyright (c) 2021 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.jsonld;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import lombok.extern.slf4j.Slf4j;
import org.hyperledger.aries.IntegrationTestBase;
import org.hyperledger.aries.api.jsonld.SignRequest.SignDocument;
import org.hyperledger.aries.api.jsonld.SignRequest.SignDocument.Options;
import org.hyperledger.aries.api.jsonld.VerifiableCredential.VerifiableIndyCredential;
import org.hyperledger.aries.api.wallet.WalletDidResponse;
import org.hyperledger.aries.config.GsonConfig;
import org.hyperledger.aries.util.FileLoader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

@Slf4j
class JsonldTest extends IntegrationTestBase {

    private final Gson gson = GsonConfig.defaultConfig();
    private final Gson pretty = GsonConfig.prettyPrinter();
    private final FileLoader loader = FileLoader.newLoader();

    @Test
    void testSignAndVerifyVC() throws Exception {

        // first ceate a local did
        WalletDidResponse localDid = createLocalDid();

        VerifiableCredential vc = VerifiableCredential.builder().build();

        SignRequest sr = SignRequest.from(
                localDid.getVerkey(),
                vc,
                Options.builderWithDefaults().verificationMethod("something").build());

        log.debug("sign request: \n{}", pretty.toJson(sr));

        // sign the structure
        Optional<VerifiableCredential> signed = ac.jsonldSign(sr, VerifiableCredential.class);
        Assertions.assertTrue(signed.isPresent());
        Assertions.assertNotNull(signed.get().getProof());
        Assertions.assertEquals("Ed25519Signature2018", signed.get().getProof().getType());
        Assertions.assertTrue(signed.get().getProof().getJws().startsWith("eyJhbGciOiA"));

        // verify the structure
        final Optional<VerifyResponse> verified = ac.jsonldVerify(localDid.getVerkey(), signed.get());
        Assertions.assertTrue(verified.isPresent());
        Assertions.assertTrue(verified.get().isValid());
    }

    @Test
    void testSignAndVerifyVP() throws Exception {

        // first ceate a local did
        WalletDidResponse localDid = createLocalDid();

        String json = loader.load("json-ld/verifiablePresentationUnsigned.json");
        VerifiablePresentation<VerifiableIndyCredential> vp = gson.fromJson(
                json, VerifiablePresentation.INDY_CREDENTIAL_TYPE);

        JsonElement jsonTree = gson.toJsonTree(vp);

        SignRequest sr = SignRequest.builder()
                .verkey(localDid.getVerkey())
                .doc(SignDocument.builder()
                        .credential(jsonTree.getAsJsonObject())
                        .options(Options.builder()
                                .verificationMethod("something")
                                .build())
                        .build())
                .build();

        log.debug("sign request: \n{}", pretty.toJson(sr));

        // sign the structure
        Optional<VerifiablePresentation<VerifiableIndyCredential>> signed = ac.jsonldSign(
                sr, VerifiablePresentation.class);
        Assertions.assertTrue(signed.isPresent());
        Assertions.assertNotNull(signed.get().getProof());
        Assertions.assertEquals("Ed25519Signature2018", signed.get().getProof().getType());
        Assertions.assertTrue(signed.get().getProof().getJws().startsWith("eyJhbGciOiA"));

        // verify the structure
        final Optional<VerifyResponse> verified = ac.jsonldVerify(localDid.getVerkey(), signed.get());
        Assertions.assertTrue(verified.isPresent());
        Assertions.assertTrue(verified.get().isValid());
    }

    @Test
    void testVerifyWrongCredentialType() {
        Assertions.assertThrows(IllegalStateException.class, () -> ac.jsonldVerify("1234", new Object()));
    }

    private WalletDidResponse createLocalDid() throws Exception {
        final Optional<WalletDidResponse> localDid = ac.walletDidCreate();
        Assertions.assertTrue(localDid.isPresent());
        log.debug("localDid: {}", localDid.get());
        return localDid.get();
    }

}
