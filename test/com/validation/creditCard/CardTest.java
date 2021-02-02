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
        long cardNumber = 4388576018410707L;
        card.checkCardLength(cardNumber);
        boolean isVisaCard = card.isVisa(cardNumber);
        assertTrue(isVisaCard);
    }

    @Test
    void checkIfCreditCardIsMaster(){
        long cardNumber = 5399431232469218L;
        card.checkCardLength(cardNumber);
        boolean isMasterCard = card.isMasterCard(cardNumber);
        assertTrue(isMasterCard);
    }

    @Test
    void checkIfCreditCardIsDiscover(){
        long cardNumber = 6199431232469218L;
        card.checkCardLength(cardNumber);
        boolean isDiscoverCard = card.isDiscoverCard(cardNumber);
        assertTrue(isDiscoverCard);
    }

    @Test
    void checkIfCreditCardIsAmericanExpress(){
        long cardNumber = 379431232469213L;
        card.checkCardLength(cardNumber);
        boolean isAmericanExpressCard = card.isAmericanExpressCard(cardNumber);
        assertTrue(isAmericanExpressCard);
    }
}