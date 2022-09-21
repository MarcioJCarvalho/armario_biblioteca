package br.com.mjc.model;

public class Armario {
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
