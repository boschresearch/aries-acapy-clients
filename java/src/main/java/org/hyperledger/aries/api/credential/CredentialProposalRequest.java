/**
 * Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.credential;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * Credential that is requested from a connection (holder to issuer),
 * or issued to a connection (issuer to holder)
 */
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class CredentialProposalRequest {

    @Nullable
    private Boolean trace;

    @Nullable
    private String comment;

    @Nullable
    @SerializedName(value = "credential_definition_id", alternate = "cred_def_id")
    private String credentialDefinitionId;

    /**
     * Optional when sending the issuer a proposal, mandatory when sending the holder a credential
     */
    @Nullable
    private CredentialPreview credentialProposal;

    @Nullable
    private String schemaIssuerDid;

    @Nullable
    private String schemaName;

    @Nullable
    private String issuerDid;

    @Nullable
    private String schemaVersion;

    @NonNull
    private String connectionId;

    /**
     *  Whether to remove the credential exchange record on completion
     *  (overrides --preserve-exchange-records configuration setting)
     */
    @Nullable
    private Boolean autoRemove;

    @Nullable
    private String schemaId;

    /**
     * Constructor used when issuing a credential via issueCredentialSend()
     * @param <T> type
     * @param connectionId the connection id
     * @param credentialDefinitionId the credential definition id
     * @param instance instance template
     */
    public <T> CredentialProposalRequest(
            @NonNull String connectionId, @NonNull String credentialDefinitionId, @NonNull T instance) {
        super();
        this.connectionId = connectionId;
        this.credentialDefinitionId = credentialDefinitionId;
        this.credentialProposal = new CredentialPreview(CredentialAttributes.from(instance));
    }

    @Data @NoArgsConstructor
    public static final class CredentialPreview {

        @SerializedName("@type")
        private String type = "did:sov:BzCbsNYhMrjHiqZDTUASHg;spec/issue-credential/1.0/credential-preview";

        private List<CredentialAttributes> attributes = new ArrayList<>();

        public CredentialPreview(List<CredentialAttributes> attributes) {
            super();
            this.attributes = attributes;
        }
    }
}
