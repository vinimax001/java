package com.exercicio;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor do desconto");
        System.out.print("Qual valor do produto: ");
        double preco = sc.nextInt();
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.5;
        double precofinal = preco - desconto;

        System.out.println("O valor do desconto é "+desconto);
        System.out.printf("O preço final é %s", precofinal);
        sc.close();
    }
}
