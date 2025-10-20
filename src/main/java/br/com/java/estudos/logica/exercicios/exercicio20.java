package com.exercicio;

import java.util.Arrays;

public class exercicio20 {
    public static void main(String[] args) {
        double[] v = {3.5, 2.75, 9, -4.5};

        //COLOCANDO O VETOR EM ORDEM
        Arrays.sort(v);

        for (double valor: v){
            System.out.print(valor+" ");
        }

        //BUSCA BINARIA
        int pos = Arrays.binarySearch(v, 3.5);
        System.out.println(pos);


        //PREENCHER VETOR COM O MESMO VALOR EM TODAS POSIÇÕES
        int[] pre = new int[20];
        Arrays.fill(pre, 10);

        for (int value: pre){
            System.out.print(value+" ");
        }
    }
}
