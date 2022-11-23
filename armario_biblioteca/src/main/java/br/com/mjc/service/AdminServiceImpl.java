package br.com.mjc.service;

import br.com.mjc.dao.admin.AdminDAOImpl;
import br.com.mjc.dto.AdminDTO;
import br.com.mjc.dto.InfoDTO;
import br.com.mjc.model.Admin;

public class AdminServiceImpl implements AdminService {
    private AdminDAOImpl adminDAOImpl;
    public AdminServiceImpl(){
        adminDAOImpl = new AdminDAOImpl();
    }
    public InfoDTO logar(AdminDTO adminDTO){
        Admin admin = new Admin();
        admin.setSenha(adminDTO.getSenha());
        admin.setEmail(adminDTO.getEmail());
        return adminDAOImpl.logar(admin);
    }
}