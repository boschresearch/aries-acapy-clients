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
import org.hyperledger.acy_py.generated.model.AMLRecord;
import org.hyperledger.acy_py.generated.model.TAAAcceptance;
import org.hyperledger.acy_py.generated.model.TAARecord;

/**
 * TAAInfo
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class TAAInfo {
    public static final String SERIALIZED_NAME_AML_RECORD = "aml_record";
    @SerializedName(SERIALIZED_NAME_AML_RECORD)
    private AMLRecord amlRecord;
    public static final String SERIALIZED_NAME_TAA_ACCEPTED = "taa_accepted";
    @SerializedName(SERIALIZED_NAME_TAA_ACCEPTED)
    private TAAAcceptance taaAccepted;
    public static final String SERIALIZED_NAME_TAA_RECORD = "taa_record";
    @SerializedName(SERIALIZED_NAME_TAA_RECORD)
    private TAARecord taaRecord;
    public static final String SERIALIZED_NAME_TAA_REQUIRED = "taa_required";
    @SerializedName(SERIALIZED_NAME_TAA_REQUIRED)
    private Boolean taaRequired;
}
