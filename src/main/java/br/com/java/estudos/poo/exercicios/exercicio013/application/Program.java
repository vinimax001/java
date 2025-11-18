package br.com.java.estudos.poo.exercicios.exercicio013.application;

import br.com.java.estudos.poo.exercicios.exercicio013.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        //READING DATA:
        System.out.print("How many empoyees will be resgistered? ");
        int n =  sc.nextInt();

        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println("Employee #" + (i + 1) + ": ");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            while(hasId(list, id)){
                System.out.println("Id already taken! Try again: ");
                id = sc.nextInt();
            };

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            list.add(new Employee(id, name, salary));
            System.out.println();
        }

        // UPDATING SALARY OF GIVEN EMPLOYEE:
        System.out.print("Enter the empoyee id that will have salary increase: ");
        int id = sc.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(emp == null){
            System.out.println("This id does not exist!");
        } else {
            System.out.println("Enter the percentage: ");
            double percentage =  sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        // LISTING EMPLOYEES:
        System.out.println();
        System.out.println("List of employees: ");
        for(Employee obj : list){
            System.out.println(obj);
        }

        sc.close();
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
