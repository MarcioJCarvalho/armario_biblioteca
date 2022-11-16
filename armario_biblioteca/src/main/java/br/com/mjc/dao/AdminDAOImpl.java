package br.com.mjc.dao;

import br.com.mjc.conexao.Conexao;
import br.com.mjc.dto.InfoDTO;
import br.com.mjc.enums.Mensagem;
import br.com.mjc.model.Admin;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AdminDAOImpl implements AdminDAO {
    @Override
    public InfoDTO logar(Admin admin) {
        InfoDTO infoDTO = new InfoDTO();
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia-jpa");
            EntityManager em = emf.createEntityManager();;

            em.getTransaction().begin();

            Admin adminLogado = (Admin) em.createQuery(
                    "SELECT a from Admin a where a.email LIKE :email and a.senha = :senha")
                    .setParameter("email", admin.getEmail())
                    .setParameter("senha", admin.getSenha()).getSingleResult();

            em.getTransaction().commit();
            infoDTO.setObject(adminLogado);
            infoDTO.setStatus(String.valueOf(Mensagem.SUCESSO));
        } catch (Exception erro) {
//            conexao.conectar().close();
            if (infoDTO.getObject() == null){
                infoDTO.setMensagem("Usuário ou senha inválido!");
                infoDTO.setStatus(String.valueOf(Mensagem.ERRO));
            } else {
                infoDTO.setStatus(String.valueOf(Mensagem.FALHA));
                infoDTO.setMensagem("Houve um problema ao tentar se conectar com o servidor!");
            }
        }
        return infoDTO;
    }
}
