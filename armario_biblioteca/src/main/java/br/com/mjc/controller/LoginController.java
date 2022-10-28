package br.com.mjc.controller;
import br.com.mjc.service.LoginServiceImpl;

public class LoginController {
    public String logar(String email, String senha) {
        return LoginServiceImpl.logar(email, senha);
    }
}
