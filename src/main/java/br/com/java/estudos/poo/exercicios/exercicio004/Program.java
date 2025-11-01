package br.com.java.estudos.poo.exercicios.exercicio004;

import br.com.java.estudos.poo.exercicios.exercicio004.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price: ");
        double dolar = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double quant = sc.nextDouble();
        double result = CurrencyConverter.converter(dolar, quant);
        System.out.printf("Amount to be paid in reais = R$ %.2f%n", result);

        sc.close();
    }
}
