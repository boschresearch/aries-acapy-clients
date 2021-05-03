/*
 * Copyright (c) 2020-2021 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.present_proof;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public enum PresentationExchangeRole {
    @JsonProperty("prover")
    @SerializedName("prover")
    PROVER,

    @JsonProperty("verifier")
    @SerializedName("verifier")
    VERIFIER,
}
