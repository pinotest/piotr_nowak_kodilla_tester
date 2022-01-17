package wallet;

public class Wallet {
    private int balance = 0;
    private String information = "";
    public Wallet() {
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public int getBalance() {
        return balance;
    }
    public void debit(int money)  {
        if (getBalance() >= money){
            this.balance -= money;
        }
        else{
            this.information = "You don't have enough money in your wallet";
    }}
    public String getInformation(){
        return this.information;
    }
}
