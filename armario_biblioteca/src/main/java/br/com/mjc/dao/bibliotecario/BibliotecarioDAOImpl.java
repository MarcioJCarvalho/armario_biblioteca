package br.com.mjc.dao.bibliotecario;

import br.com.mjc.dto.InfoDTO;
import br.com.mjc.enums.Status;
import br.com.mjc.model.Bibliotecario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.security.PublicKey;

public class BibliotecarioDAOImpl implements BibliotecarioDAO{
    private InfoDTO infoDTO;
    private EntityManagerFactory emf;
    private EntityManager em;

    public BibliotecarioDAOImpl(){
        infoDTO = new InfoDTO();
        emf = Persistence.createEntityManagerFactory("persistencia-jpa");
        em = emf.createEntityManager();
    }

    @Override
    public InfoDTO cadastrar(Bibliotecario bibliotecario) {

        try {
            em.getTransaction().begin();
            em.persist(bibliotecario);
            em.getTransaction().commit();
            infoDTO.setMensagem("Bibliotecário cadastrado com sucesso!");
            infoDTO.setStatus(Status.SUCESSO);
        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
            infoDTO.setMensagem("Houve um problema ao tentar cadastrar o bibliotecário!");
            infoDTO.setStatus(Status.ERRO);
        }
        return infoDTO;
    }

    @Override
    public InfoDTO alterar(Bibliotecario bibliotecario) {
        try {
            em.getTransaction().begin();
            em.merge(bibliotecario);
            em.getTransaction().commit();
            infoDTO.setMensagem("Bibliotecário alterado com sucesso!");
            infoDTO.setStatus(Status.SUCESSO);
        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
            infoDTO.setMensagem("Houve um problema ao tentar alterar o bibliotecário!");
            infoDTO.setStatus(Status.ERRO);
        }
        return infoDTO;
    }
}
