package br.com.vinicius;

public class Caneta {

    //ATRIBUTOS
    public String modelo;
    private Float ponta;
    private String cor;
    public boolean tampada;

    //metodo costrutor
    public Caneta(){
        this.setModelo("Bic");
        this.setPonta(1.5f);
        this.setCor("Preta");
        this.setTampada(true);
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }

    public Float getPonta(){
        return this.ponta;
    }
    public void setPonta(Float p){
        this.ponta = p;
    }

    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }


    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    public boolean getTampada(){
        return this.tampada;
    }
    public void setTampada(boolean t){
        this.tampada = t;
    }


    public void status(){
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo: "+ this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tampada: " + this.getTampada());
    }

}