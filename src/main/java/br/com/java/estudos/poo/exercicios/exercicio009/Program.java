package br.com.java.estudos.poo.exercicios.exercicio009;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers are you going to type: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        int sumPar = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i+1)+"º number: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("Even numbers:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i]+ " ");
                sumPar++;
            }
        }

        System.out.println("Average Sum Of Numbers: " + sumPar);

        sc.close();
    }
}
