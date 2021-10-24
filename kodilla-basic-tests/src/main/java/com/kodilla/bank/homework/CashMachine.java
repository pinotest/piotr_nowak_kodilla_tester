package com.kodilla.bank.homework;

public class CashMachine {
    private double[] transaction;
    private double balance;
    private int transactionSize;

    public CashMachine(){
        this.balance = 0.0;
        this.transactionSize = 0;
        this.transaction = new double[0];
    }
    public double getBalance(){
        return this.balance;
    }
    public double getTransactionCount(){
        return this.transaction.length;

    }
    public double[] getTransactionList(){
        return this.transaction;
    }
    public void addTransaction(double newTransaction){
        if (newTransaction !=0) {
            this.transactionSize++;
            double[] newTab = new double[this.transactionSize];
            System.arraycopy(transaction, 0, newTab, 0, transaction.length);
            newTab[this.transactionSize - 1] = newTransaction;
            this.transaction = newTab;
            this.balance = this.balance + newTransaction;
        }
    }
}

