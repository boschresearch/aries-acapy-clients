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
import org.hyperledger.acy_py.generated.model.ConnRecord;

/**
* ConnectionStaticResult
*/

@lombok.Data @lombok.AllArgsConstructor @lombok.NoArgsConstructor @lombok.Builder
public class ConnectionStaticResult {
        public static final String SERIALIZED_NAME_MV_VERKEY = "mv_verkey";
        @SerializedName(SERIALIZED_NAME_MV_VERKEY)
        private String mvVerkey;
        public static final String SERIALIZED_NAME_MY_DID = "my_did";
        @SerializedName(SERIALIZED_NAME_MY_DID)
        private String myDid;
        public static final String SERIALIZED_NAME_MY_ENDPOINT = "my_endpoint";
        @SerializedName(SERIALIZED_NAME_MY_ENDPOINT)
        private String myEndpoint;
        public static final String SERIALIZED_NAME_RECORD = "record";
        @SerializedName(SERIALIZED_NAME_RECORD)
        private ConnRecord record;
        public static final String SERIALIZED_NAME_THEIR_DID = "their_did";
        @SerializedName(SERIALIZED_NAME_THEIR_DID)
        private String theirDid;
        public static final String SERIALIZED_NAME_THEIR_VERKEY = "their_verkey";
        @SerializedName(SERIALIZED_NAME_THEIR_VERKEY)
        private String theirVerkey;
}
