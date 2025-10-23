package br.com.java.estudos.poo.aulas.aula006.entities;

public class Product {

    //ATRIBUTOS
    public String name;
    public Double price;
    public int quantity;

    //CONSTRUTOR
    public Product(String name, Double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //METODOS
    public double totalValueStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueStock());
    }

}