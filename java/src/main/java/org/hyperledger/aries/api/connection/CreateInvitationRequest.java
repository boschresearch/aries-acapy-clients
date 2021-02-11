/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.connection;

import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Connection create invitation request.
 * @since 0.6.0
 */
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class CreateInvitationRequest {
    private String mediationId;
    private JsonObject metadata;
    /** mandatory */
    private List<String> recipientKeys;
    private List<String> routingKeys;
    private String serviceEndpoint;
}
