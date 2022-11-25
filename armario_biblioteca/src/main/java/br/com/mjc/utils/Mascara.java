package br.com.mjc.utils;

import javax.swing.*;
import javax.swing.text.MaskFormatter;

public class Mascara {
    public static String Cpf(String CPF) {
        if (CPF.length() == 3){CPF += ".";}
        if (CPF.length() == 7){CPF += ".";}
        if (CPF.length() == 11){CPF += "-";}
        return CPF.replaceAll("[A-Za-z]", "");
    }
}
