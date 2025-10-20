package com.exercicio;

public class exercicio19 {
    public static void main(String[] args) {
        String []mes = {"Jan", "Fev", "Mar", "Abril", "Maio", "Jun", "Jul", "Ago",
                "Set", "Out", "Nov", "Dez"};

        int []tot = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i=0; i < mes.length; i++){
            System.out.println("O mês de " +mes[i]+ " tem "+tot[i]+" dias ao todo.");
        }

    }
}
