/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.out_of_band;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class AttachmentDef {

    private String id;
    private AttachmentType type;

    public enum AttachmentType {
        @SerializedName("credential-offer")
        CREDENTIAL_OFFER,
        @SerializedName("present-proof")
        PRESENT_PROOF
    }
}
