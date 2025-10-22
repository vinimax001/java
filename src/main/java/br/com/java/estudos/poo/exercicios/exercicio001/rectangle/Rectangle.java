package br.com.java.estudos.poo.exercicios.exercicio001.rectangle;

public class Rectangle {

    //ATRIBUTOS
    public double width;
    public double height;

    //METODOS
    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public double diagonal() {
        return Math.hypot(width, height);//calculo de diagonal da biblioteca Math
    }

}
