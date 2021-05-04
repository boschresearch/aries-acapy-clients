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
 * ConnRecord
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class ConnRecord {
    /**
     * Connection acceptance: manual or auto
     */
    @JsonAdapter(AcceptEnum.Adapter.class)
    public enum AcceptEnum {
        MANUAL("manual"),

        AUTO("auto");

        private String value;

        AcceptEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static AcceptEnum fromValue(String value) {
            for (AcceptEnum b : AcceptEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<AcceptEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final AcceptEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public AcceptEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return AcceptEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_ACCEPT = "accept";
    @SerializedName(SERIALIZED_NAME_ACCEPT)
    private AcceptEnum accept;
    public static final String SERIALIZED_NAME_ALIAS = "alias";
    @SerializedName(SERIALIZED_NAME_ALIAS)
    private String alias;
    public static final String SERIALIZED_NAME_CONNECTION_ID = "connection_id";
    @SerializedName(SERIALIZED_NAME_CONNECTION_ID)
    private String connectionId;
    public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private String createdAt;
    public static final String SERIALIZED_NAME_ERROR_MSG = "error_msg";
    @SerializedName(SERIALIZED_NAME_ERROR_MSG)
    private String errorMsg;
    public static final String SERIALIZED_NAME_INBOUND_CONNECTION_ID = "inbound_connection_id";
    @SerializedName(SERIALIZED_NAME_INBOUND_CONNECTION_ID)
    private String inboundConnectionId;
    public static final String SERIALIZED_NAME_INVITATION_KEY = "invitation_key";
    @SerializedName(SERIALIZED_NAME_INVITATION_KEY)
    private String invitationKey;

    /**
     * Invitation mode
     */
    @JsonAdapter(InvitationModeEnum.Adapter.class)
    public enum InvitationModeEnum {
        ONCE("once"),

        MULTI("multi"),

        STATIC("static");

        private String value;

        InvitationModeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static InvitationModeEnum fromValue(String value) {
            for (InvitationModeEnum b : InvitationModeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<InvitationModeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final InvitationModeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public InvitationModeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return InvitationModeEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_INVITATION_MODE = "invitation_mode";
    @SerializedName(SERIALIZED_NAME_INVITATION_MODE)
    private InvitationModeEnum invitationMode;
    public static final String SERIALIZED_NAME_INVITATION_MSG_ID = "invitation_msg_id";
    @SerializedName(SERIALIZED_NAME_INVITATION_MSG_ID)
    private String invitationMsgId;
    public static final String SERIALIZED_NAME_MY_DID = "my_did";
    @SerializedName(SERIALIZED_NAME_MY_DID)
    private String myDid;
    public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
    @SerializedName(SERIALIZED_NAME_REQUEST_ID)
    private String requestId;
    public static final String SERIALIZED_NAME_RFC23_STATE = "rfc23_state";
    @SerializedName(SERIALIZED_NAME_RFC23_STATE)
    private String rfc23State;

    /**
     * Routing state of connection
     */
    @JsonAdapter(RoutingStateEnum.Adapter.class)
    public enum RoutingStateEnum {
        NONE("none"),

        REQUEST("request"),

        ACTIVE("active"),

        ERROR("error");

        private String value;

        RoutingStateEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static RoutingStateEnum fromValue(String value) {
            for (RoutingStateEnum b : RoutingStateEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<RoutingStateEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final RoutingStateEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public RoutingStateEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return RoutingStateEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_ROUTING_STATE = "routing_state";
    @SerializedName(SERIALIZED_NAME_ROUTING_STATE)
    private RoutingStateEnum routingState;
    public static final String SERIALIZED_NAME_STATE = "state";
    @SerializedName(SERIALIZED_NAME_STATE)
    private String state;
    public static final String SERIALIZED_NAME_THEIR_DID = "their_did";
    @SerializedName(SERIALIZED_NAME_THEIR_DID)
    private String theirDid;
    public static final String SERIALIZED_NAME_THEIR_LABEL = "their_label";
    @SerializedName(SERIALIZED_NAME_THEIR_LABEL)
    private String theirLabel;
    public static final String SERIALIZED_NAME_THEIR_PUBLIC_DID = "their_public_did";
    @SerializedName(SERIALIZED_NAME_THEIR_PUBLIC_DID)
    private String theirPublicDid;

    /**
     * Their role in the connection protocol
     */
    @JsonAdapter(TheirRoleEnum.Adapter.class)
    public enum TheirRoleEnum {
        INVITEE("invitee"),

        REQUESTER("requester"),

        INVITER("inviter"),

        RESPONDER("responder");

        private String value;

        TheirRoleEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TheirRoleEnum fromValue(String value) {
            for (TheirRoleEnum b : TheirRoleEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<TheirRoleEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final TheirRoleEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TheirRoleEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TheirRoleEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_THEIR_ROLE = "their_role";
    @SerializedName(SERIALIZED_NAME_THEIR_ROLE)
    private TheirRoleEnum theirRole;
    public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
    @SerializedName(SERIALIZED_NAME_UPDATED_AT)
    private String updatedAt;
}
