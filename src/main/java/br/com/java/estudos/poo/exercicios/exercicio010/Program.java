package br.com.java.estudos.poo.exercicios.exercicio010;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers are you going to type? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        double maior = vect[0];
        int posM = 0;
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Enter the "+(i+1) + "º number: ");
            vect[i] = sc.nextDouble();
            if (vect[i] > maior){
                maior = vect[i];
                posM = i;
            }
        }

        System.out.println("GREATER VALUE = " + maior);
        System.out.println("HIGHEST VALUE POSITION = " + posM);



        sc.close();
    }
}
