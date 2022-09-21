package br.com.mjc.model;

import java.sql.Date;

public class Estudante extends Pessoa{
    private String ra;


    public Estudante() {
    }

    public Estudante(String ra, String nome, String email, String telefone, String senha, boolean ativo, Date dataAtualizacao, Date dataCriacao) {
        super(nome, email, telefone, senha, ativo, dataAtualizacao, dataCriacao);
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }    
}
