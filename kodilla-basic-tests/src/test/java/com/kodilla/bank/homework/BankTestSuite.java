package com.kodilla.bank.homework;

import com.kodilla.school.Grades;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    private Bank bank = new Bank();
    @Test
    public void shouldHaveZeroLength() {
        CashMachine[] cashMachineList = bank.getCashMachineList();
        assertEquals(0, cashMachineList.length);
    }
    @Test
    public void shouldHaveFiveCashMachines() {
        for (int i = 0; i< 5 ;i++){
            this.bank.addCashMachine();
        }
        assertEquals(5, this.bank.getCashMachineList().length);
    }
    @Test
    public void sholdCalculateCorrectBankBalance() {
        bank.addCashMachine();
        bank.addCashMachine();
        CashMachine[] cashMachineLists = bank.getCashMachineList();
        double overallBalance = 0;
        for (int i=0;i < cashMachineLists.length;i++){
            cashMachineLists[i].addTransaction(100);
            cashMachineLists[i].addTransaction(200);
            overallBalance = overallBalance + cashMachineLists[i].getBalance();
        }
        assertEquals(600, this.bank.overallBalance());
    }
    @Test
    public void sholdCountTransactions() {
        bank.addCashMachine();
        bank.addCashMachine();
        bank.addCashMachine();
        CashMachine[] cashMachineLists = bank.getCashMachineList();
        for (int i=0;i < cashMachineLists.length;i++){
            cashMachineLists[i].addTransaction(100);
            cashMachineLists[i].addTransaction(-200);
            cashMachineLists[i].addTransaction(-200);
        }
        assertEquals(6, this.bank.transactionCountWithdrawals());
        assertEquals(3, this.bank.transactionCountDeposit());
    }
    @Test
    public void sholdCountTransactionsWithdrawalsOnlyAdded() {
        bank.addCashMachine();

        CashMachine[] cashMachineLists = bank.getCashMachineList();

        for (int i=0;i < cashMachineLists.length;i++){
            cashMachineLists[i].addTransaction(-100);
            cashMachineLists[i].addTransaction(-200);
        }
        assertEquals(2, this.bank.transactionCountWithdrawals());
        assertEquals(0, this.bank.transactionCountDeposit());

    }
    @Test
    public void sholdCountTransactionsDepositsOnlyAdded() {
        bank.addCashMachine();
        bank.addCashMachine();
        CashMachine[] cashMachineLists = bank.getCashMachineList();

        for (int i=0;i < cashMachineLists.length;i++){
            cashMachineLists[i].addTransaction(100);
            cashMachineLists[i].addTransaction(200);
        }
        cashMachineLists[0].addTransaction(100);
        assertEquals(0, this.bank.transactionCountWithdrawals());
        assertEquals(5, this.bank.transactionCountDeposit());

    }
    @Test
    public void sholdCountAvarageWithdrawals() {
        bank.addCashMachine();
        bank.addCashMachine();
        CashMachine[] cashMachineLists = bank.getCashMachineList();
        for (int i=0;i < cashMachineLists.length;i++){
            cashMachineLists[i].addTransaction(-10);
            cashMachineLists[i].addTransaction(200);
        }
        cashMachineLists[0].addTransaction(-100);
        cashMachineLists[0].addTransaction(-200);
        cashMachineLists[0].addTransaction(-300);

        assertEquals(-124, this.bank.averageWithdraws());

    }
    @Test
    public void sholdCountAvarageDeposits() {
        bank.addCashMachine();
        bank.addCashMachine();
        CashMachine[] cashMachineLists = bank.getCashMachineList();
        for (int i=0;i < cashMachineLists.length;i++){
            cashMachineLists[i].addTransaction(-10);
            cashMachineLists[i].addTransaction(10);
        }
        cashMachineLists[0].addTransaction(500);
        cashMachineLists[0].addTransaction(20);
        cashMachineLists[0].addTransaction(10);
        assertEquals(275, this.bank.averageDeposits());

    }
}
