package br.com.java.estudos.poo.exercicios.exercicio005.account;

import java.util.Scanner;

public class Account {

    //ATRIBUTOS
    public int  accountNumber;
    private String holderName;
    private double balance;

    //CONSTRUTORES
    public Account(int accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }
    public Account(int accountNumber, String holderName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        deposit(initialDeposit);

    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public String getHolderName(){
        return holderName;
    }

    public void setHolderName(String holderName){
        this.holderName = holderName;
    }

    public double getBalance(){
        return balance;
    }

    //METODOS

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.00;
    }

    public String toString() {
        return "Account Number: "
                + accountNumber
                + ", Holder: "
                + holderName
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}