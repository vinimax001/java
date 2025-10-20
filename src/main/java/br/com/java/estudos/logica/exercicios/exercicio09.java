package com.exercicio;

import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a sua idade: ");
        int idade = sc.nextInt();
        String voto = ((idade >= 16 && idade < 18 ) || (idade > 65)) ? "Voto facultativo" : "Voto obrigatório";

        System.out.println(voto);
        sc.close();
    }
}
