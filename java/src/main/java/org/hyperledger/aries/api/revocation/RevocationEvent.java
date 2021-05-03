/*
 * Copyright (c) 2020-2021 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.revocation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Webhook event: issuer_cred_rev
 */
@Data @NoArgsConstructor @AllArgsConstructor
public class RevocationEvent {
    private String state;
    private String createdAt;
    private String revRegId;
    private String recordId;
    private String credDefId;
    private String credExId;
    private String uploadedAt;
    private String credRevId;
}
