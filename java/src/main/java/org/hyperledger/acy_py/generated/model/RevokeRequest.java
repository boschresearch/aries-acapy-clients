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

/**
* RevokeRequest
*/

@lombok.Data @lombok.AllArgsConstructor @lombok.NoArgsConstructor @lombok.Builder
public class RevokeRequest {
        public static final String SERIALIZED_NAME_CRED_EX_ID = "cred_ex_id";
        @SerializedName(SERIALIZED_NAME_CRED_EX_ID)
        private String credExId;
        public static final String SERIALIZED_NAME_CRED_REV_ID = "cred_rev_id";
        @SerializedName(SERIALIZED_NAME_CRED_REV_ID)
        private String credRevId;
        public static final String SERIALIZED_NAME_PUBLISH = "publish";
        @SerializedName(SERIALIZED_NAME_PUBLISH)
        private Boolean publish;
        public static final String SERIALIZED_NAME_REV_REG_ID = "rev_reg_id";
        @SerializedName(SERIALIZED_NAME_REV_REG_ID)
        private String revRegId;
}
