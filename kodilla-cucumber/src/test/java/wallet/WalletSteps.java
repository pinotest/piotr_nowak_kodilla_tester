package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {
    int currentBalance = 0;

    public WalletSteps() {
        Wallet wallet = new Wallet();
        CashSlot cashSlot = new CashSlot();
        Cashier cashier = new Cashier(cashSlot);

        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

        When("I request $30", () -> {
     //
            cashier.withdraw(wallet, 30);
        });

        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
            Assert.assertEquals("Incorrect wallet balance", 170, wallet.getBalance());
        });

        When("I requested $200", () -> {
            Assert.assertEquals("Incorrect wallet balance", 200,  wallet.getBalance());
         //   Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 200);
        });

        Then("$0 should be dispensed", () -> {
            Assert.assertEquals("Incorrect wallet balance", 0,  wallet.getBalance());

        });
        Then("the balance of my wallet should be $170", () -> {
            Assert.assertEquals("Incorrect wallet balance", 170,  wallet.getBalance());
        });

        Given("there is $100 in my wallet", () -> {
            wallet.deposit(100);
            Assert.assertEquals("Incorrect wallet balance", 100, wallet.getBalance());

        });

        When("I check the balance of my wallet", () -> {
            currentBalance = wallet.getBalance();
        });

        Then("I should see that the balance is $100", () -> {
            Assert.assertEquals("Incorrect wallet balance", 100, currentBalance);
        });



        When("I withdraw $200", () -> {
            cashier.withdraw(wallet, 200);
        });

        Then("nothing should be dispensed", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

        Then("I should be told that I don't have enough money in my wallet", () -> {
            Assert.assertEquals("You don't have enough money in your wallet", wallet.getInformation());
        });

    }
}