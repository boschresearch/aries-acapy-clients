/*
 * Copyright (c) 2021 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.connection;

import lombok.Builder;
import lombok.Data;
import org.hyperledger.aries.api.AcaPyRequestFilter;

import javax.annotation.Nullable;

@Data @Builder
public class ConnectionFilter implements AcaPyRequestFilter {
    @Nullable private String alias;
    @Nullable private ConnectionInitiator initiator;
    @Nullable private String invitationKey;
    @Nullable private String myDid;
    @Nullable private ConnectionState state;
    @Nullable private String theirDid;
    @Nullable private String theirRole;
}
