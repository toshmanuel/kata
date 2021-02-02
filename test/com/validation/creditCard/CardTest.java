package com.validation.creditCard;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    Card card;

    @BeforeEach
    void setUp() {
        card = new Card();
    }

    @AfterEach
    void tearDown() {
        card = null;
    }

    @Test
    void testToCheckForTheLengthOfTheCard(){
        long cardNumber = 1234567876523L;
        card.checkCardLength(cardNumber);
        assertEquals(13, card.getCardLength());
    }

    @Test
    void checkIfCreditCardIsVisa(){
        long cardNumber = 0;
        card.checkCardLength(cardNumber);
        boolean isVisaCard = card.isVisa(cardNumber);
        assertTrue(isVisaCard);
    }

    @Test
    void checkIfCreditCardIsMaster(){
        long cardNumber = 0;
        card.checkCardLength(cardNumber);
        boolean isMasterCard = card.isMasterCard(cardNumber);
        assertTrue(isMasterCard);
    }
}