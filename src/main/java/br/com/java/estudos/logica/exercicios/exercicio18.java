package com.exercicio;

import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        int []n = new int[6];
        Scanner sc = new Scanner(System.in);
        //PREENCHER O VETOR
        for (int c=0; c < n.length; c++){
            System.out.print("Digite o "+(c+1)+ "º valor: ");
            n[c] = sc.nextInt();
        }

        sc.close();
    }
}
