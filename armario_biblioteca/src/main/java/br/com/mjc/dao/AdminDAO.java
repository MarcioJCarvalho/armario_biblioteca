package br.com.mjc.dao;

import br.com.mjc.dto.InfoDTO;
import br.com.mjc.model.Admin;

public interface AdminDAO {
    public InfoDTO logar(Admin admin);
}
