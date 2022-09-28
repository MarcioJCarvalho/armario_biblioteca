package br.com.mjc;
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

//        Armario a1 = new Armario("01", true, "");
//        Armario a2 = new Armario("02", true, "");
//        Armario a3 = new Armario("03", true, "");
//
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia-jpa");
//        EntityManager em = emf.createEntityManager();
//
//        em.getTransaction().begin();
//        em.persist(a1);
//        em.persist(a2);
//        em.persist(a3);
//        em.getTransaction().commit();
//        System.out.println("Pronto!");
    }
}
