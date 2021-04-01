/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.credential;

public enum CredentialExchangeState {
    proposal_sent,
    proposal_received,
    offer_sent,
    offer_received,
    request_sent,
    request_received,
    credential_issued,
    credential_received,
    credential_acked
}
