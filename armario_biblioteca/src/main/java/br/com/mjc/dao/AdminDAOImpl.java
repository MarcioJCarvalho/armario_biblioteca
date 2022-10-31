package br.com.mjc.dao;

import br.com.mjc.dto.InfoDTO;
import br.com.mjc.enums.Retorno;
import br.com.mjc.model.Admin;

import javax.swing.*;

public class AdminDAOImpl implements AdminDAO {
    private ConexaoDAO conexaoDAO;

    @Override
    public InfoDTO logar(Admin admin) {
        InfoDTO infoDTO = new InfoDTO();
        try {
            conexaoDAO.getEntityManager().getTransaction().begin();
            conexaoDAO.getEntityManager().getProperties().get(admin.getEmail());
            conexaoDAO.getEntityManager().getProperties().get(admin.getSenha());

//            admin.setEmail(adminDTO.getEmail());
//            admin.setSenha(adminDTO.getSenha());
//            Admin adminLogado = (Admin) conexaoDAO.getEntityManager().getTransaction().getClass();
            conexaoDAO.getEntityManager().getTransaction().commit();
            infoDTO.setStatus(String.valueOf(Retorno.SUCESSO));
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "AdminDAO: " + erro, "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        return infoDTO;
    }
}
