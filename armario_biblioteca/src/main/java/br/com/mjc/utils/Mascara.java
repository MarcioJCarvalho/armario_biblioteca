package br.com.mjc.utils;

public class Mascara {
    public static String Cpf(String CPF) {
        if (CPF.length() == 3) {
            CPF += ".";
        }
        if (CPF.length() == 7) {
            CPF += ".";
        }
        if (CPF.length() == 11) {
            CPF += "-";
        }
        return CPF.replaceAll("[A-Za-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ]", "");
    }

    public static String Telefone(String telefone) {
        String ddd = "";
        String celular;
        if (telefone.length() == 2 && ddd.isEmpty()) {
            ddd = "(" + telefone.substring(0, 2) + ")";
        }
        celular = telefone.substring(4);
//        if (celular.length() == 8) {
//            celular = telefone.substring(2, 7) + "-" + telefone.substring(7);
//        }
//        if (celular.length() == 7) {
//            celular = telefone.substring(2, 6) + "-" + telefone.substring(6);
//        }
        return ddd + celular;
    }
}
