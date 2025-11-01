package br.com.java.estudos.poo.aulas.aula010;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of people: ");
        int n =  sc.nextInt();

        double sum = 0.0;
        double[] vect = new double[n] ;
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Height %dº person: ", (i + 1));
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        double media = sum / vect.length;

        System.out.printf("AVERAGE HEIGHT = %.2f", media);
        sc.close();
    }
}