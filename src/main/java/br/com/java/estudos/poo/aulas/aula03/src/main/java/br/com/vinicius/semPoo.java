package br.com.vinicius;

import java.util.Locale;
import java.util.Scanner;

public class semPoo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the measures of triangle X: ");
        double xA = sc.nextFloat();
        double xB = sc.nextFloat();
        double xC = sc.nextFloat();

        System.out.println("Enter the measures of triangle Y: ");
        double yA = sc.nextFloat();
        double yB = sc.nextFloat();
        double yC = sc.nextFloat();

        double p = (xA + xB + xC) /2.0;
        double areaX = Math.sqrt(p *(p - xA) * (p - xB) * (p - xC));
        System.out.printf("Triangle X area: %.4f%n", areaX);

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p *(p - yA) * (p - yB) * (p - yC));
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Larger area X.");
        } else {
            System.out.println("Larger area Y.");
        }

        sc.close();
    }
}