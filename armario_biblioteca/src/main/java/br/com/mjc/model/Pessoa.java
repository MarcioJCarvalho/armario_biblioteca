package br.com.mjc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDateTime;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "email", unique = true, nullable = false, length = 100)
    private String email;

    @Column(name = "telefone", nullable = false, length = 14)
    private String telefone;

    @Column(name = "senha", nullable = false, length = 64)
    private String senha;

    @Column(name = "ativo", columnDefinition = "bit default 1", nullable = false)
    private boolean ativo;
    
    @Column(name = "data_atualizacao")
    private LocalDateTime dataAtualizacao = LocalDateTime.now();
    
    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao = LocalDateTime.now();
}

// para criação de constraints
//@Table(uniqueConstraints = { @UniqueConstraint(name = "UniqueNumberAndStatus", columnNames = { "personNumber", "isActive" }) })