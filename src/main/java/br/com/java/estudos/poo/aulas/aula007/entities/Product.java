package br.com.java.estudos.poo.aulas.aula007.entities;

public class Product {

    //ATRIBUTOS
    public String name;
    public double price;
    public int quantity;

    //CONSTRUTOR PADRÃO
    public Product() {};

    //CONSTRUTOR
    public Product(String name, double price){
        this.name = name;
        this.price = price;
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
