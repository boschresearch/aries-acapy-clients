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

import java.util.List;

/**
 * Schema
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class Schema {
    public static final String SERIALIZED_NAME_ATTR_NAMES = "attrNames";
    @SerializedName(SERIALIZED_NAME_ATTR_NAMES)
    private List<String> attrNames = null;
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private String id;
    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;
    public static final String SERIALIZED_NAME_SEQ_NO = "seqNo";
    @SerializedName(SERIALIZED_NAME_SEQ_NO)
    private Integer seqNo;
    public static final String SERIALIZED_NAME_VER = "ver";
    @SerializedName(SERIALIZED_NAME_VER)
    private String ver;
    public static final String SERIALIZED_NAME_VERSION = "version";
    @SerializedName(SERIALIZED_NAME_VERSION)
    private String version;
}
