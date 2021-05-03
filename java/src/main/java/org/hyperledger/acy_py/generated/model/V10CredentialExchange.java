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
* V10CredentialExchange
*/

@lombok.Data @lombok.AllArgsConstructor @lombok.NoArgsConstructor @lombok.Builder
public class V10CredentialExchange {
        public static final String SERIALIZED_NAME_AUTO_ISSUE = "auto_issue";
        @SerializedName(SERIALIZED_NAME_AUTO_ISSUE)
        private Boolean autoIssue;
        public static final String SERIALIZED_NAME_AUTO_OFFER = "auto_offer";
        @SerializedName(SERIALIZED_NAME_AUTO_OFFER)
        private Boolean autoOffer;
        public static final String SERIALIZED_NAME_AUTO_REMOVE = "auto_remove";
        @SerializedName(SERIALIZED_NAME_AUTO_REMOVE)
        private Boolean autoRemove;
        public static final String SERIALIZED_NAME_CONNECTION_ID = "connection_id";
        @SerializedName(SERIALIZED_NAME_CONNECTION_ID)
        private String connectionId;
        public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
        @SerializedName(SERIALIZED_NAME_CREATED_AT)
        private String createdAt;
        public static final String SERIALIZED_NAME_CREDENTIAL = "credential";
        @SerializedName(SERIALIZED_NAME_CREDENTIAL)
        private Object credential;
        public static final String SERIALIZED_NAME_CREDENTIAL_DEFINITION_ID = "credential_definition_id";
        @SerializedName(SERIALIZED_NAME_CREDENTIAL_DEFINITION_ID)
        private String credentialDefinitionId;
        public static final String SERIALIZED_NAME_CREDENTIAL_EXCHANGE_ID = "credential_exchange_id";
        @SerializedName(SERIALIZED_NAME_CREDENTIAL_EXCHANGE_ID)
        private String credentialExchangeId;
        public static final String SERIALIZED_NAME_CREDENTIAL_ID = "credential_id";
        @SerializedName(SERIALIZED_NAME_CREDENTIAL_ID)
        private String credentialId;
        public static final String SERIALIZED_NAME_CREDENTIAL_OFFER = "credential_offer";
        @SerializedName(SERIALIZED_NAME_CREDENTIAL_OFFER)
        private Object credentialOffer;
        public static final String SERIALIZED_NAME_CREDENTIAL_OFFER_DICT = "credential_offer_dict";
        @SerializedName(SERIALIZED_NAME_CREDENTIAL_OFFER_DICT)
        private Object credentialOfferDict;
        public static final String SERIALIZED_NAME_CREDENTIAL_PROPOSAL_DICT = "credential_proposal_dict";
        @SerializedName(SERIALIZED_NAME_CREDENTIAL_PROPOSAL_DICT)
        private Object credentialProposalDict;
        public static final String SERIALIZED_NAME_CREDENTIAL_REQUEST = "credential_request";
        @SerializedName(SERIALIZED_NAME_CREDENTIAL_REQUEST)
        private Object credentialRequest;
        public static final String SERIALIZED_NAME_CREDENTIAL_REQUEST_METADATA = "credential_request_metadata";
        @SerializedName(SERIALIZED_NAME_CREDENTIAL_REQUEST_METADATA)
        private Object credentialRequestMetadata;
        public static final String SERIALIZED_NAME_ERROR_MSG = "error_msg";
        @SerializedName(SERIALIZED_NAME_ERROR_MSG)
        private String errorMsg;
              /**
   * Issue-credential exchange initiator: self or external
   */
  @JsonAdapter(InitiatorEnum.Adapter.class)
  public enum InitiatorEnum {
    SELF("self"),
    
    EXTERNAL("external");

    private String value;

    InitiatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InitiatorEnum fromValue(String value) {
      for (InitiatorEnum b : InitiatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<InitiatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InitiatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InitiatorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return InitiatorEnum.fromValue(value);
      }
    }
  }

        public static final String SERIALIZED_NAME_INITIATOR = "initiator";
        @SerializedName(SERIALIZED_NAME_INITIATOR)
        private InitiatorEnum initiator;
        public static final String SERIALIZED_NAME_PARENT_THREAD_ID = "parent_thread_id";
        @SerializedName(SERIALIZED_NAME_PARENT_THREAD_ID)
        private String parentThreadId;
        public static final String SERIALIZED_NAME_RAW_CREDENTIAL = "raw_credential";
        @SerializedName(SERIALIZED_NAME_RAW_CREDENTIAL)
        private Object rawCredential;
        public static final String SERIALIZED_NAME_REVOC_REG_ID = "revoc_reg_id";
        @SerializedName(SERIALIZED_NAME_REVOC_REG_ID)
        private String revocRegId;
        public static final String SERIALIZED_NAME_REVOCATION_ID = "revocation_id";
        @SerializedName(SERIALIZED_NAME_REVOCATION_ID)
        private String revocationId;
              /**
   * Issue-credential exchange role: holder or issuer
   */
  @JsonAdapter(RoleEnum.Adapter.class)
  public enum RoleEnum {
    HOLDER("holder"),
    
    ISSUER("issuer");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RoleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RoleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RoleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RoleEnum.fromValue(value);
      }
    }
  }

        public static final String SERIALIZED_NAME_ROLE = "role";
        @SerializedName(SERIALIZED_NAME_ROLE)
        private RoleEnum role;
        public static final String SERIALIZED_NAME_SCHEMA_ID = "schema_id";
        @SerializedName(SERIALIZED_NAME_SCHEMA_ID)
        private String schemaId;
        public static final String SERIALIZED_NAME_STATE = "state";
        @SerializedName(SERIALIZED_NAME_STATE)
        private String state;
        public static final String SERIALIZED_NAME_THREAD_ID = "thread_id";
        @SerializedName(SERIALIZED_NAME_THREAD_ID)
        private String threadId;
        public static final String SERIALIZED_NAME_TRACE = "trace";
        @SerializedName(SERIALIZED_NAME_TRACE)
        private Boolean trace;
        public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
        @SerializedName(SERIALIZED_NAME_UPDATED_AT)
        private String updatedAt;
}
