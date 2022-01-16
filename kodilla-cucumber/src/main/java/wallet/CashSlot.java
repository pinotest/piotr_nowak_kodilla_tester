package wallet;

public class CashSlot {
    private int contents;
    private int walletBalance;

    public int getContents() {
        return contents;
    }

    public void dispense(int amount) {
        this.contents = amount;
    }

}