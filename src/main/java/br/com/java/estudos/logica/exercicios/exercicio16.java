package com.exercicio;

import java.util.Scanner;

public class exercicio16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os 3 números para analise.");
        int[] meuVetor = new int[3];
        int soma = 0;
        int maior = meuVetor[0];
        int menor = meuVetor[0];

        for (int i = 0; i < meuVetor.length; i++){
            System.out.print("Digite o "+(i+1)+"º valor:");
            meuVetor[i] = sc.nextInt();

            if (meuVetor[i] > maior){
                maior = meuVetor[i];
            }

            if (meuVetor[i] < menor){
                menor = meuVetor[i];
            }
            soma+=meuVetor[i];
        }

        System.out.println("O maior número digitado foi: "+maior);
        System.out.println("O menor número digitado foi "+menor);
        System.out.println("A soma dos números digitados é "+soma);


        sc.close();
    }
}
