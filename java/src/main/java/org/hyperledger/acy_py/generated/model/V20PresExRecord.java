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
* V20PresExRecord
*/

@lombok.Data @lombok.AllArgsConstructor @lombok.NoArgsConstructor @lombok.Builder
public class V20PresExRecord {
        public static final String SERIALIZED_NAME_AUTO_PRESENT = "auto_present";
        @SerializedName(SERIALIZED_NAME_AUTO_PRESENT)
        private Boolean autoPresent;
        public static final String SERIALIZED_NAME_BY_FORMAT = "by_format";
        @SerializedName(SERIALIZED_NAME_BY_FORMAT)
        private Object byFormat;
        public static final String SERIALIZED_NAME_CONNECTION_ID = "connection_id";
        @SerializedName(SERIALIZED_NAME_CONNECTION_ID)
        private String connectionId;
        public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
        @SerializedName(SERIALIZED_NAME_CREATED_AT)
        private String createdAt;
        public static final String SERIALIZED_NAME_ERROR_MSG = "error_msg";
        @SerializedName(SERIALIZED_NAME_ERROR_MSG)
        private String errorMsg;
              /**
   * Present-proof exchange initiator: self or external
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
        public static final String SERIALIZED_NAME_PRES = "pres";
        @SerializedName(SERIALIZED_NAME_PRES)
        private Object pres;
        public static final String SERIALIZED_NAME_PRES_EX_ID = "pres_ex_id";
        @SerializedName(SERIALIZED_NAME_PRES_EX_ID)
        private String presExId;
        public static final String SERIALIZED_NAME_PRES_PROPOSAL = "pres_proposal";
        @SerializedName(SERIALIZED_NAME_PRES_PROPOSAL)
        private Object presProposal;
        public static final String SERIALIZED_NAME_PRES_REQUEST = "pres_request";
        @SerializedName(SERIALIZED_NAME_PRES_REQUEST)
        private Object presRequest;
              /**
   * Present-proof exchange role: prover or verifier
   */
  @JsonAdapter(RoleEnum.Adapter.class)
  public enum RoleEnum {
    PROVER("prover"),
    
    VERIFIER("verifier");

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
              /**
   * Present-proof exchange state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    PROPOSAL_SENT("proposal-sent"),
    
    PROPOSAL_RECEIVED("proposal-received"),
    
    REQUEST_SENT("request-sent"),
    
    REQUEST_RECEIVED("request-received"),
    
    PRESENTATION_SENT("presentation-sent"),
    
    PRESENTATION_RECEIVED("presentation-received"),
    
    DONE("done"),
    
    ABANDONED("abandoned");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

        public static final String SERIALIZED_NAME_STATE = "state";
        @SerializedName(SERIALIZED_NAME_STATE)
        private StateEnum state;
        public static final String SERIALIZED_NAME_THREAD_ID = "thread_id";
        @SerializedName(SERIALIZED_NAME_THREAD_ID)
        private String threadId;
        public static final String SERIALIZED_NAME_TRACE = "trace";
        @SerializedName(SERIALIZED_NAME_TRACE)
        private Boolean trace;
        public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
        @SerializedName(SERIALIZED_NAME_UPDATED_AT)
        private String updatedAt;
              /**
   * Whether presentation is verified: &#39;true&#39; or &#39;false&#39;
   */
  @JsonAdapter(VerifiedEnum.Adapter.class)
  public enum VerifiedEnum {
    TRUE("true"),
    
    FALSE("false");

    private String value;

    VerifiedEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VerifiedEnum fromValue(String value) {
      for (VerifiedEnum b : VerifiedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VerifiedEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VerifiedEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VerifiedEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VerifiedEnum.fromValue(value);
      }
    }
  }

        public static final String SERIALIZED_NAME_VERIFIED = "verified";
        @SerializedName(SERIALIZED_NAME_VERIFIED)
        private VerifiedEnum verified;
}
