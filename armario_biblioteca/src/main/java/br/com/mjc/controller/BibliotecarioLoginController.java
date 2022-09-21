package br.com.mjc.controller;
import br.com.mjc.service.BibliotecarioLoginService;
public class BibliotecarioLoginController {
    public static String logar(String siape, String senha){
        return BibliotecarioLoginService.loginOk(siape, senha);
    }
}
