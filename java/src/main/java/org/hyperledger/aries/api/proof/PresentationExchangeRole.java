/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.proof;

import com.google.gson.annotations.SerializedName;

public enum PresentationExchangeRole {
    @SerializedName("prover")
    PROVER,

    @SerializedName("verifier")
    VERIFIER,
}
