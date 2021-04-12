/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.present_proof;

import com.google.gson.Gson;
import org.hyperledger.aries.AriesClient;
import org.hyperledger.aries.api.wallet.GetDidEndpointResponse;
import org.hyperledger.aries.api.wallet.WalletDidResponse;
import org.hyperledger.aries.config.GsonConfig;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Optional;

public class ProofRequestPresentationBuilder {

    private static final Charset UTF_8 = StandardCharsets.UTF_8;

    private final Gson gson = GsonConfig.defaultConfig();

    private final AriesClient acaPy;

    public ProofRequestPresentationBuilder(AriesClient acaPy) {
        super();
        this.acaPy = acaPy;
    }

    public Optional<String> buildRequest(PresentProofRequest presentProofRequest) throws IOException {

        Optional<String> result = Optional.empty();

        String agentVerkey = "";
        String agentURI = "";

        final Optional<WalletDidResponse> walletDidPublic = acaPy.walletDidPublic();
        if (walletDidPublic.isPresent()) {
            String agentPublicDid;
            agentVerkey = walletDidPublic.get().getVerkey();
            agentPublicDid = walletDidPublic.get().getDid();
            final Optional<GetDidEndpointResponse> agentEndpoint = acaPy.walletGetDidEndpoint(agentPublicDid);
            if (agentEndpoint.isPresent()) {
                agentURI = agentEndpoint.get().getEndpoint();
            }
        }

        Optional<PresentationExchangeRecord> exchangeRecord =
                acaPy.presentProofCreateRequest(presentProofRequest);

        if (exchangeRecord.isPresent()) {
            String requestJson = gson.toJson(exchangeRecord.get().getPresentationRequest());
            String proofRequestBase64 = Base64.getEncoder().encodeToString(requestJson.getBytes(UTF_8));
            ProofRequestPresentation envelope = new ProofRequestPresentation(
                    agentURI, agentVerkey, exchangeRecord.get().getThreadId(), proofRequestBase64);
            String envelopeBase64 = Base64.getEncoder().encodeToString(
                    gson.toJson(envelope).getBytes(UTF_8));
            result = Optional.of(envelopeBase64);

        }
        return result;
    }
}
