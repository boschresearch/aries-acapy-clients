/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.proof;

import lombok.NonNull;
import org.hyperledger.aries.api.credential.Credential;
import org.hyperledger.aries.api.proof.PresentProofProposal.PresentationPreview;
import org.hyperledger.aries.api.proof.PresentProofProposal.PresentationPreview.PresAttrSpec;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Helper class to build a {@link PresentProofProposal}
 *
 */
public class PresentProofProposalBuilder {

    /**
     * Usecase: send a single wallet credential to a connection.
     * @param cred {@link Credential}
     * @return simple {@link PresentProofProposal} without any predicates set
     */
    public static PresentProofProposal fromCredential(@NonNull String connectionId, @NonNull Credential cred) {
        final Map<String, String> attrs = cred.getAttrs();
        List<PresAttrSpec> presAttr = new ArrayList<>();
        attrs.forEach( (k, v) -> presAttr.add(PresAttrSpec
                .builder()
                .name(k)
                .value(v)
                .credentialDefinitionId(cred.getCredentialDefinitionId())
                .referent(cred.getReferent())
                .build()));
        return PresentProofProposal
                .builder()
                .presentationProposal(PresentationPreview.builder().attributes(presAttr).build())
                .connectionId(connectionId)
                .build();
    }
}
