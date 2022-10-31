package br.com.mjc.controller;
import br.com.mjc.dto.AdminDTO;
import br.com.mjc.dto.InfoDTO;
import br.com.mjc.service.AdminServiceImpl;


public class AdminController {
    private AdminServiceImpl loginServiceImpl;

    public InfoDTO logar(AdminDTO adminDTO) {
        return loginServiceImpl.logar(adminDTO);
    }
}
