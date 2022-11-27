package br.com.mjc.service.bibliotecario;

import br.com.mjc.dto.BibliotecarioDTO;
import br.com.mjc.dto.InfoDTO;
import br.com.mjc.model.Bibliotecario;

import java.util.List;

public interface BibliotecarioService {

    List<Bibliotecario> listar();

    InfoDTO cadastar(BibliotecarioDTO bibliotecarioDTO);

    InfoDTO alterar(BibliotecarioDTO bibliotecarioDTO);

    InfoDTO deletar(BibliotecarioDTO bibliotecarioDTO);

    InfoDTO buscarPorId(Long id);

    BibliotecarioDTO buscarPorSiape(String siape);
}
