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
import java.util.ArrayList;
import java.util.List;
import org.hyperledger.acy_py.generated.model.AttachmentDef;

/**
* InvitationCreateRequest
*/

@lombok.Data @lombok.AllArgsConstructor @lombok.NoArgsConstructor @lombok.Builder
public class InvitationCreateRequest {
        public static final String SERIALIZED_NAME_ALIAS = "alias";
        @SerializedName(SERIALIZED_NAME_ALIAS)
        private String alias;
        public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
        @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
        private List<AttachmentDef> attachments = null;
        public static final String SERIALIZED_NAME_HANDSHAKE_PROTOCOLS = "handshake_protocols";
        @SerializedName(SERIALIZED_NAME_HANDSHAKE_PROTOCOLS)
        private List<String> handshakeProtocols = null;
        public static final String SERIALIZED_NAME_MEDIATION_ID = "mediation_id";
        @SerializedName(SERIALIZED_NAME_MEDIATION_ID)
        private String mediationId;
        public static final String SERIALIZED_NAME_METADATA = "metadata";
        @SerializedName(SERIALIZED_NAME_METADATA)
        private Object metadata;
        public static final String SERIALIZED_NAME_MY_LABEL = "my_label";
        @SerializedName(SERIALIZED_NAME_MY_LABEL)
        private String myLabel;
        public static final String SERIALIZED_NAME_USE_PUBLIC_DID = "use_public_did";
        @SerializedName(SERIALIZED_NAME_USE_PUBLIC_DID)
        private Boolean usePublicDid;
}
