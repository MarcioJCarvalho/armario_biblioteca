package br.com.mjc.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "tb_bibliotecario")
public class Bibliotecario extends Pessoa{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "siape", unique = true, nullable = false, length = 30)
    private String siape;

    public Bibliotecario() {
    }

    public Bibliotecario(Integer id, String nome, String email, String telefone, String senha, boolean ativo, Date dataAtualizacao, Date dataCriacao, Integer id1, String siape) {
        super(id, nome, email, telefone, senha, ativo, dataAtualizacao, dataCriacao);
        this.id = id1;
        this.siape = siape;
    }


}
