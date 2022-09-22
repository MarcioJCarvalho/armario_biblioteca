package br.com.mjc;

import br.com.mjc.connection.HibernateUtil;
import br.com.mjc.model.Emprestimo;
import br.com.mjc.service.EmprestimoService;
import br.com.mjc.view.MainMenuUI;
import org.hibernate.Session;

public class Main {

    public static void main(String[] args) {
//        MainMenuUI mainMenuUI = new MainMenuUI();
//        mainMenuUI.setVisible(true);
        
        

        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        Emprestimo emprestimo = new Emprestimo();
        EmprestimoService.emprestar(emprestimo);
        sessao.save(emprestimo);
        sessao.getTransaction().commit();
        HibernateUtil.encerraSession();

    }
}
