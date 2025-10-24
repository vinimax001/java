package br.com.java.estudos.poo.aulas.aula008.entities;

public class Product {

    //ATRIBUTOS
    private String name;
    private double price;
    private int quantity;

    //CONSTRUTOR PADRÃO
    public Product() {};

    //CONSTRUTOR
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    //GETTERS E SETTERS
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
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