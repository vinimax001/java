package com.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char resp;

        do {
            //ENTRADA DE DADOS
            System.out.print("Digite a temperada em Celsius: ");
            double c = sc.nextDouble();

            //PROCESSAMENTO E RESPOSTA
            double f = 9.0 * c /5.0 + 32;
            System.out.printf("Equivalente em fahrenheit: %.2f%n", f);

            // TESTE REPETIÇÃO
            System.out.print("Deseja continuar? ");
            resp = sc.next().charAt(0);
        } while(resp != 'n');

        sc.close();
    }
}
