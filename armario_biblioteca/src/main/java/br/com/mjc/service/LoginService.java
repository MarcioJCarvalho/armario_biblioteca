package br.com.mjc.service;
public class LoginService {
    public static String loginCheck(String email, String senha) {
        if(email.equals("genericemail@email.com")){
            if(senha.equals("12345678")){
                return "Logado com sucesso!";
            }
            return "Senha inválida!";
        }
        return "E-mail inválido!";
    }
}
