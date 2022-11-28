package br.com.mjc.controller;

import br.com.mjc.dto.BibliotecarioDTO;
import br.com.mjc.dto.InfoDTO;
import br.com.mjc.model.Bibliotecario;
import br.com.mjc.service.bibliotecario.BibliotecarioService;
import br.com.mjc.service.bibliotecario.BibliotecarioServiceImpl;

import java.util.List;

public class BibliotecarioController {
    private BibliotecarioServiceImpl bibliotecarioServiceImpl;

    public BibliotecarioController(){
        bibliotecarioServiceImpl = new BibliotecarioServiceImpl();
    }
    public InfoDTO cadastar(BibliotecarioDTO bibliotecarioDTO){
        return bibliotecarioServiceImpl.cadastar(bibliotecarioDTO);
    }

    public InfoDTO alterar(BibliotecarioDTO bibliotecarioDTO){
        return bibliotecarioServiceImpl.alterar(bibliotecarioDTO);
    }

    public InfoDTO excluirLogica(BibliotecarioDTO bibliotecarioDTO){
        return bibliotecarioServiceImpl.excluirLogica(bibliotecarioDTO);
    }

    public List<Bibliotecario> listarTodos(){
        return bibliotecarioServiceImpl.listar();
    }

    public List<Bibliotecario> listarDesativados(){
        return bibliotecarioServiceImpl.listarDesativados();
    }

    public BibliotecarioDTO buscarPorSiape(String siape){
        return bibliotecarioServiceImpl.buscarPorSiape(siape);
    }
}
