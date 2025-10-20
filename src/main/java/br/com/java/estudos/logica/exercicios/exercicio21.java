package com.exercicio;

import java.util.Scanner;

public class exercicio21 {
    public static void main(String[] args) {
        System.out.println("Começou o programa");
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int x = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        int i = sc.nextInt();

        int s = soma(x,i);
        exibir(s);
        sc.close();
    }

    static int soma(int a, int b){
        int s = a + b;
        return s;
    }

    static void exibir (int res){
        System.out.println("A soma entre os valores digitados é "+res);
    }
}
