package Polymorphic_Class.Toni;

public class Account_class {
    private String fName;
    private double balance;

    public Account_class(String fName, double balance) {
        this.fName = fName;
        this.balance = balance;
    }


    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void displayAccount(Account_class account){
        System.out.printf("%s balance: $ %.2f%n", account.getFName(), account.getBalance());
    }
}
