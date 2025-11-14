package br.com.java.estudos.poo.exercicios.exercicio012;

import br.com.java.estudos.poo.exercicios.exercicio012.entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] rents = new Rent[10];

        System.out.print("How many rooms will be rented:? ");
        int n  = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Rent #" + (i + 1) + ":");
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int num = sc.nextInt();
            rents[num] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < rents.length; i++) {
            if (rents[i] != null) {
                System.out.println( i + ": " +  rents[i]);
            }
        }

        sc.close();
    }
}