package br.com.mjc.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "tb_estudante")
public class Estudante extends Pessoa{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "ra", unique = true, nullable = false, length = 30)
    private String ra;

    public Estudante() {
    }

    public Estudante(Integer id, String nome, String email, String telefone, String senha, boolean ativo, Date dataAtualizacao, Date dataCriacao, Integer id1, String ra) {
        super(id, nome, email, telefone, senha, ativo, dataAtualizacao, dataCriacao);
        this.id = id1;
        this.ra = ra;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
}
