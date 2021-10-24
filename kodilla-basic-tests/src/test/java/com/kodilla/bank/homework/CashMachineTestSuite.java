package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    private CashMachine cashMachine = new CashMachine();
    @Test
    public void shouldHaveZeroBalance() {
        double balance = cashMachine.getBalance();
        assertEquals(0, balance);
    }
    @Test
    public void shouldHaveZeroTransaction() {
        double transactionCount = cashMachine.getTransactionCount();
        assertEquals(0, transactionCount);
    }
    @Test
    public void shouldHaveZeroLength() {
        double[] values = cashMachine.getTransactionList();
        assertEquals(0, values.length);
    }

    @Test
    public void shouldAddTwoTransactionToArray() {
       cashMachine.addTransaction(100);
       cashMachine.addTransaction(-100);

        double[] cashMachines = cashMachine.getTransactionList();
        assertEquals(100, cashMachines[0]);
        assertEquals(-100, cashMachines[1]);
    }
    @Test
    public void shouldGetBalanceBelowZero() {
        cashMachine.addTransaction(10);

        cashMachine.addTransaction(-100);

        double[] cashMachines = cashMachine.getTransactionList();
        assertEquals(-90, cashMachine.getBalance());
    }
    @Test
    public void shouldGetBalanceAboveZero() {
        cashMachine.addTransaction(10);

        cashMachine.addTransaction(100);

        double[] cashMachines = cashMachine.getTransactionList();
        assertEquals(110, cashMachine.getBalance());
    }
    @Test
    public void shouldNotAddTransaction() {
        cashMachine.addTransaction(0);
        double[] cashMachines = cashMachine.getTransactionList();
        assertEquals(0, cashMachine.getTransactionCount());
    }

}
