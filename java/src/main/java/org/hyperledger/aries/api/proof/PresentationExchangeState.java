/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.proof;

import com.google.gson.annotations.SerializedName;

public enum PresentationExchangeState {
    @SerializedName("proposal_sent")
    PROPOSAL_SENT,

    @SerializedName("proposal_received")
    PROPOSAL_RECEIVED,

    @SerializedName("request_sent")
    REQUEST_SENT,

    @SerializedName("request_received")
    REQUEST_RECEIVED,

    @SerializedName("presentation_sent")
    PRESENTATIONS_SENT,

    @SerializedName("presentation_received")
    PRESENTATION_RECEIVED,

    @SerializedName("verified")
    VERIFIED,

    @SerializedName("presentation_acked")
    PRESENTATION_ACKED
}
