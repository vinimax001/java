package br.com.vinicius;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CanetaMain {
    public static void main(String[] args) {

        br.com.vinicius.Caneta01 c1 = new br.com.vinicius.Caneta01();
        c1.setModelo("LEITURA");
        //c1.modelo = "bic";
        c1.setPonta(0.5f);
        c1.setCor("Azul");
        c1.destampar();
        //System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
        c1.status();

        br.com.vinicius.Caneta01 c2 = new br.com.vinicius.Caneta01();
        c2.status();
    }

}