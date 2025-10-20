package br.com.vinicius;

import org.w3c.dom.ls.LSOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.setModelo("LEITURA");
        //c1.modelo = "bic";
        c1.setPonta(0.5f);
        c1.setCor("Azul");
        c1.destampar();
        //System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
        c1.status();

        Caneta c2 = new Caneta();
        c2.status();
    }

}