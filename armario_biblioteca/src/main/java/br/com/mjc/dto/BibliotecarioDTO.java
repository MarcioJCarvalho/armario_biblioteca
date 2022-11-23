package br.com.mjc.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BibliotecarioDTO {
    private Long id;
    private String siape;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String senha;
    private LocalDateTime dataAtualizacao;
    private LocalDateTime dataCriacao;
}
