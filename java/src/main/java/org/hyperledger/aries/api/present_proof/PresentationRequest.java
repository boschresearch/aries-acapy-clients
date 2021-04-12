/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.present_proof;

import lombok.Builder;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data @Builder
public class PresentationRequest {

    private Boolean trace;

    @Builder.Default
    private Map<String, IndyRequestedCredsRequestedPred> requestedPredicates = new HashMap<>();

    @Builder.Default
    private Map<String, String> selfAttestedAttributes = new HashMap<>();

    @Builder.Default
    private Map<String, IndyRequestedCredsRequestedAttr> requestedAttributes = new HashMap<>();

    @Data @Builder
    public static final class IndyRequestedCredsRequestedPred {
        private String credId;
        private Integer timestamp;
    }

    @Data @Builder
    public static final class IndyRequestedCredsRequestedAttr {
        private Boolean revealed;
        private String credId;
        private Integer timestamp;
    }
}
