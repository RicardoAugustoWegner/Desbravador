package br.udesc.desbravador.model;

import java.util.List;

public class Usuario {

    private int c;
    private int id;
    private String nome;
    private String email;
    private String senha;
    private List<Curtidas> curtidas;
    private List<Estrelas> estrelas;
    private boolean logado;

    public Usuario() {
        this.id = c;
        c++;
        this.logado = true;
    }

    public void usuarioSalvar(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Curtidas> getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(List<Curtidas> curtidas) {
        this.curtidas = curtidas;
    }

    public List<Estrelas> getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(List<Estrelas> estrelas) {
        this.estrelas = estrelas;
    }

    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }
}
