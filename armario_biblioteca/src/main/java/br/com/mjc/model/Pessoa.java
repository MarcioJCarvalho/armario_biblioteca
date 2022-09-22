package br.com.mjc.model;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "tb_pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "nome", unique = true, nullable = false, length = 100)
    private String nome;

    @Column(name = "email", unique = true, nullable = false, length = 100)
    private String email;

    @Column(name = "telefone", unique = true, nullable = false, length = 14)
    private String telefone;

    @Column(name = "senha", unique = true, nullable = false, length = 64)
    private String senha;

    @Column(name = "ativo", unique = true, nullable = false, length = 1)
    private boolean ativo;
    
    private Date dataAtualizacao;
    
    private Date dataCriacao;

}
