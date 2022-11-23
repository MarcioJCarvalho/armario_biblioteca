package br.com.mjc.dao.bibliotecario;

import br.com.mjc.dto.InfoDTO;
import br.com.mjc.model.Bibliotecario;

public interface BibliotecarioDAO{
    InfoDTO cadastrar(Bibliotecario bibliotecario);

    InfoDTO alterar(Bibliotecario bibliotecario);
}
