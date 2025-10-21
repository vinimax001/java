package br.com.java.estudos.poo.aulas.aula003.src.main.java.br.com.vinicius.entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public double area() {
        double p =  (a + b + c) / 2;
        return Math.sqrt(p * (p -a ) * (p - b) * (p - c));
    }
}