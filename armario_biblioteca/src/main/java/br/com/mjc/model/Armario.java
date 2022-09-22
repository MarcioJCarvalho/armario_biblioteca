package br.com.mjc.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_armario")
public class Armario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "ra", unique = true, nullable = false)
    private String numero;
    private boolean ativo;
    private String observacao;


    public Armario() {
    }


    public Armario(String numero, boolean ativo, String observacao) {
        this.numero = numero;
        this.ativo = ativo;
        this.observacao = observacao;
    }


    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isAtivo() {
        return this.ativo;
    }

    public boolean getAtivo() {
        return this.ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getObservacao() {
        return this.observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

}
