package br.com.mjc.controller;
import br.com.mjc.service.LoginService;

public class LoginController {
    public static String auth(String email, String senha) {
        return LoginService.loginCheck(email, senha);
    }
}
