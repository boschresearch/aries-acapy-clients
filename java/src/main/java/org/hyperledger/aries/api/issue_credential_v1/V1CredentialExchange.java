/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.issue_credential_v1;

import org.hyperledger.aries.api.credentials.Credential;
import org.hyperledger.aries.config.CredDefId;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Result of a credential exchange. E.g. issueCredentialSend() or issueCredentialSendProposal()
 *
 */
@Data @NoArgsConstructor
public class V1CredentialExchange {
    private Boolean autoIssue;
    private Boolean autoOffer;
    private Boolean autoRemove;
    private String connectionId;
    private String createdAt;
    private Credential credential;
    @SerializedName(value = CredDefId.CRED_DEF_ID, alternate = CredDefId.CREDENTIAL_DEFINITION_ID)
    private String credentialDefinitionId;
    private String credentialExchangeId;
    private String credentialId; // only set when the state is credential_acked
    private JsonObject credentialOffer;
    private JsonObject credentialOfferDict;
    private JsonObject credentialProposalDict;
    private JsonObject credentialRequest;
    private JsonObject credentialRequestMetadata;
    private String errorMsg;
    private String initiator;
    private String parentThreadId;
    private JsonObject rawCredential;
    private String revocRegId;
    private String revocationId;
    private CredentialExchangeRole role;
    private String schemaId;
    private CredentialExchangeState state;
    private String threadId;
    private Boolean trace;
    private String updatedAt;
}
