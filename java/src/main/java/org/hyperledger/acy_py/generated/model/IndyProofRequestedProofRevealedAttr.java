/*
 * aca-py client
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.7.0-pre1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.hyperledger.acy_py.generated.model;

import com.google.gson.annotations.SerializedName;

/**
 * IndyProofRequestedProofRevealedAttr
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class IndyProofRequestedProofRevealedAttr {
    public static final String SERIALIZED_NAME_ENCODED = "encoded";
    @SerializedName(SERIALIZED_NAME_ENCODED)
    private String encoded;
    public static final String SERIALIZED_NAME_RAW = "raw";
    @SerializedName(SERIALIZED_NAME_RAW)
    private String raw;
    public static final String SERIALIZED_NAME_SUB_PROOF_INDEX = "sub_proof_index";
    @SerializedName(SERIALIZED_NAME_SUB_PROOF_INDEX)
    private Integer subProofIndex;
}
