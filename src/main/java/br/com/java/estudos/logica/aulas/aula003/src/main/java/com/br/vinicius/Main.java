package com.br.vinicius;

import java.text.CharacterIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        int n2 = sc.nextInt();

        int maior = n1>n2 ? n1:n2;

        System.out.println("O maior valor digitado foi: "+maior);

        sc.close();
    }
}
