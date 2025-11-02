package br.com.java.estudos.poo.exercicios.exercicio006;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 0;

        //Number of numbers for analysis (1 to 10)
        //TEST LOOP FOR NUMBERS GREATER THAN 10
        do {
            System.out.print("Enter the number of numbers you wish to analyze [1/10]: ");
            n = sc.nextInt();
        } while (n > 10);

        //Creating and filling the vector
        int[] vect = new int[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%dº number: ", i + 1);
            vect[i] = sc.nextInt();
        }

        //Display negative numbers from the vector
        System.out.println("Negative numbers: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.print(" -> " + vect[i]);
            }
        }


        sc.close();
    }
}