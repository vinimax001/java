package com.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        //CONFIGURANDO SCANNER E LOCALIZAÇÃO
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //RECEBENDO DADOS
        System.out.print("Qual a largura do terreno: ");
        double largura = sc.nextDouble();
        System.out.print("Qual o comprimento do terreno: ");
        double comprimento = sc.nextDouble();
        System.out.print("Qual o valor do metro quadrado:");
        double metroQuadrado = sc.nextDouble();

        //RESULTADOS
        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("O terrento tem area total de %.2f%n", area);
        System.out.printf("O valor do terreno é R$ %.2f%n", preco);

        sc.close();
    }
}