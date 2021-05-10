/*
 * Copyright (c) 2020-2021 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.out_of_band;

import lombok.Builder;
import lombok.Data;
import org.hyperledger.aries.api.AcaPyRequestFilter;

@Data @Builder
public class CreateInvitationFilter implements AcaPyRequestFilter {
    private Boolean autoAccept;
    private Boolean multiUse;
}
