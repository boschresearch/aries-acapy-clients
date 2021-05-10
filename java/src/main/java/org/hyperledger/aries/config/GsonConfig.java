/*
 * Copyright (c) 2020-2021 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.config;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonConfig {

    /**
     * Builder based on aca-py's default field naming strategy
     * @return {@link Gson}
     */
    public static Gson defaultConfig() {
        return defaultBuilder()
                .create()
                ;
    }

    public static Gson prettyPrinter() {
        return defaultBuilder()
                .setPrettyPrinting()
                .create()
                ;
    }

    /**
     * Matches jackson's default serialization/deserialization behaviour
     * @return {@link Gson}
     */
    public static Gson jacksonBehaviour() {
        return new GsonBuilder()
                .serializeNulls()
                .create()
                ;
    }

    private static GsonBuilder defaultBuilder() {
        return new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                ;
    }
}
