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
* EndorserInfo
*/

@lombok.Data @lombok.AllArgsConstructor @lombok.NoArgsConstructor @lombok.Builder
public class EndorserInfo {
        public static final String SERIALIZED_NAME_ENDORSER_DID = "endorser_did";
        @SerializedName(SERIALIZED_NAME_ENDORSER_DID)
        private String endorserDid;
        public static final String SERIALIZED_NAME_ENDORSER_NAME = "endorser_name";
        @SerializedName(SERIALIZED_NAME_ENDORSER_NAME)
        private String endorserName;
}
