/*
 * Copyright (c) 2021 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.present_proof;

import lombok.Builder;
import lombok.Data;
import org.hyperledger.aries.api.AcaPyRequestFilter;

import javax.annotation.Nullable;

@Data @Builder
public class PresentProofRecordsFilter implements AcaPyRequestFilter {
    @Nullable private String connectionId;
    @Nullable private PresentationExchangeRole role;
    @Nullable private PresentationExchangeState state;
    @Nullable private String threadId;
}
