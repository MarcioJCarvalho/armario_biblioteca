package br.com.mjc.controller;
import br.com.mjc.dto.AdminDTO;
import br.com.mjc.dto.InfoDTO;
import br.com.mjc.service.AdminServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class AdminController {
    private AdminServiceImpl loginServiceImpl;

    public AdminController(){
        loginServiceImpl = new AdminServiceImpl();
    }
    public InfoDTO logar(AdminDTO adminDTO) {
        return loginServiceImpl.logar(adminDTO);
    }
}
