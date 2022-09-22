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

    public Pessoa() {
    }

    public Pessoa(Integer id, String nome, String email, String telefone, String senha, boolean ativo, Date dataAtualizacao, Date dataCriacao) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
        this.ativo = ativo;
        this.dataAtualizacao = dataAtualizacao;
        this.dataCriacao = dataCriacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
