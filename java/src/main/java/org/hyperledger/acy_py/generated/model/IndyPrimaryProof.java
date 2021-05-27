/*
 * aca-py client
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.7.0-pre2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.hyperledger.acy_py.generated.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * IndyPrimaryProof
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class IndyPrimaryProof {
    public static final String SERIALIZED_NAME_EQ_PROOF = "eq_proof";
    @SerializedName(SERIALIZED_NAME_EQ_PROOF)
    private IndyEQProof eqProof;
    public static final String SERIALIZED_NAME_GE_PROOFS = "ge_proofs";
    @SerializedName(SERIALIZED_NAME_GE_PROOFS)
    private List<IndyGEProof> geProofs = null;
}
