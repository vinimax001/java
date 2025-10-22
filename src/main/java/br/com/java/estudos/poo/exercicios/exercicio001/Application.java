package br.com.java.estudos.poo.exercicios.exercicio001;

import br.com.java.estudos.poo.exercicios.exercicio001.rectangle.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        //Definindo localização padrão para US
        Locale.setDefault(Locale.US);

        //Instanciando novo Scanner com metodo de leitura System.in
        Scanner sc = new Scanner(System.in);

        //Instanciando novo objeto rectangle da classe Rectangle
        Rectangle rectangle = new Rectangle();

        //Entrada de dados para os atributos
        System.out.println("Enter rectangle width and height:");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        //Variavel area recebendo resultado do metodo area
        double area = rectangle.area();
        System.out.printf("AREA = %.2f%n", area);

        //Variavel perimeter recebendo resultado do metodo perimeter
        double perimeter = rectangle.perimeter();
        System.out.printf("PERIMETER = %.2f%n", perimeter);

        //Variavel diagonal recebendo resultado do metodo diagonal
        double diagonal = rectangle.diagonal();
        System.out.printf("DIAGONAL = %.2f%n", diagonal);

    }
}
