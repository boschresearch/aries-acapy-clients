/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.didexchange;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class DIDXRequest {

    @SerializedName("@id")
    private String id;

    @SerializedName("@type")
    private String type;

    @SerializedName("~thread")
    private DIDXThread thread;

    private String did;

    @SerializedName("did_doc~attach")
    private DIDXRequestDidDocAttach didDocAttach;

    private String label;

    @Data @NoArgsConstructor
    public static final class DIDXThread {
        private String thid;
        private String pthid;
    }
}
