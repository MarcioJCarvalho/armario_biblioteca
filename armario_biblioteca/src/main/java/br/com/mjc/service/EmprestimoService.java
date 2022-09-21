package br.com.mjc.service;
public class EmprestimoService {
    public static String emprestimoOk(String nChave, String ra, String senha) {
        if(nChave.equals("01")){
            if(ra.equals("ra_aluno")){
                if(senha.equals("senha_aluno")){
                    return "Emprestimo realizado com sucesso!";
                }
                return "Senha inválida!";
            }
            return "RA inválido!";
        }
        return "Impossivel realizar emprestimo! verifique as informações";
    }
}
