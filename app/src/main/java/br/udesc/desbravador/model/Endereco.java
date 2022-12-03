package br.udesc.desbravador.model;

public class Endereco {

    private int id;
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String cep;

    public Endereco(int id, String rua, int numero, String bairro, String cidade, String cep) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getCep() {
        return cep;
    }

}
