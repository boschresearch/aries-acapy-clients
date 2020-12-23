/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.config;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonConfig {

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

    private static GsonBuilder defaultBuilder() {
        return new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                ;
    }
}
