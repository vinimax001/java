package com.aula06;

import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
       int hora;

       Scanner sc = new Scanner(System.in);
       System.out.print("Quantas horas são: ");
       hora = sc.nextInt();

       if (hora < 12){
           System.out.println("Bom dia");
       }
       else {
           if (hora < 18) {
               System.out.println("Boa tarde");
           }
           else{
               System.out.println("Boa noite");
           }
       }

       sc.close();
    }
}