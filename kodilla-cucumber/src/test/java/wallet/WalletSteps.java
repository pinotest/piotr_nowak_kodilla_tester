package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {
    public WalletSteps() {
        Wallet wallet = new Wallet();
        CashSlot cashSlot = new CashSlot();

        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

        When("I request $30", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 30);
        });

        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });

        When("I requested $200", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 200);
        });

        Then("$0 should be dispensed", () -> {
            Assert.assertEquals("Incorrect wallet balance", 0,  wallet.getBalance());

        });


    }
}