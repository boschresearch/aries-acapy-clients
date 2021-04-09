/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.proof;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class PresentationProblemReportRequest {
    @SerializedName("explain_ltxt")
    private String explainLtxt;
}
