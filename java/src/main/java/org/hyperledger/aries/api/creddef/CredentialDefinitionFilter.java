/**
 * Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.creddef;

import javax.annotation.Nullable;

import org.apache.commons.lang3.StringUtils;
import org.hyperledger.aries.config.CredDefId;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import okhttp3.HttpUrl;

@Data @Builder
public class CredentialDefinitionFilter {

    @Nullable private String credentialDefinitionId;
    @Nullable private String issuerDid;
    @Nullable private String schemaId;
    @Nullable private String schemaIssuerDid;
    @Nullable private String schemaName;
    @Nullable private String schemaVersion;

    public HttpUrl.Builder buildParams(@NonNull HttpUrl.Builder b) {
        if (StringUtils.isNotEmpty(credentialDefinitionId)) {
            b.addQueryParameter(CredDefId.CRED_DEF_ID, credentialDefinitionId);
        }
        if (StringUtils.isNotEmpty(issuerDid)) {
            b.addQueryParameter("issuer_did", issuerDid);
        }
        if (StringUtils.isNotEmpty(schemaId)) {
            b.addQueryParameter("schema_id", schemaId);
        }
        if (StringUtils.isNotEmpty(schemaIssuerDid)) {
            b.addQueryParameter("schema_issuer_did", schemaIssuerDid);
        }
        if (StringUtils.isNotEmpty(schemaName)) {
            b.addQueryParameter("schema_name", schemaName);
        }
        if (StringUtils.isNotEmpty(schemaVersion)) {
            b.addQueryParameter("schema_version", schemaVersion);
        }
        return b;
    }
}
