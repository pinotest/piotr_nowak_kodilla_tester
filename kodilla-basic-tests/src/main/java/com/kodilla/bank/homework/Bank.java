package com.kodilla.bank.homework;

public class Bank {
    public CashMachine[] cashMachineTab;
    private double overallBalance;
    private int cashMachinesCount;

    public Bank(){
        this.overallBalance=0;
        this.cashMachineTab = new CashMachine[0];
    }
    public double overallBalance(){
        for (int i=0; i<this.cashMachineTab.length; i++){
            this.overallBalance = this.overallBalance+ cashMachineTab[i].getBalance();
        }
        return overallBalance;
    }
    public int transactionCountWithdrawals(){
        int overallWithdrawalsCount=0;
        for (int i=0; i<this.cashMachineTab.length; i++){

            double[] transList = cashMachineTab[i].getTransactionList();
            for (int j=0; j< transList.length;j++){
                if (transList[j]<0){
                    overallWithdrawalsCount++;
                }
            }
        }
        return overallWithdrawalsCount;
    }
    public double transactionCountDeposit(){
        int overallDepositsCount=0;
        for (int i=0; i<this.cashMachineTab.length; i++){

            double[] transList = cashMachineTab[i].getTransactionList();
            for (int j=0; j< transList.length;j++){
                if (transList[j]>0){
                    overallDepositsCount++;
                }
            }
        }
        return overallDepositsCount;
    }
    public double averageWithdraws(){
        double sumWithdrawals = 0;
        for (int i=0; i<this.cashMachineTab.length; i++){
            double[] transList = cashMachineTab[i].getTransactionList();
            for (int j=0; j< transList.length;j++){
                if (transList[j]<0){
                    sumWithdrawals = sumWithdrawals + transList[j];
                }
            }
        }
        return sumWithdrawals/transactionCountWithdrawals();
    }
    public double averageDeposits(){
        double sumDeposits = 0;
        for (int i=0; i<this.cashMachineTab.length; i++){
            double[] transList = cashMachineTab[i].getTransactionList();
            for (int j=0; j< transList.length;j++){
                if (transList[j]>0){
                    sumDeposits = sumDeposits + transList[j];
                }
            }
        }
        return sumDeposits/transactionCountWithdrawals();
    }
    public CashMachine[] getCashMachineList(){
        return this.cashMachineTab;
    }
    public void addCashMachine(){
        CashMachine cashMachine = new CashMachine();
        this.cashMachinesCount++;
        CashMachine[] newTab = new CashMachine[this.cashMachinesCount];
        System.arraycopy(cashMachineTab, 0, newTab, 0, cashMachineTab.length);
        newTab[this.cashMachinesCount - 1] = cashMachine;
        this.cashMachineTab = newTab;
    }

    /*
 Utwórz klasę Bank, która będzie zawierać tablicę bankomatów.
    * Bank powinien mieć metody zwracające:

całkowity bilans ze wszystkich bankomatów,
liczbę transakcji związanych z wypłatą,
liczbę transakcji związaną z wpłatą pieniędzy,
średnią wartość wypłaty,
średnią wartość wpłaty.*/
}
