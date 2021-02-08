package BeansBuying;

public class Messenger {
    public Beans orderBeansWith(int amount, int quantity, boolean withOmiEwa, boolean isMoneyFake){
        return buyBeansWith(amount, quantity, withOmiEwa, isMoneyFake);
    }

    private Beans buyBeansWith(int amount, int quantity, boolean withOmiEwa, boolean isMoneyFake) {
        return new Beans(amount, withOmiEwa);
    }
}
