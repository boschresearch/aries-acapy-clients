/*
 * Copyright (c) 2021 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.config;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Optional;

public class TimeUtilTest {

    @Test
    void testParseFromString() {
        Optional<Instant> i = TimeUtil.from("2020-10-22 12:43:42.230818Z");
        Assertions.assertTrue(i.isPresent());
        Assertions.assertTrue(i.get().isBefore(Instant.now()));

        i = TimeUtil.from("");
        Assertions.assertFalse(i.isPresent());
    }
}
