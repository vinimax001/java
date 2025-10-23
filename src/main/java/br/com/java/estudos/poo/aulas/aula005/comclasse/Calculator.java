package br.com.java.estudos.poo.aulas.aula005.comclasse;

public class Calculator {
    public final double PI = 3.14159;

    public  double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public  double volume(double radius){
        return 4 * PI * radius * radius * radius / 3;
    }
}
