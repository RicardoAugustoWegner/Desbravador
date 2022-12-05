package br.udesc.desbravador.model;

public class Medalha {

    private int id_medalha;
    private String nome;
    private String descricao;
    private String ativa;
    private String desativada;

    public Medalha() {
    }

    public int getId_medalha() {
        return id_medalha;
    }

    public void setId_medalha(int id_medalha) {
        this.id_medalha = id_medalha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAtiva() {
        return ativa;
    }

    public void setAtiva(String ativa) {
        this.ativa = ativa;
    }

    public String getDesativada() {
        return desativada;
    }

    public void setDesativada(String desativada) {
        this.desativada = desativada;
    }
}
