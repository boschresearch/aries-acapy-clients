/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.action_menu;

import lombok.*;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class MenuOption {
    private String description;
    private Boolean disabled;
    private MenuForm form;
    private String name;
    private String title;
}
