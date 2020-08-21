/**
 * Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.credential;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.List;
import java.util.Map;

import org.hyperledger.aries.pojo.PojoProcessor;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data @NoArgsConstructor @AllArgsConstructor
public class Credential {

    private String referent;

    private Map<String, String> attrs;

    private String schemaId;

    @SerializedName(value = "credential_definition_id", alternate = "cred_def_id")
    private String credentialDefinitionId;

    private String revRegId;

    private String credRevId;

    /**
     * Maps the credential attributes into an instance of the provided class type.
     * @param <T> The class type
     * @param type The class type
     * @return Instantiated type with all matching properties set
     */
    public <T> T to(@NonNull Class<T> type) {
        T result = PojoProcessor.getInstance(type);

        List<Field> fields = PojoProcessor.fields(type);
        AccessController.doPrivileged((PrivilegedAction<Void>) () -> {
            for(Field field: fields) {
                String fieldName = PojoProcessor.fieldName(field);
                String fieldValue = attrs.get(fieldName);
                try {
                    field.setAccessible(true);
                    field.set(result, fieldValue);
                } catch (IllegalAccessException | IllegalArgumentException e) {
                    log.error("Could not set value of field: {} to: {}", fieldName, fieldValue, e);
                }
            }
            return null; // nothing to return
        });
        return result;
    }
}
