package br.com.mjc.dao.bibliotecario;

import br.com.mjc.dto.BibliotecarioDTO;
import br.com.mjc.dto.InfoDTO;
import br.com.mjc.model.Bibliotecario;

import java.util.List;

public interface BibliotecarioDAO{
    InfoDTO cadastrar(Bibliotecario bibliotecario);

    InfoDTO alterar(Bibliotecario bibliotecario);
    List<Bibliotecario> listar();

    Bibliotecario buscarPorSiape(String siape);

}
