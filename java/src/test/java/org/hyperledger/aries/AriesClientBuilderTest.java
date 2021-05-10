/*
 * Copyright (c) 2020-2021 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries;

import okhttp3.OkHttpClient;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;

class AriesClientBuilderTest {

    @Test
    void testEmptyUrl() {
        assertThrows(NullPointerException.class, () -> AriesClient.builder().url(null).build());
    }

    @Test
    void testBuild() {
        final String url = "https://foo.fr";
        AriesClient.builder().url(url).build();

        AriesClient.builder().url(url).apiKey(null).build();
        AriesClient.builder().url(url).apiKey("123").build();

        AriesClient.builder().url(url).apiKey(null).client(null).build();
        AriesClient.builder().url(url).apiKey(null).client(new OkHttpClient()).build();
    }

}
