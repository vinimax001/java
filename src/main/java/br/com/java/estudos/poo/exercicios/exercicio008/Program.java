package br.com.java.estudos.poo.exercicios.exercicio008;

import br.com.java.estudos.poo.exercicios.exercicio008.entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people do you want to analyze? ");
        int n = sc.nextInt();

        Person[] vect = new Person[n];

        sc.nextLine();
        double averHeight = 0.0;
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%dº Person data:%n", i + 1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Height: ");
            double height = sc.nextDouble();
            sc.nextLine();
            vect[i] = new Person(name, age, height);
            averHeight += vect[i].getHeight();
        }

        System.out.printf("Average Height: %.2f%n", (averHeight / vect.length));

        int age16 = 0;
        System.out.println("People under the age of 16:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16) {
                System.out.println(vect[i].getName());
                age16++;
            }
        }

        System.out.printf("We have %.1f%% of people under 16 years old.", (age16 * 100.0) / vect.length);

        sc.close();
    }
}