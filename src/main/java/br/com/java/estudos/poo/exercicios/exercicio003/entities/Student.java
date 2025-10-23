package br.com.java.estudos.poo.exercicios.exercicio003.entities;

public class Student {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public void finalGrade(){
        double maxgrade = 100.00;
        double finalgrade = (nota1 + nota2 + nota3);
        double aprovalgrade = 60;
        if (finalgrade >= aprovalgrade) {
            System.out.printf("FINAL GRADE = %.2f%n", finalgrade);
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("FINAL GRADE = %.2f%n", finalgrade);
            double missing = aprovalgrade - finalgrade;
            System.out.printf("MISSING %.2f POINTS%n", missing);
        }
    }
}