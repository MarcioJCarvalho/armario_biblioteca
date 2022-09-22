package br.com.mjc;

import br.com.mjc.model.Emprestimo;
import br.com.mjc.service.EmprestimoService;
import br.com.mjc.view.MainMenuUI;

public class Main {

    public static void main(String[] args) {
        MainMenuUI mainMenuUI = new MainMenuUI();
        mainMenuUI.setVisible(true);
        Emprestimo emprestimo = new Emprestimo();
        EmprestimoService.emprestar(emprestimo);

    }
}
