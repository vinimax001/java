package br.com.java.estudos.poo.exercicios.exercicio002;

import br.com.java.estudos.poo.exercicios.exercicio002.salary.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //Definindo padrao para us
        Locale.setDefault(Locale.US);
        //Instanciando um novo Scanner para ler o dados
        Scanner sc = new Scanner(System.in);

        //Instanciando novo objeto da classe Employee
        Employee employee = new Employee();

        //Entrando com os dados para os atributos do objeto instanciado
        System.out.print("NAME: ");
        employee.name = sc.nextLine();
        System.out.print("GROSS SALARY: ");
        employee.grossSalary =  sc.nextDouble();
        System.out.print("TAX: ");
        employee.tax = sc.nextDouble();

        //EXIBINDO RESULTADOS
        System.out.println();
        System.out.println("EMPLOYEE: "
                + employee
                + String.format("%.2f", employee.netSalary()));

        //Recebendo atributo tax para meotod increasesalary
        System.out.println();
        System.out.print("Which percentage to increase salary: ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.println("Update data: "
                + employee
                + String.format("%.2f", employee.increaseSalary(percentage)) );

    }
}