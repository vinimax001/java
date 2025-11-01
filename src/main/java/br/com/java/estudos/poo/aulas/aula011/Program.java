package br.com.java.estudos.poo.aulas.aula011;

import br.com.java.estudos.poo.aulas.aula011.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the quantity of products: ");
        int n = sc.nextInt();

        double sum = 0.0;
        Product[] product = new Product[n];
        for (int i = 0; i < product.length; i++) {
            sc.nextLine();
            System.out.print("Enter the product name: ");
            String name = sc.nextLine();
            System.out.print("Enter the product price: ");
            double price = sc.nextDouble();
            product[i] = new Product(name, price);
            sum += product[i].getPrice();
        }

        double avg = sum / product.length;

        System.out.println("Average price: " + String.format("%.2f", avg));

        sc.close();
    }
}
