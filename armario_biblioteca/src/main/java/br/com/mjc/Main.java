package br.com.mjc;
import br.com.mjc.model.Admin;
import br.com.mjc.model.Armario;
import br.com.mjc.model.Emprestimo;
import br.com.mjc.service.EmprestimoService;
import br.com.mjc.view.MainMenuUI;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        MainMenuUI mainMenuUI = new MainMenuUI();
        mainMenuUI.setVisible(true);

//        Armario a1 = new Armario();
//        Armario a2 = new Armario();
//        Armario a3 = new Armario();

//        Admin adm = new Admin();
//        adm.setCpf("067.171.669-70");
//        adm.setEmail("marciojosedecarvalho@gmail.com");
//        adm.setNome("Márcio José de Carvalho");
//        adm.setSenha("adm123456");
//        adm.setTelefone("(44)99148-5633");

//        a1.setNumero("01");
//        a2.setNumero("02");
//        a3.setNumero("03");

//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia-jpa");
//        EntityManager em = emf.createEntityManager();
//
//        em.getTransaction().begin();
//        em.persist(a1);
//        em.persist(a2);
//        em.persist(a3);
//        em.persist(adm);
//        em.getTransaction().commit();
//        System.out.println("Pronto!");
    }
}
