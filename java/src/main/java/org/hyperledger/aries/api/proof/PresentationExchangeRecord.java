/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.proof;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hyperledger.aries.api.proof.PresentProofRequest.ProofRequest;
import org.hyperledger.aries.pojo.AttributeName;
import org.hyperledger.aries.webhook.EventParser;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Data @NoArgsConstructor @AllArgsConstructor
public class PresentationExchangeRecord {

    private String connectionId;

    private String presentationExchangeId;

    private boolean verified;

    private String state;

    private String errorMsg;

    private String role;

    private String initiator;

    private String createdAt;

    private String updatedAt;

    private boolean autoPresent;

    private String threadId;

    private List<Identifier> identifiers;

    private JsonObject presentation;

    private ProofRequest presentationRequest;

    private JsonObject presentationProposalDict;

    private JsonObject presentationRequestDict;

    public boolean hasCredentialDefinitionId(@NonNull String credentialDefinitionId) {
        if (identifiers != null) {
            return identifiers.stream().anyMatch(i -> credentialDefinitionId.equals(i.getCredentialDefinitionId()));
        }
        return false;
    }

    public boolean hasSchemaId(@NonNull String schemaId) {
        if (identifiers != null) {
            return identifiers.stream().anyMatch(i -> schemaId.equals(i.getSchemaId()));
        }
        return false;
    }

    public JsonObject getPresentation() {
        if (presentation == null) {
            return new JsonObject();
        }
        return presentation;
    }

    /**
     * Sets the received presentation attributes on the instance. Only works for matching names.
     * The {@link AttributeName} annotation can be used to exclude fields from processing or to
     * handle different names.
     * @param <T> The class type
     * @param type the POJO template to instantiate
     * @return Instance of the POJO with set properties
     */
    public <T> T from(@NonNull Class<T> type) {
        return EventParser.from(presentation.toString(), type);
    }

    /**
     * Finds the attribute names in the proof and extracts their corresponding values.
     * @param names Set of attribute names
     * @return Map containing the attribute names and their corresponding values
     */
    public Map<String, Object> from(@NonNull Set<String> names) {
        return EventParser.from(presentation.toString(), names);
    }

    @Data @NoArgsConstructor
    public static class Identifier {
        private String schemaId;
        @SerializedName(value = "cred_def_id", alternate = "credential_definition_id")
        private String credentialDefinitionId;
        private String revRegId;
        private String timestamp;
    }
}
