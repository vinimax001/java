package br.com.java.estudos.poo.exercicios.exercicio004.util;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double converter(double dolar, double quant){
        return dolar * quant * (1.0 + IOF);
    }
}
