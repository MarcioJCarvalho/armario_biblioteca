package br.com.mjc.utils;

public class Tratamento {
    private static final String scapeNumber = "[^0-9]";

    public static String limparNumero(String numero){
        return numero.replaceAll(scapeNumber, "");
    }
}
