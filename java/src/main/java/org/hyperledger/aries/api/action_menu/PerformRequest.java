/*
 * Copyright (c) 2020-2021 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.action_menu;

import lombok.*;

import java.util.Map;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class PerformRequest {
    private String name;
    private Map<String, String> params;
}
