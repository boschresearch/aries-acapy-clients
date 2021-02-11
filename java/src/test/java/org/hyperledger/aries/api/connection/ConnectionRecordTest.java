/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.connection;

import lombok.extern.slf4j.Slf4j;
import org.hyperledger.aries.IntegrationTestBase;
import org.hyperledger.aries.api.exception.AriesException;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
public class ConnectionRecordTest extends IntegrationTestBase {

    @Test
    void testDeleteConnection() {
        assertThrows(AriesException.class, () -> ac.connectionsRemove("1"));
    }

    @Test
    void testGetConnections() throws Exception {
        final Optional<List<ConnectionRecord>> connections = ac.connections(
                ConnectionFilter.builder().state(ConnectionState.active).build());
        assertTrue(connections.isPresent());
        assertEquals(0, connections.get().size());
    }

    @Test
    void testGetConnectionsWrongFilter() {
        assertThrows(AriesException.class, () -> ac.connections(
            ConnectionFilter.builder().myDid("wrong_format").build()));
    }

    @Test
    void testCreateInvitation() throws Exception {
        final Optional<CreateInvitationResponse> inv = ac.connectionsCreateInvitation(
                CreateInvitationRequest
                        .builder()
                        .recipientKeys(List.of())
                        .build(),
                CreateInvitationParams
                        .builder()
                        .autoAccept(Boolean.TRUE)
                        .build());
        assertTrue(inv.isPresent());
        assertNotNull(inv.get().getInvitationUrl());
        log.debug("{}", inv.get());
    }
}
