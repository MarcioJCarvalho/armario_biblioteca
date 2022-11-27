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
@MappedSuperclass
public class Pessoa{
    @Column(name = "email", unique = true, nullable = false, length = 100)
    private String email;

    @Column(name = "telefone", nullable = false, length = 11)
    private String telefone;

    @Column(name = "senha", nullable = false, length = 64)
    private String senha;

    @Column(name ="avito", nullable = false, length = 1)
    private Boolean ativo;

    @Column(name = "data_atualizacao")
    private LocalDateTime dataAtualizacao;
    
    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    public Pessoa() {
        this.dataCriacao = LocalDateTime.now();
        this.dataAtualizacao = LocalDateTime.now();
        this.ativo = true;
    }
}
