/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.webhook;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hyperledger.aries.api.connection.ConnectionRecord;
import org.hyperledger.aries.api.credential.CredentialExchange;
import org.hyperledger.aries.api.proof.PresentationExchangeRecord;
import org.hyperledger.aries.pojo.AttributeName;
import org.hyperledger.aries.util.FileLoader;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EventParserTest {

    private final FileLoader loader = FileLoader.newLoader();
    private final EventParser parser = new EventParser();

    @Test
    void testParseConnectionEvent() {
        String json = loader.load("events/connection-active.json");
        Optional<ConnectionRecord> conn = parser.parseValueSave(json, ConnectionRecord.class);
        assertTrue(conn.isPresent());
        assertEquals("active", conn.get().getState());
    }

    @Test
    void testParseIssuedCredential() {
        String json = loader.load("events/issue-credential.json");
        Optional<CredentialExchange> con = parser.parseValueSave(json, CredentialExchange.class);
        assertTrue(con.isPresent());
        CredentialExchange cred = con.get();
        assertEquals("holder", cred.getRole());
        assertNotNull(cred.getCredentialDefinitionId());
        assertNotNull(cred.getCredential());
    }

    @Test
    void testParseProofPresentationVerifier() {
        String json = loader.load("events/proof-valid-verifier.json");
        Optional<PresentationExchangeRecord> p = parser.parsePresentProof(json);
        assertTrue(p.isPresent());
        assertEquals("verifier", p.get().getRole());
        Masterdata md = p.get().from(Masterdata.class);
        assertEquals("4", md.getStreetNumber());
        assertEquals("8000", md.getPostalCode());
        assertNotNull(p.get().getIdentifiers());
        assertEquals(1, p.get().getIdentifiers().size());
        assertTrue(p.get().getIdentifiers().get(0).getSchemaId().startsWith("CHysca6fY8n8ytCDLAJGZj"));
        assertTrue(p.get().getIdentifiers().get(0).getCredentialDefinitionId().startsWith("CHysca6fY8n8ytCDLAJGZj"));
    }

    @Test
    void testParseProofPresentationVerifierMap() {
        String json = loader.load("events/proof-valid-verifier.json");
        Optional<PresentationExchangeRecord> p = parser.parsePresentProof(json);
        assertTrue(p.isPresent());
        Map<String, Object> md = p.get().from(Set.of("country", "city"));
        assertEquals("Switzerland", md.get("country"));
        assertEquals("Zürich", md.get("city"));
    }

    @Test
    void testParseProofPresentationProver() {
        String json = loader.load("events/proof-valid-prover.json");
        Optional<PresentationExchangeRecord> p = parser.parsePresentProof(json);
        assertTrue(p.isPresent());
        assertEquals("prover", p.get().getRole());
        final BankAccount ba = p.get().from(BankAccount.class);
        assertNotNull(ba);
        assertEquals("GB33BUKB20201555555555", ba.getIban());
        assertEquals("PBNK", ba.getBic());
    }

    @Test
    void testParseProofPresentationProverMap() {
        String json = loader.load("events/proof-valid-prover.json");
        Optional<PresentationExchangeRecord> p = parser.parsePresentProof(json);
        assertTrue(p.isPresent());
        final Map<String, Object> ba = p.get().from(Set.of("iban", "bic"));
        assertNotNull(ba);
        assertEquals("GB33BUKB20201555555555", ba.get("iban"));
        assertEquals("PBNK", ba.get("bic"));
    }

    @Data @NoArgsConstructor
    public static final class Masterdata {
        private String name;
        @AttributeName("local_name")
        private String localName;
        private String street;
        @AttributeName("street_number")
        private String streetNumber;
        private String city;
        private String state;
        @AttributeName("postal_code")
        private String postalCode;
        private String country;
        private String website;
        private String phone;
        private String email;
        @AttributeName("registration_number")
        private String registrationNumber;
        @AttributeName("registration_country")
        private String registrationCountry;
    }

    @Data @NoArgsConstructor
    public static final class BankAccount {
        private String iban;
        private String bic;
    }
}
