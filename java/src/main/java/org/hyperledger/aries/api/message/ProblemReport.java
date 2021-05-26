/*
 * Copyright (c) 2020-2021 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.message;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Webhook/Websocket problem report event message
 */
@Data @NoArgsConstructor @AllArgsConstructor
public class ProblemReport {

    @SerializedName("@type")
    private String type;

    @SerializedName("@id")
    private String id;

    @SerializedName("~thread")
    private Thread thread;

    @SerializedName("explain-ltxt")
    private String explainLtxt;

    @Data @NoArgsConstructor @AllArgsConstructor
    public static final class Thread {
        private String thid;
    }
}
