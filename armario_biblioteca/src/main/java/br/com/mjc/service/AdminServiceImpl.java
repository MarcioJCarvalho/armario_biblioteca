package br.com.mjc.service;

import br.com.mjc.dao.AdminDAOImpl;
import br.com.mjc.dto.AdminDTO;
import br.com.mjc.dto.InfoDTO;
import br.com.mjc.model.Admin;

public class AdminServiceImpl implements AdminService {
    private AdminDAOImpl adminDAOImpl;
    public InfoDTO logar(AdminDTO adminDTO){
        Admin admin = new Admin();
        admin.setSenha(adminDTO.getSenha());
        admin.setEmail(adminDTO.getEmail());
        return adminDAOImpl.logar(admin);
    }
}