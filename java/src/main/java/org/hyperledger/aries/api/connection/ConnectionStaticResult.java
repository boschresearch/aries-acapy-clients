/*
 * Copyright (c) 2020-2021 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.connection;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class ConnectionStaticResult {
    private String mvVerkey;
    private String myDid;
    private String myEndpoint;
    private ConnectionRecord record;
    private String theirDid;
    private String theirVerkey;
}
