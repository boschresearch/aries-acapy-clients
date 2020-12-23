/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.revocation;

import lombok.*;

import javax.annotation.Nullable;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class RevRegCreateRequest {
    @NonNull private String credentialDefinitionId;
    /** Maximun credentials */
    @Nullable private Integer maxCredNum;
}
