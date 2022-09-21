package br.com.mjc.service;
public class BibliotecarioLoginService {
    public static String loginOk(String siape, String senha){
        if(siape.equals("siape")){
            if(senha.equals("12345678")){
                return "Logado com sucesso!";
            }
            return "Senha incorréta!";
        }
        return "Siape inexistente!";
    }
}
