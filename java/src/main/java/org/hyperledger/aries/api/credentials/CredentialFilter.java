/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.credentials;

import lombok.NonNull;

import java.util.function.Predicate;

public class CredentialFilter {

    public static Predicate<Credential> credentialDefinitionId(
            @NonNull String credentialDefinitionId) {
        return c -> credentialDefinitionId.equals(c.getCredentialDefinitionId());
    }

    public static Predicate<Credential> schemaId(
            @NonNull String schemaId) {
        return c -> schemaId.equals(c.getSchemaId());
    }
}
