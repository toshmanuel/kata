package com.validation.creditCard;

public class Card {
    private int cardLength;
    private long cardNumber;
    boolean isValid;
    private int evenAddition;
    private int oddAddition;

    public Card() {

    }

    public void checkCardLength(long cardNumber) {
        int cardLength = (int) (Math.log10(cardNumber) + 1);
        if (cardLength >= 13 && cardLength <= 16){
            this.cardLength = cardLength;
        }
    }

    public int getCardLength() {
        return cardLength;
    }

    public boolean isVisa(long cardNumber) {
        int firstDigit = getFirstDigit(cardNumber);
        if (cardLength == 16 && firstDigit == 4){
            extracted(evenAddition, oddAddition, cardNumber);
            validCardNumber(evenAddition, oddAddition);
        }else
            isValid = false;
        return isValid;
    }

    public boolean isMasterCard(long cardNumber){
        int firstDigit = getFirstDigit(cardNumber);
        if (cardLength == 16 && firstDigit == 5){
            extracted(evenAddition, oddAddition, cardNumber);
        }

        validCardNumber(evenAddition, oddAddition);
        return isValid;
    }

    public boolean isDiscoverCard(long cardNumber){
        int firstDigit = getFirstDigit(cardNumber);
        if (cardLength == 16 && firstDigit == 6){
            extracted(evenAddition, oddAddition, cardNumber);
        }

        validCardNumber(evenAddition, oddAddition);
        return isValid;
    }

    public boolean isAmericanExpressCard(long cardNumber){
        int firstDigit = getFirstTwoDigit(cardNumber);
        if (cardLength == 16 && firstDigit == 5){
            extracted(evenAddition, oddAddition, cardNumber);
        }

        validCardNumber(evenAddition, oddAddition);
        return isValid;
    }

    private void validCardNumber(int evenAddition, int oddAddition) {
        this.evenAddition = evenAddition;
        this.oddAddition = oddAddition;
        isValid = (oddAddition + evenAddition) % 10 == 0;
    }

    private int getFirstDigit(long cardNumber) {
        return (int) (cardNumber / 1000000000000000L);
    }

    private int getFirstTwoDigit(long cardNumber) {
        return (int) (cardNumber / 10000000000000L);
    }

    private int getEvenAddition(int digits) {
        int evenAddition = 0;
        digits = digits * 2;
        digits = getDigits(digits);
        evenAddition += digits;
        return evenAddition;
    }

    private int getDigits(int digits) {
        if(digits >= 10){
            digits = digits - 9;
        }
        return digits;
    }

    private void extracted(int evenAddition, int oddAddition, long cardNumber) {
        for (long counter = 1; counter <= cardLength; counter++){
            int digits = (int) (cardNumber % 10);
            cardNumber = cardNumber / 10;
            if(counter % 2 == 0){
                evenAddition = evenAddition + getEvenAddition(digits);
            }else{
                oddAddition += digits;
            }
        }this.evenAddition = evenAddition;
        this.oddAddition = oddAddition;
    }
}
