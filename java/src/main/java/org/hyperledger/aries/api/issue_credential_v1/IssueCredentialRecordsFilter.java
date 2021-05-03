/*
 * Copyright (c) 2020-2021 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.issue_credential_v1;

import lombok.Builder;
import lombok.Data;
import org.hyperledger.aries.api.AcaPyRequestFilter;

import javax.annotation.Nullable;

@Data @Builder
public class IssueCredentialRecordsFilter implements AcaPyRequestFilter {
    @Nullable private String connectionId;
    @Nullable private CredentialExchangeRole role;
    @Nullable private CredentialExchangeState state;
    @Nullable private String threadId;
}
