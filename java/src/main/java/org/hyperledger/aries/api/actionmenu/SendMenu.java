/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.actionmenu;

import lombok.*;

import java.util.List;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class SendMenu {

    private Menu menu;

    @Data @Builder @NoArgsConstructor @AllArgsConstructor
    public static class Menu {
        private String description;
        private String errormsg;
        private List<MenuOption> options;
        private String title;
    }
}
