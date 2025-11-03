package br.com.java.estudos.poo.exercicios.exercicio011;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many values will each vector have? ");
        int n = sc.nextInt();

        int[] vectA = new int[n];
        System.out.println("Enter the values vector A:");
        for (int i = 0; i < vectA.length; i++) {
            System.out.print((i+1)+"º value: ");
            vectA[i] = sc.nextInt();
        }

        int[] vectB = new int[n];
        System.out.println("Enter the values vector B:");
        for (int i = 0; i < vectB.length; i++) {
            System.out.print((i+1) + "º value: ");
            vectB[i] = sc.nextInt();
        }

        System.out.println("RESULTANT VECTOR:");
        for (int i = 0; i < vectA.length; i++) {
            System.out.println("POSITION ["+i+"] = "+(vectA[i] + vectB[i]));
        }

        sc.close();
    }
}