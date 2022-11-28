package br.com.mjc.dao.bibliotecario;

import br.com.mjc.dto.InfoDTO;
import br.com.mjc.enums.Status;
import br.com.mjc.model.Bibliotecario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.ArrayList;
import java.util.List;

public class BibliotecarioDAOImpl implements BibliotecarioDAO {
    private InfoDTO infoDTO;
    private EntityManagerFactory emf;
    private EntityManager em;

    public BibliotecarioDAOImpl() {
        infoDTO = new InfoDTO();
//        emf = Persistence.createEntityManagerFactory("persistencia-jpa");
//        em = emf.createEntityManager();
    }

    @Override
    public InfoDTO cadastrar(Bibliotecario bibliotecario) {
        infoDTO = verificarSeJaExiste(bibliotecario);
        if (!infoDTO.getStatus().equals(Status.INVALIDO)) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia-jpa");
            EntityManager em = emf.createEntityManager();
            try {
                em.getTransaction().begin();
                em.persist(bibliotecario);
                em.getTransaction().commit();
                em.close();
                infoDTO.setMensagem("Bibliotecário cadastrado com sucesso!");
                infoDTO.setStatus(Status.SUCESSO);
            } catch (Exception ex) {
                ex.printStackTrace();
                em.getTransaction().rollback();
                em.close();
                infoDTO.setMensagem("Houve um problema ao tentar cadastrar o bibliotecário!");
                infoDTO.setStatus(Status.ERRO);
            }
        }
        return infoDTO;
    }

    @Override
    public InfoDTO alterar(Bibliotecario bibliotecario) {
        infoDTO = verificarSeJaExiste(bibliotecario);
        if (!infoDTO.getStatus().equals(Status.INVALIDO)){
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia-jpa");
            EntityManager em = emf.createEntityManager();
            try {
                em.getTransaction().begin();
                em.merge(bibliotecario);
                em.getTransaction().commit();
                em.close();
                infoDTO.setMensagem("Bibliotecário alterado com sucesso!");
                infoDTO.setStatus(Status.SUCESSO);
            } catch (Exception ex) {
                ex.printStackTrace();
                em.getTransaction().rollback();
                em.close();
                infoDTO.setMensagem("Houve um problema ao tentar alterar o bibliotecário!");
                infoDTO.setStatus(Status.ERRO);
            }
        }
        return infoDTO;
    }

    @Override
    public List<Bibliotecario> listar() {
        List<Bibliotecario> bibliotecarioList = new ArrayList<>();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia-jpa");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            Query consulta = em.createQuery("SELECT DISTINCT b from Bibliotecario b WHERE b.ativo = true");
            bibliotecarioList = consulta.getResultList();
            em.getTransaction().commit();
            em.close();
        } catch (Exception ex){
            ex.printStackTrace();
            em.close();
            infoDTO.setMensagem("Houve um problema ao tentar listar os bibliotecários!");
            infoDTO.setStatus(Status.ERRO);
        }
        return bibliotecarioList;
    }

    @Override
    public List<Bibliotecario> listarDesativados() {
        List<Bibliotecario> bibliotecarioList = new ArrayList<>();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia-jpa");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            Query consulta = em.createQuery("SELECT DISTINCT b from Bibliotecario b WHERE b.ativo = false");
            bibliotecarioList = consulta.getResultList();
            em.getTransaction().commit();
            em.close();
        } catch (Exception ex){
            ex.printStackTrace();
            em.close();
            infoDTO.setMensagem("Houve um problema ao tentar listar os bibliotecários!");
            infoDTO.setStatus(Status.ERRO);
        }
        return bibliotecarioList;
    }

    @Override
    public Bibliotecario buscarPorSiape(String siape) {
        Bibliotecario bibliotecario = new Bibliotecario();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia-jpa");
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            bibliotecario = (Bibliotecario) em.createQuery(
                            "SELECT b FROM Bibliotecario b WHERE b.siape LIKE :siape")
                    .setParameter("siape", siape)
                    .getSingleResult();
            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            e.printStackTrace();
            em.close();
            throw new RuntimeException(e);
        }
        return bibliotecario;
    }

    @Override
    public InfoDTO excluirLogica(Bibliotecario bibliotecario) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia-jpa");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            em.merge(bibliotecario);
            em.getTransaction().commit();
            em.close();
            infoDTO.setMensagem("Bibliotecário desativado com sucesso!");
            infoDTO.setStatus(Status.SUCESSO);
        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
            em.close();
            infoDTO.setMensagem("Houve um problema ao tentar desativar o bibliotecário!");
            infoDTO.setStatus(Status.ERRO);
        }
        return infoDTO;
    }

    private InfoDTO verificarSeJaExiste(Bibliotecario bibliotecario) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        List<Bibliotecario> cpfJaExiste = (List<Bibliotecario>) em.createQuery(
                "SELECT b FROM Bibliotecario b WHERE b.cpf LIKE :cpf")
                .setParameter("cpf", bibliotecario.getCpf())
                .getResultList();
        em.getTransaction().commit();
        if (cpfJaExiste != null && cpfJaExiste.size() > 0) {
            cpfJaExiste.forEach(usuarioId ->{
                if (!usuarioId.getId().equals(bibliotecario.getId())){
                    infoDTO.setMensagem("Já existe um bibliotecário com esse CPF no sistema!\n");
                    infoDTO.setStatus(Status.INVALIDO);
                    em.close();
                }
            });

            if (infoDTO.getStatus() != null){
                return infoDTO;
            }
        }

        em.getTransaction().begin();
        List<Bibliotecario> emailJaExiste = (List<Bibliotecario>) em.createQuery(
                "SELECT b FROM Bibliotecario b WHERE b.email LIKE :email")
                .setParameter("email", bibliotecario.getEmail())
                .getResultList();
        em.getTransaction().commit();
        if (emailJaExiste != null && emailJaExiste.size() > 0) {
            emailJaExiste.forEach(usuarioId ->{
                if (!usuarioId.getId().equals(bibliotecario.getId())){
                    infoDTO.setMensagem("Já existe um bibliotecário com esse e-mail no sistema!\n");
                    infoDTO.setStatus(Status.INVALIDO);
                    em.close();
                }
            });

            if (infoDTO.getStatus() != null){
                return infoDTO;
            }
        }

        em.getTransaction().begin();
        List<Bibliotecario> siapeJaExiste = (List<Bibliotecario>) em.createQuery(
                "SELECT b FROM Bibliotecario b WHERE b.siape LIKE :siape")
                .setParameter("siape", bibliotecario.getSiape())
                .getResultList();
        em.getTransaction().commit();
        if (siapeJaExiste != null && siapeJaExiste.size() > 0) {
            siapeJaExiste.forEach(usuarioId ->{
                if (!usuarioId.getId().equals(bibliotecario.getId())){
                    infoDTO.setMensagem("Já existe um bibliotecário com esse siape no sistema!\n");
                    infoDTO.setStatus(Status.INVALIDO);
                    em.close();
                }
            });

            if (infoDTO.getStatus() != null){
                return infoDTO;
            }
        }

        infoDTO.setStatus(Status.OK);
        infoDTO.setMensagem("");
        em.close();
        return infoDTO;
    }
}
