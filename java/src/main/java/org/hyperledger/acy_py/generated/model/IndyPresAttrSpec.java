/*
 * aca-py client
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.7.0-pre1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.hyperledger.acy_py.generated.model;

import com.google.gson.annotations.SerializedName;

/**
 * IndyPresAttrSpec
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class IndyPresAttrSpec {
    public static final String SERIALIZED_NAME_CRED_DEF_ID = "cred_def_id";
    @SerializedName(SERIALIZED_NAME_CRED_DEF_ID)
    private String credDefId;
    public static final String SERIALIZED_NAME_MIME_TYPE = "mime-type";
    @SerializedName(SERIALIZED_NAME_MIME_TYPE)
    private String mimeType;
    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;
    public static final String SERIALIZED_NAME_REFERENT = "referent";
    @SerializedName(SERIALIZED_NAME_REFERENT)
    private String referent;
    public static final String SERIALIZED_NAME_VALUE = "value";
    @SerializedName(SERIALIZED_NAME_VALUE)
    private String value;
}
