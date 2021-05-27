/*
 * Copyright (c) 2020-2021 - for information on the respective copyright owner
 * see the NOTICE file and/or the repository at
 * https://github.com/hyperledger-labs/acapy-java-client
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.jsonld;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public final class VerifyResponse {
    private boolean valid;
    private String error;
}
