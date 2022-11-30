package br.com.mjc.service.bibliotecario;

import br.com.mjc.dao.bibliotecario.BibliotecarioDAOImpl;
import br.com.mjc.dto.BibliotecarioDTO;
import br.com.mjc.dto.InfoDTO;
import br.com.mjc.model.Bibliotecario;
import br.com.mjc.utils.Tratamento;

import java.time.LocalDateTime;

import java.util.List;

public class BibliotecarioServiceImpl implements BibliotecarioService{

    private BibliotecarioDAOImpl bibliotecarioDAOImpl;

    public BibliotecarioServiceImpl(){
        bibliotecarioDAOImpl = new BibliotecarioDAOImpl();
    }

    @Override
    public List<Bibliotecario> listar() {
        return bibliotecarioDAOImpl.listar();
    }

    @Override
    public List<Bibliotecario> listarDesativados() {
        return bibliotecarioDAOImpl.listarDesativados();
    }

    @Override
    public InfoDTO cadastar(BibliotecarioDTO bibliotecarioDTO) {
        Bibliotecario bibliotecario = new Bibliotecario();
        bibliotecario.setNome(bibliotecarioDTO.getNome());
        bibliotecario.setEmail(bibliotecarioDTO.getEmail());
        bibliotecario.setCpf(bibliotecarioDTO.getCpf());
        bibliotecario.setSiape(bibliotecarioDTO.getSiape());
        bibliotecario.setTelefone(Tratamento.limparNumero(bibliotecarioDTO.getTelefone()));
        bibliotecario.setSenha(bibliotecarioDTO.getSenha());
        return bibliotecarioDAOImpl.cadastrar(bibliotecario);
    }

    @Override
    public InfoDTO alterar(BibliotecarioDTO bibliotecarioDTO) {
        Bibliotecario bibliotecario = new Bibliotecario();
        bibliotecario.setId(bibliotecarioDTO.getId());
        bibliotecario.setNome(bibliotecarioDTO.getNome());
        bibliotecario.setCpf(bibliotecarioDTO.getCpf());
        bibliotecario.setSiape(bibliotecarioDTO.getSiape());
        bibliotecario.setSenha(bibliotecarioDTO.getSenha());
        bibliotecario.setEmail(bibliotecarioDTO.getEmail());
        bibliotecario.setTelefone(Tratamento.limparNumero(bibliotecarioDTO.getTelefone()));
        bibliotecario.setDataCriacao(bibliotecarioDTO.getDataCriacao());
        return bibliotecarioDAOImpl.alterar(bibliotecario);
    }

    @Override
    public InfoDTO deletar(BibliotecarioDTO bibliotecarioDTO) {
        return null;
    }

    @Override
    public InfoDTO buscarPorId(Long id) {
        return null;
    }

    @Override
    public BibliotecarioDTO buscarPorSiape(String siape) {
        BibliotecarioDTO bibliotecarioDTO = new BibliotecarioDTO();
        Bibliotecario bibliotecario = bibliotecarioDAOImpl.buscarPorSiape(siape);
        bibliotecarioDTO.setId(bibliotecario.getId());
        bibliotecarioDTO.setNome(bibliotecario.getNome());
        bibliotecarioDTO.setCpf(bibliotecario.getCpf());
        bibliotecarioDTO.setSiape(bibliotecario.getSiape());
        bibliotecarioDTO.setSenha(bibliotecario.getSenha());
        bibliotecarioDTO.setEmail(bibliotecario.getEmail());
        bibliotecarioDTO.setTelefone(bibliotecario.getTelefone());
        bibliotecarioDTO.setDataCriacao(bibliotecario.getDataCriacao());
        return bibliotecarioDTO;
    }

    @Override
    public InfoDTO excluirLogica(BibliotecarioDTO bibliotecarioDTO) {
        Bibliotecario bibliotecario = new Bibliotecario();
        bibliotecario.setId(bibliotecarioDTO.getId());
        bibliotecario.setNome(bibliotecarioDTO.getNome());
        bibliotecario.setCpf(bibliotecarioDTO.getCpf());
        bibliotecario.setSiape(bibliotecarioDTO.getSiape());
        bibliotecario.setSenha(bibliotecarioDTO.getSenha());
        bibliotecario.setEmail(bibliotecarioDTO.getEmail());
        bibliotecario.setTelefone(Tratamento.limparNumero(bibliotecarioDTO.getTelefone()));
        bibliotecario.setDataCriacao(bibliotecarioDTO.getDataCriacao());
        bibliotecario.setAtivo(false);
        return bibliotecarioDAOImpl.excluirLogica(bibliotecario);
    }

    @Override
    public InfoDTO ativarLogica(BibliotecarioDTO bibliotecarioDTO) {
        Bibliotecario bibliotecario = new Bibliotecario();
        bibliotecario.setId(bibliotecarioDTO.getId());
        bibliotecario.setNome(bibliotecarioDTO.getNome());
        bibliotecario.setCpf(bibliotecarioDTO.getCpf());
        bibliotecario.setSiape(bibliotecarioDTO.getSiape());
        bibliotecario.setSenha(bibliotecarioDTO.getSenha());
        bibliotecario.setEmail(bibliotecarioDTO.getEmail());
        bibliotecario.setTelefone(Tratamento.limparNumero(bibliotecarioDTO.getTelefone()));
        bibliotecario.setDataCriacao(bibliotecarioDTO.getDataCriacao());
        bibliotecario.setAtivo(true);
        return bibliotecarioDAOImpl.ativarLogica(bibliotecario);
    }
}
