package br.com.java.estudos.poo.exercicios.exercicio003;

import br.com.java.estudos.poo.exercicios.exercicio003.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //DEFININDO PADRÃO AMERICANO PARA NÃO HAVER ERRO NOS DOUBLE
        Locale.setDefault(Locale.US);
        //Instanciando um novo Scanner para receber os dados
        Scanner sc = new Scanner(System.in);

        //Instanciando um novo objeto da classe student
        Student student = new Student();

        //Entrada de dados
        System.out.print("Enter the student's name: ");
        student.name = sc.nextLine();
        System.out.print("Enter the first note: ");
        student.nota1 = sc.nextDouble();
        System.out.print("Enter the second note: ");
        student.nota2 = sc.nextDouble();
        System.out.print("Enter the third note: ");
        student.nota3 = sc.nextDouble();

        student.finalGrade();

        sc.close();
    }
}
