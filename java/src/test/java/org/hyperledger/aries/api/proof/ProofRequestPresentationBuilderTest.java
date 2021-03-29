/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.proof;

import com.google.gson.Gson;
import org.hyperledger.aries.IntegrationTestBase;
import org.hyperledger.aries.api.proof.PresentProofRequest.ProofRequest;
import org.hyperledger.aries.api.proof.PresentProofRequest.ProofRequest.ProofAttributes.ProofRestrictions;
import org.hyperledger.aries.api.proof.ProofRequestPresentation.PresentationAttachment;
import org.hyperledger.aries.config.GsonConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;

class ProofRequestPresentationBuilderTest extends IntegrationTestBase {

    private static final Charset UTF_8 = StandardCharsets.UTF_8;

    private final Gson gson = GsonConfig.defaultConfig();

    @Test
    void testBuildConnectionlessProofRequest() throws Exception {
        ProofRequestPresentationBuilder builder = new ProofRequestPresentationBuilder(ac);

        PresentProofRequest presentProofRequest = PresentProofRequestHelper.buildForEachAttribute(
                UUID.randomUUID().toString(),
                List.of("name", "email"),
                ProofRestrictions
                        .builder()
                        .schemaId("WgWxqztrNooG92RXvxSTWv:2:schema_name:1.0")
                        .build());

        Optional<String> base64 = builder.buildRequest(presentProofRequest);
        Assertions.assertTrue(base64.isPresent());

        byte[] base64Decoded = Base64.getDecoder().decode(base64.get());
        String json = new String(base64Decoded, UTF_8);
        ProofRequestPresentation presentation = gson.fromJson(json, ProofRequestPresentation.class);

        Assertions.assertEquals(1, presentation.getRequest().size());
        final PresentationAttachment presentationAttachment = presentation.getRequest().get(0);
        final Map<String, String> data = presentationAttachment.getData();
        Assertions.assertNotNull(data);

        base64Decoded = Base64.getDecoder().decode(data.get("base64"));
        json = new String(base64Decoded, UTF_8);
        ProofRequest proofRequest = gson.fromJson(json, ProofRequest.class);
        Assertions.assertEquals(2, proofRequest.getRequestedAttributes().size());
    }

}
