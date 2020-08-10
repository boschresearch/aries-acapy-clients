/**
 * Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.credential;

import com.google.gson.JsonObject;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Result of a credential exchange. E.g. issueCredentialSend() or issueCredentialSendProposal()
 *
 */
@Data @NoArgsConstructor
public class CredentialExchange {
    private String threadId;
    private String errorMsg;
    private String credentialExchangeId;
    private Boolean trace;
    private Boolean autoOffer;
    private String credentialId;
    private String state;
    private JsonObject credentialOffer;
    private String connectionId;
    private JsonObject credentialRequestMetadata;
    private JsonObject rawCredential;
    private String updatedAt;
    private String parentThreadId;
    private JsonObject credentialOfferDict;
    private JsonObject credentialRequest;
    private JsonObject credentialProposalDict;
    private String credentialDefinitionId;
    private String schemaId;
    private String createdAt;
    private String revocationId;
    private Credential credential;
    private Boolean autoRemove;
    private String revocRegId;
    private String role;
    private Boolean autoIssue;
}
