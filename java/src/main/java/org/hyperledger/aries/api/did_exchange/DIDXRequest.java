/*
 * Copyright (c) 2021 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.did_exchange;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
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

    @Data @Builder @NoArgsConstructor @AllArgsConstructor
    public static final class DIDXThread {
        private String thid;
        private String pthid;
    }
}
