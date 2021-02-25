package Card;

public class Card {
    private long cardNumber;
    private int cardLength;

    public void setCardNumber(long cardNumber) {
        setCardLengthRange();
        this.cardNumber = cardNumber;
    }
    public long getCardNumber(){
        return cardNumber;
    }

    public void checkCardLength(long cardNumber) {
        cardLength = (int) (Math.log10(cardNumber) + 1);
    }

    public int getCardLength(){
        return cardLength;
    }

    private void setCardLengthRange(){
        if (cardLength < 13 || cardLength > 16){
            System.out.println("kini probs eee");
            throw new IllegalArgumentException("invalid card type");
        }
    }
}
