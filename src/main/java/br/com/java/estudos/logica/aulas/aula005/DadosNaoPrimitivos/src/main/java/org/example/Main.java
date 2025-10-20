package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Digite os valores a serem analizados: ");

        int valor1, valor2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        sc.nextInt();


        sc.close();
    }
}