package br.com.mjc.utils;

public class Mascara {
    public static String cpf(String CPF) {
        if (CPF.length() == 3) {CPF += ".";}
        if (CPF.length() == 7) {CPF += ".";}
        if (CPF.length() == 11) {CPF += "-";}
        return CPF.replaceAll("[A-Za-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ]", "");
    }

    public static String telefone(String telefone) {
        if (telefone.length() == 2){telefone = "("+telefone+") ";}
        if (telefone.length() == 10){telefone += "-";}
        return telefone.replaceAll("[A-Za-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ]", "");
    }
}
