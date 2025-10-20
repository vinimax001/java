package com.exercicio;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Até que numero deseja contar: ");
        int fim = sc.nextInt();
        int cont = 1;

        while (cont <= fim){
            System.out.println(cont);
            cont++;
        }
        sc.close();
    }
}