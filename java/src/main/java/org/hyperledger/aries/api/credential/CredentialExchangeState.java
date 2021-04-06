/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.credential;

import com.google.gson.annotations.SerializedName;

public enum CredentialExchangeState {
    @SerializedName("proposal_sent")
    PROPOSAL_SENT,

    @SerializedName("proposal_received")
    PROPOSAL_RECEIVED,

    @SerializedName("offer_sent")
    OFFER_SENT,

    @SerializedName("offer_received")
    OFFER_RECEIVED,

    @SerializedName("request_sent")
    REQUEST_SENT,

    @SerializedName("request_received")
    REQUEST_RECEIVED,

    @SerializedName("credential_issued")
    CREDENTIAL_ISSUED,

    @SerializedName("credential_received")
    CREDENTIAL_RECEIVED,

    @SerializedName("credential_acked")
    CREDENTIAL_ACKED
}
