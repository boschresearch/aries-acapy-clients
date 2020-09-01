/**
 * Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.credential;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;

import org.hyperledger.aries.pojo.AttributeName;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data @NoArgsConstructor @AllArgsConstructor
public class CredentialAttributes {

    private String name;
    private String value;
    @SerializedName(value = "mime-type")
    private String mimeType;

    public CredentialAttributes(String name, String value) {
        super();
        this.name = name;
        this.value = value;
    }
    public static <T> List<CredentialAttributes> from(@NonNull T instance) {
        List<CredentialAttributes> result = new ArrayList<>();
        Field[] fields = instance.getClass().getDeclaredFields();
        AccessController.doPrivileged((PrivilegedAction<Void>) () -> {
            for (int i = 0; i < fields.length; i++) {
                String fieldName = fields[i].getName();
                AttributeName a = fields[i].getAnnotation(AttributeName.class);
                if (a == null || !a.excluded()) {
                    String fieldValue = "";
                    try {
                        fields[i].setAccessible(true);
                        Object fv = fields[i].get(instance);
                        if (fv != null) {
                            fieldValue = fv.toString();
                        }
                    } catch (IllegalAccessException | IllegalArgumentException e) {
                        log.error("Could not get value of field: {}", fieldName, e);
                    }
                    result.add(new CredentialAttributes(fieldName, fieldValue));
                }
            }
            return null; // nothing to return
        });
        return result;
    }
}
