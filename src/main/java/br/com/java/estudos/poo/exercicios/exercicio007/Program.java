package br.com.java.estudos.poo.exercicios.exercicio007;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers are you going to type? ");
        int n = sc.nextInt();

        double[] vect = new double[n];
        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%d number: ", i + 1);
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        System.out.print("The numbers entered were: ");
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%.2f%n, ", vect[i]);
        }

        System.out.printf("SUM = %.2f%n", sum);
        System.out.printf("AVERAGE = %.2f%n", sum / vect.length);

        sc.close();
    }
}