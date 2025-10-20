package com.exercicio;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.print("Digite o valor da primeira nota: ");
        float n1 = sc.nextFloat();
        System.out.print("Digite o valor da segunda nota: ");
        float n2 = sc.nextFloat();

        //RESULTADO
        float media = (n1+n2) / 2;
        System.out.printf("Suas notas foram %.2f e %.2f. %nA média entre as notas foi %.2f%n", n1, n2, media);
        if (media > 8){
            System.out.println("Parabéns");
        }
    }
}
