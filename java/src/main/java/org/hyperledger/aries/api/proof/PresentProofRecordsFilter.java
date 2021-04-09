/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.proof;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import okhttp3.HttpUrl;
import org.apache.commons.lang3.StringUtils;
import org.hyperledger.aries.api.AcaPyRequestFilter;

import javax.annotation.Nullable;
import java.util.Locale;

@Data @Builder
public class PresentProofRecordsFilter implements AcaPyRequestFilter {
    @Nullable private String connectionId;
    @Nullable private PresentationExchangeRole role;
    @Nullable private PresentationExchangeState state;
    @Nullable private String threadId;
}
