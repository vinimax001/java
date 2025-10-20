package com.exercicio;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos minutos você utilizou: ");
        int minutos = sc.nextInt();

        double conta = 50;

        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
            System.out.printf("Você excedeu o seu pacote. Valor a pagar R$ %.2f %n", conta);
        }
        else {
            System.out.printf("Total da conta R$ %.2f %n", conta);
        }


        sc.close();
    }
}