package br.com.java.estudos.poo.exercicios.exercicio002.salary;

public class Employee {

    //ATRIBUTOS
    public String name;
    public double grossSalary;
    public double tax;

    //ATRIBUTOS
    public double netSalary() {
        return grossSalary - tax;
    }

    public double increaseSalary(double percentage) {
        return this.netSalary() + (grossSalary  * percentage / 100);
    }

    public String toString() {
        return name + ", $ ";
    }
}
