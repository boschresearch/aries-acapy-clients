/*
 * aca-py api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.6.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.hyperledger.acy_py.generated.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * IndyCredInfo
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class IndyCredInfo {
    public static final String SERIALIZED_NAME_ATTRS = "attrs";
    @SerializedName(SERIALIZED_NAME_ATTRS)
    private Map<String, String> attrs = null;
    public static final String SERIALIZED_NAME_CRED_DEF_ID = "cred_def_id";
    @SerializedName(SERIALIZED_NAME_CRED_DEF_ID)
    private String credDefId;
    public static final String SERIALIZED_NAME_CRED_REV = "cred_rev";
    @SerializedName(SERIALIZED_NAME_CRED_REV)
    private String credRev;
    public static final String SERIALIZED_NAME_REFERENT = "referent";
    @SerializedName(SERIALIZED_NAME_REFERENT)
    private String referent;
    public static final String SERIALIZED_NAME_REV_REG_ID = "rev_reg_id";
    @SerializedName(SERIALIZED_NAME_REV_REG_ID)
    private String revRegId;
    public static final String SERIALIZED_NAME_SCHEMA_ID = "schema_id";
    @SerializedName(SERIALIZED_NAME_SCHEMA_ID)
    private String schemaId;
}
