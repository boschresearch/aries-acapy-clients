/*
 * aca-py client
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.7.0-pre2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.hyperledger.acy_py.generated.model;

import com.google.gson.annotations.SerializedName;

/**
 * CredentialDefinition
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class CredentialDefinition {
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private String id;
    public static final String SERIALIZED_NAME_SCHEMA_ID = "schemaId";
    @SerializedName(SERIALIZED_NAME_SCHEMA_ID)
    private String schemaId;
    public static final String SERIALIZED_NAME_TAG = "tag";
    @SerializedName(SERIALIZED_NAME_TAG)
    private String tag;
    public static final String SERIALIZED_NAME_TYPE = "type";
    @SerializedName(SERIALIZED_NAME_TYPE)
    private Object type;
    public static final String SERIALIZED_NAME_VALUE = "value";
    @SerializedName(SERIALIZED_NAME_VALUE)
    private CredDefValue value;
    public static final String SERIALIZED_NAME_VER = "ver";
    @SerializedName(SERIALIZED_NAME_VER)
    private String ver;
}
