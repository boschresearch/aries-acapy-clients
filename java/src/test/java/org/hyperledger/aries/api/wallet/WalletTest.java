/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.wallet;

import lombok.extern.slf4j.Slf4j;
import org.hyperledger.aries.IntegrationTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
public class WalletTest extends IntegrationTestBase {

    @Test
    void testCreateAndListWalletDids() throws Exception {

        // as the wallet is empty by default create local did first
        final Optional<WalletDidResponse> localDid = ac.walletDidCreate();
        Assertions.assertTrue(localDid.isPresent());
        Assertions.assertNotNull(localDid.get().getVerkey());

        // list all dids
        final Optional<List<WalletDidResponse>> walletDid = ac.walletDid();
        Assertions.assertTrue(walletDid.isPresent());
        Assertions.assertEquals(1, walletDid.get().size());
        walletDid.get().forEach(did -> log.debug("{}", did));
    }

    @Test
    void testGetPublicDid() throws Exception {
        final Optional<WalletDidResponse> publicDid = ac.walletDidPublic();
        Assertions.assertTrue(publicDid.isEmpty());
    }

    @Test
    void testSetGetDidEndpoint() throws Exception {
        final Optional<WalletDidResponse> localDid = ac.walletDidCreate();
        Assertions.assertTrue(localDid.isPresent());

        final String url = "http://localhost:8031";
        SetDidEndpointRequest req = SetDidEndpointRequest
                .builder()
                .endpoint(url)
                .did(localDid.get().getDid())
                .build();
        ac.walletSetDidEndpoint(req);

        final Optional<GetDidEndpointResponse> endp = ac.walletGetDidEndpoint(localDid.get().getDid());
        Assertions.assertTrue(endp.isPresent());
        Assertions.assertEquals(url, endp.get().getEndpoint());
    }
}
