/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.issue_credential_v1;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class V1CredentialIssueRequest {
    private String comment;
}
