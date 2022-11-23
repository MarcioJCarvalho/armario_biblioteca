package br.com.mjc.controller;

import br.com.mjc.dto.BibliotecarioDTO;
import br.com.mjc.dto.InfoDTO;
import br.com.mjc.service.bibliotecario.BibliotecarioService;
import br.com.mjc.service.bibliotecario.BibliotecarioServiceImpl;

public class BibliotecarioController {
    private BibliotecarioServiceImpl bibliotecarioServiceImpl;

    public BibliotecarioController(){
        bibliotecarioServiceImpl = new BibliotecarioServiceImpl();
    }
    public InfoDTO cadastar(BibliotecarioDTO bibliotecarioDTO){
        return bibliotecarioServiceImpl.cadastar(bibliotecarioDTO);
    }
}
