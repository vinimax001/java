package br.com.java.estudos.poo.exercicios.exercicio005.account;

import java.util.Scanner;

public class Account {

    //ATRIBUTOS
    public int  accountNumber;
    private String holderName;
    private double balance;

    //CONSTRUTOR
    public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;

    }
    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    //METODOS

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        amount += 5;
        if (balance >= amount) {
            this.balance -= amount;
        }
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
