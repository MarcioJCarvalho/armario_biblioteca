package br.com.mjc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class AdminDTO{
//    private String nome;
//    private String cpf;
    private String email;
//    private String telefone;
    private String senha;

//    public AdminDTO(AdminDTO adminDTO){
//        this.nome = adminDTO.getNome() != null ? adminDTO.getNome() : null;
//        this.cpf = adminDTO.getCpf() != null ? adminDTO.getCpf() : null;
//        this.email = adminDTO.getEmail() != null ? adminDTO.getEmail() : null;
//        this.telefone = adminDTO.getTelefone() != null ? adminDTO.getTelefone() : null;
//        this.senha = adminDTO.getSenha() != null ? adminDTO.getSenha() : null;
//    }
}
