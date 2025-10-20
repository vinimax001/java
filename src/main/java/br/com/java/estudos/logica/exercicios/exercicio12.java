package com.exercicio;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números deseja soma: ");
        int quant = sc.nextInt();

        int soma = 0;
        for (int n = 1; n <= quant; n++){
            System.out.print("Digite o "+n+"° valor: ");
            int num = sc.nextInt();
            soma+=num;
        }
        System.out.println("A soma dos valores digitados é "+soma);
        sc.close();
    }
}
