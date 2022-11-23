package br.com.mjc.dao.admin;


import br.com.mjc.dto.InfoDTO;
import br.com.mjc.enums.Status;
import br.com.mjc.model.Admin;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AdminDAOImpl implements AdminDAO {
    @Override
    public InfoDTO logar(Admin admin) {
        InfoDTO infoDTO = new InfoDTO();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia-jpa");
        EntityManager em = emf.createEntityManager();
        try {

            em.getTransaction().begin();

            Admin adminLogado = (Admin) em.createQuery(
                    "SELECT a from Admin a where a.email LIKE :email and a.senha = :senha")
                    .setParameter("email", admin.getEmail())
                    .setParameter("senha", admin.getSenha()).getSingleResult();

            em.getTransaction().commit();
            infoDTO.setObject(adminLogado);
            infoDTO.setStatus(Status.SUCESSO);
        } catch (Exception erro) {
            if (infoDTO.getObject() == null){
                infoDTO.setMensagem("Usuário ou senha inválido!");
                infoDTO.setStatus(Status.ERRO);
            } else {
                infoDTO.setStatus(Status.FALHA);
                infoDTO.setMensagem("Houve um problema ao tentar se conectar com o servidor!");
            }
        }
        return infoDTO;
    }
}
