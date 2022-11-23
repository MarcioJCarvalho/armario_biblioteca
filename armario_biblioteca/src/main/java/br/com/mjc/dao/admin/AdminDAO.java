package br.com.mjc.dao.admin;

import br.com.mjc.dto.InfoDTO;
import br.com.mjc.model.Admin;

public interface AdminDAO {
    InfoDTO logar(Admin admin);
}
