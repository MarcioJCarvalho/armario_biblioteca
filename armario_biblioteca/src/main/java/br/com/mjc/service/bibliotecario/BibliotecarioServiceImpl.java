package br.com.mjc.service.bibliotecario;

import br.com.mjc.dao.bibliotecario.BibliotecarioDAOImpl;
import br.com.mjc.dto.BibliotecarioDTO;
import br.com.mjc.dto.InfoDTO;
import br.com.mjc.model.Bibliotecario;

import java.util.List;

public class BibliotecarioServiceImpl implements BibliotecarioService{

    private BibliotecarioDAOImpl bibliotecarioDAOImpl;

    public BibliotecarioServiceImpl(){
        bibliotecarioDAOImpl = new BibliotecarioDAOImpl();
    }

    @Override
    public List<BibliotecarioDTO> listar() {
        return null;
    }

    @Override
    public InfoDTO cadastar(BibliotecarioDTO bibliotecarioDTO) {
        Bibliotecario bibliotecario = new Bibliotecario();
        bibliotecario.setNome(bibliotecarioDTO.getNome());
        bibliotecario.setEmail(bibliotecarioDTO.getEmail());
        bibliotecario.setCpf(bibliotecarioDTO.getCpf());
        bibliotecario.setSiape(bibliotecarioDTO.getSiape());
        return bibliotecarioDAOImpl.cadastrar(bibliotecario);
    }

    @Override
    public InfoDTO alterar(BibliotecarioDTO bibliotecarioDTO) {
        return null;
    }

    @Override
    public InfoDTO deletar(BibliotecarioDTO bibliotecarioDTO) {
        return null;
    }

    @Override
    public InfoDTO buscarPorId(Long id) {
        return null;
    }
}
