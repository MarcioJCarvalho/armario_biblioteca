package br.com.mjc.utils;

public class Formato {
    public static String telefone(String telefone) {
        String ddd = "(" + telefone.substring(0, 2) + ") ";
        String fone = telefone.substring(2, 7) + "-" + telefone.substring(7);
        return ddd + fone;
    }
}
