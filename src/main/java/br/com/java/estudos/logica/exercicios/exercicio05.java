package com.exercicio;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Estrutura de repetição");

        int soma = 0;
        System.out.print("Digite o valor: ");
        int x = sc.nextInt();

        while (x != 0){
            System.out.print("Digite outro valor: ");
            x = sc.nextInt();
            soma += x;
        }
        System.out.printf("A soma dos valores digitados foi %s", soma);
        sc.close();
    }
}
