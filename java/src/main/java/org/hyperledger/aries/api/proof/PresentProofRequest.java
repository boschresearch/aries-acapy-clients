/**
 * Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.proof;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nullable;

import org.hyperledger.aries.api.proof.PresentProofRequest.ProofRequest.ProofAttributes.ProofNonRevoked;
import org.hyperledger.aries.config.CredDefId;
import org.hyperledger.aries.config.GsonConfig;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * Aka PresentationSendRequestRequest
 * This model is used to send a presentation request, or in other words to request a proof.
 *
 */
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class PresentProofRequest {

    private String connectionId;

    @NonNull private ProofRequest proofRequest;

    private Boolean trace;

    private String comment;

    public static PresentProofRequest build(PresentProofRequestConfig config) {
        return PresentProofRequest
                .builder()
                .connectionId(config.getConnectionId())
                .proofRequest(ProofRequest.build(config))
                .build();
    }

    @Data @NoArgsConstructor @AllArgsConstructor @Builder
    public static class ProofRequest {

        @Builder.Default
        private String name = "Proof request";

        @Builder.Default
        private String version = "1.0";

        private String nonce;

        private ProofNonRevoked nonRevoked;

        @Builder.Default
        private Map<String, ProofAttributes> requestedAttributes = new LinkedHashMap<>();

        @Builder.Default
        private Map<String, ProofAttributes> requestedPredicates = new LinkedHashMap<>();

        public ProofRequest addRequestedAttribute(
                @NonNull String attribute, @Nullable List<JsonObject> restrictions) {
            this.requestedAttributes.put(
                    attribute,
                    ProofAttributes.build(attribute, restrictions));
            return this;
        }

        @Data @NoArgsConstructor @AllArgsConstructor
        public static class ProofAttributes {
            private String name;
            private ProofNonRevoked nonRevoked;
            private List<JsonObject> restrictions = new ArrayList<>();

            public static ProofAttributes build(@NonNull String name, @Nullable List<JsonObject> restrictions) {
                return new ProofAttributes(name, null, restrictions);
            }

            @Data @NoArgsConstructor @AllArgsConstructor @Builder
            public static class ProofNonRevoked {
                private Integer toEpoch;
                private Integer fromEpoch;
            }

            @Data @NoArgsConstructor @AllArgsConstructor @Builder
            public static class ProofRestrictions {
                private String schemaId;

                private String schemaName;

                private String schemaVersion;

                private String schemaIssuerDid;

                @SerializedName(value = CredDefId.CRED_DEF_ID, alternate = CredDefId.CREDENTIAL_DEFINITION_ID)
                private String credentialDefinitionId;

                private String issuerDid;

                /** @since 0.5.4 */
                private List<String> names;

                public JsonObject toJsonObject() {
                    return GsonConfig.defaultConfig().toJsonTree(this).getAsJsonObject();
                }
            }
        }

        public static ProofRequest build(@NonNull PresentProofRequestConfig config) {
            ProofRequest result = new ProofRequest();
            config.getAttributes().forEach((k, v) -> result.addRequestedAttribute(k, v));
            return result;
        }
    }
}
