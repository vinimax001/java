package com.exercicio;

import java.time.LocalDate;
import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Voto");

        //ENTRADA DE DADOS
        System.out.print("Digite o ano do seu nascimento: ");
        int nasc = sc.nextInt();

        //RESULTADOS
        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - nasc;

        System.out.println("Você tem "+ idade + " anos.");

        if (idade<16){
            System.out.println("Não pode votar.");
        } else {
            if ((idade >= 16 && idade < 18) || (idade > 65)) {
                System.out.println("Seu voto é facultativo.");
            } else {
                System.out.println("Seu voto é obrigatório.");
            }
        }

        sc.close();
    }
}
