package br.com.java.estudos.poo.aulas.aula005.classestatic.util;

public class Calculator {

    public static final double PI = 3.14159;

    public static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double volume(double radius){
        return 4 * PI * radius * radius * radius / 3;
    }

}
