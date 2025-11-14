package br.com.java.estudos.poo.aulas.aula012;

public class Program {
    public static void main(String[] args) {
        int x = 20;

        Integer obj = x;
        int y =  obj;

        System.out.println(x);
        System.out.println(y * 2);

        System.out.println("---------------------------------------");

        String[] vect = new String[] {"Maria", "Bob", "Alex"};

        for(String s: vect){
            System.out.println(s);
        }

    }
}