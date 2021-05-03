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
* ConnectionStaticRequest
*/

@lombok.Data @lombok.AllArgsConstructor @lombok.NoArgsConstructor @lombok.Builder
public class ConnectionStaticRequest {
        public static final String SERIALIZED_NAME_ALIAS = "alias";
        @SerializedName(SERIALIZED_NAME_ALIAS)
        private String alias;
        public static final String SERIALIZED_NAME_MY_DID = "my_did";
        @SerializedName(SERIALIZED_NAME_MY_DID)
        private String myDid;
        public static final String SERIALIZED_NAME_MY_SEED = "my_seed";
        @SerializedName(SERIALIZED_NAME_MY_SEED)
        private String mySeed;
        public static final String SERIALIZED_NAME_THEIR_DID = "their_did";
        @SerializedName(SERIALIZED_NAME_THEIR_DID)
        private String theirDid;
        public static final String SERIALIZED_NAME_THEIR_ENDPOINT = "their_endpoint";
        @SerializedName(SERIALIZED_NAME_THEIR_ENDPOINT)
        private String theirEndpoint;
        public static final String SERIALIZED_NAME_THEIR_LABEL = "their_label";
        @SerializedName(SERIALIZED_NAME_THEIR_LABEL)
        private String theirLabel;
        public static final String SERIALIZED_NAME_THEIR_SEED = "their_seed";
        @SerializedName(SERIALIZED_NAME_THEIR_SEED)
        private String theirSeed;
        public static final String SERIALIZED_NAME_THEIR_VERKEY = "their_verkey";
        @SerializedName(SERIALIZED_NAME_THEIR_VERKEY)
        private String theirVerkey;
}