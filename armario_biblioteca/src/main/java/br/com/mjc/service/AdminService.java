package br.com.mjc.service;

import br.com.mjc.dto.AdminDTO;
import br.com.mjc.dto.InfoDTO;

public interface AdminService {
    InfoDTO logar(AdminDTO adminDTO);
}
