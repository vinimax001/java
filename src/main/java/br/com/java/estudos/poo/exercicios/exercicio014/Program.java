package br.com.java.estudos.poo.exercicios.exercicio014;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of lines: ");
        int l =  sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c =  sc.nextInt();
        int[][] mat = new int[l][c];

        //Filling in the matrix
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        //Finding the position of the number
        System.out.print("Which number are you looking for? ");
        int pos = sc.nextInt();
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if (pos == mat[i][j]){
                    System.out.println("Number " +pos+  " found in position: ["+i+","+j+"]");
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length-1) {
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (i < mat.length-1) {
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }


        sc.close();
    }
}
