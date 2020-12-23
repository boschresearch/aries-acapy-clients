/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.schema;

import lombok.Builder;
import lombok.Data;

import javax.annotation.Nonnull;
import java.util.List;

@Data @Builder
public class SchemaSendRequest {
    @Nonnull
    private List<String> attributes;
    @Nonnull
    private String schemaName;
    @Nonnull
    private String schemaVersion;
}
