package com.exercicio;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        System.out.println("Dia da semana");
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o dia de 1 a 7: ");
        int x = sc.nextInt();
        String dia;

        switch (x){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Valor invalido";
                break;
        }

        System.out.printf("Dia da semana: %s", dia);
        sc.close();
    }
}