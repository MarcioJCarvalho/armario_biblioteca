package br.com.mjc.model;

import java.sql.Date;

public class Bibliotecario extends Pessoa{
    private String siape;


    public Bibliotecario() {
    }

    public Bibliotecario(String siape, String nome, String email, String telefone, String senha, boolean ativo, Date dataAtualizacao, Date dataCriacao) {
        super(nome, email, telefone, senha, ativo, dataAtualizacao, dataCriacao);
        this.siape = siape;
    }

    public String getSiape() {
        return this.siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

}
