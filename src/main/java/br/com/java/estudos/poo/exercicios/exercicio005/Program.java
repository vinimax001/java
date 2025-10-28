package br.com.java.estudos.poo.exercicios.exercicio005;

import br.com.java.estudos.poo.exercicios.exercicio005.account.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder name: ");
        String accountHolder = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char resp = sc.next().charAt(0);
        if (resp == 'y' || resp == 'Y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(accountNumber, accountHolder, initialDeposit);
        } else {
            account = new Account(accountNumber, accountHolder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double amount =  sc.nextDouble();
        account.deposit(amount);
        System.out.println("Update account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Ente a withdraw value: ");
        amount = sc.nextDouble();
        account.withdraw(amount);
        System.out.println("Update account data:");
        System.out.println(account);
    }
}