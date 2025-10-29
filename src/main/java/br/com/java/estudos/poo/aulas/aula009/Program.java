package br.com.java.estudos.poo.aulas.aula009;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        double soma = 0.0, media = 0.0;

        double[] vect = new double[n];

        for(int i = 0; i < n; i ++){
            System.out.print("Digite o valor da posição ["+(i+1)+"]: ");
            vect[i] = sc.nextDouble();
            soma += vect[i];
            media = soma / n;
        }
        System.out.printf("AVERAGE HEIGHT = %.2f", media);

        sc.close();
    }
}