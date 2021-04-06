/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.proof;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hyperledger.aries.api.proof.PresentProofRequest.ProofRequest;
import org.hyperledger.aries.pojo.AttributeName;
import org.hyperledger.aries.webhook.EventParser;

import java.util.Dictionary;
import java.util.List;
import java.util.Map;
import java.util.Set;



@Data @NoArgsConstructor @AllArgsConstructor
public class PresentationRequestCredential {

/*
Endpoint that returns this shape
https://aries-cloud-agent-python.readthedocs.io/en/latest/_modules/aries_cloudagent/protocols/present_proof/v1_0/routes/#presentation_exchange_credentials_list

Shape of response
https://aries-cloud-agent-python.readthedocs.io/en/latest/generated/aries_cloudagent.protocols.present_proof.v1_0/?highlight=IndyCredPrecisSchema#aries_cloudagent.protocols.present_proof.v1_0.routes.IndyCredPrecisSchema

Swagger doc reponse
[
  {
    "cred_def_id": "WgWxqztrNooG92RXvxSTWv:3:CL:20:tag",
    "cred_info": {
      "attrs": {
        "additionalProp1": "24",
        "additionalProp2": "24",
        "additionalProp3": "24"
      },
      "referent": "3fa85f64-5717-4562-b3fc-2c963f66afa6"
    },
    "cred_rev": "12345",
    "interval": {
      "to": 1617739946
    },
    "presentation_referents": [
      "1_age_uuid"
    ],
    "rev_reg_id": "WgWxqztrNooG92RXvxSTWv:4:WgWxqztrNooG92RXvxSTWv:3:CL:20:tag:CL_ACCUM:0",
    "schema_id": "WgWxqztrNooG92RXvxSTWv:2:schema_name:1.0"
  }
]

---example response

[
  {
    "cred_info": {
      "referent": "678c9dc0-f4d5-4f06-8065-cc96be08bdad",
      "attrs": {
        "name": "dev bpa"
      },
      "schema_id": "Jwej9hnHDh3nSU3G7E447W:2:abc-schema:1.0",
      "cred_def_id": "Jwej9hnHDh3nSU3G7E447W:3:CL:12:default",
      "rev_reg_id": null,
      "cred_rev_id": null
    },
    "interval": null,
    "presentation_referents": [
      "name"
    ]
  },
  {
    "cred_info": {
      "referent": "c42c943d-a043-4d16-8eb0-d6a939178ad7",
      "attrs": {
        "name": "the new one. do not delete me"
      },
      "schema_id": "Jwej9hnHDh3nSU3G7E447W:2:abc-schema:1.0",
      "cred_def_id": "Jwej9hnHDh3nSU3G7E447W:3:CL:12:default",
      "rev_reg_id": null,
      "cred_rev_id": null
    },
    "interval": null,
    "presentation_referents": [
      "name"
    ]
  }
]

*/
    @SerializedName(value = "cred_def_id", alternate = "credential_definition_id")
    private String credentialDefinitionId;

    @SerializedName(value = "cred_info", alternate = "credential_info")
    private Dictionary credentialInfo;

    @SerializedName(value = "cred_rev", alternate = "credential_revision")
    private String credentialRevision;

    private Dictionary interval

    @SerializedName(value = "presentation_referents")
    private List<String> presentationReferents;

    @SerializedName(value = "rev_reg_id")
    private String revregid;

    private String schemaId;

}
