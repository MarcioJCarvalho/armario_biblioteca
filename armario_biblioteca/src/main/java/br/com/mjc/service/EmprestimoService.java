package br.com.mjc.service;

import br.com.mjc.dao.EmprestimoDaoImpl;
import br.com.mjc.dao.EmprestimoDao;
import br.com.mjc.model.Emprestimo;
import java.util.List;

public class EmprestimoService {
    private static EmprestimoDaoImpl dao = new EmprestimoDaoImpl();
    
    public static List<Emprestimo> buscarTodos(){
        return dao.buscarTodos();
    }
    
    public static Emprestimo buscarPorId(Integer id){
        return dao.buscarPorId(id);
    }
    
    public static void emprestar(Emprestimo emprestimo){
        dao.emprestar(emprestimo);
    }
    
    public static void devolver(Emprestimo emprestimo){
        dao.devolver(emprestimo);
    }
    
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
