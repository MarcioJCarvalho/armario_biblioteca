package br.com.mjc.dao;

import java.util.List;
import br.com.mjc.model.Emprestimo;

public interface EmprestimoDao {
    public List<Emprestimo> buscarTodos();
    public Emprestimo buscarPorId(Integer id);
    public void emprestar(Emprestimo emprestimo);
    public void devolver(Emprestimo emprestimo);
}
