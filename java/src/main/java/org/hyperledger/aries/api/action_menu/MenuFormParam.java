/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.action_menu;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class MenuFormParam {

    @SerializedName("default")
    private String _default;

    private String description ;

    private String name;

    private Boolean required;

    @SerializedName("title")
    private String title;

    private String type;
}
