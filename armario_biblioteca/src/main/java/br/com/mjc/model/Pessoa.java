package br.com.mjc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Loader;

import java.time.LocalDateTime;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class Pessoa{
    @Column(name = "email", unique = true, nullable = false, length = 100)
    private String email;

    @Column(name = "telefone", nullable = false, length = 14)
    private String telefone;

    @Column(name = "senha", nullable = false, length = 64)
    private String senha;

    @Column(name ="avito", nullable = false, columnDefinition = "bit default 1")
    private Boolean ativo;

    @Column(name = "data_atualizacao")
    private LocalDateTime dataAtualizacao = LocalDateTime.now();
    
    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao = LocalDateTime.now();
}
