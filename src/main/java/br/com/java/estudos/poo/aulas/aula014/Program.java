package br.com.java.estudos.poo.aulas.aula014;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [][] mat = new int[n][n];

        for(int l = 0; l < mat.length; l++){
            for(int c = 0; c < mat[l].length; c++){
                mat[l][c] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal:");
        for(int i = 0; i < mat.length; i++){
            System.out.print(mat[i][i] + " ");
        }

        System.out.println();
        System.out.println("Negative numbers:");
        int count = 0;
        for(int l = 0; l < mat.length; l++){
            for(int c = 0; c < mat[l].length; c++){
                if (mat[l][c]< 0){
                    count++;
                    System.out.print(mat[l][c] + " ");
                }
            }
        }
        System.out.println();
        System.out.println("Quantity of negative numbers: " + count);

        sc.close();
    }
}