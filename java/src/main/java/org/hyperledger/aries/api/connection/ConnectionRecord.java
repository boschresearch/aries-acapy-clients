/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.connection;

import org.apache.commons.lang3.StringUtils;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data @NoArgsConstructor @Accessors(chain = true)
public class ConnectionRecord {

    private String theirLabel;

    private String theirDid;

    private String myDid;

    private String connectionId;

    private String state;

    private String createdAt;

    private String updatedAt;

    private String alias;

    private String initiator;

    private String invitationKey;

    private String invitationMode;

    private String routingState;

    private String accept;

    private String errorMsg;

    private String inboundConnectionId;

    private String requestId;

    private String theirRole;

    /**
     * The request id is only set if the connection was initated by this agent.
     * @return true in case the connection was not initiated by this agent
     */
    public boolean isIncomingConnection() {
        return StringUtils.isEmpty(requestId);
    }

    public boolean isActive() {
        return StringUtils.isNotEmpty(state) && state.equals("active");
    }
}
