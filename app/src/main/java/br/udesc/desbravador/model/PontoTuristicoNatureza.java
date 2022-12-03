package br.udesc.desbravador.model;

import java.util.Locale;

public class PontoTuristicoNatureza extends PontoTuristico{

    private double valorEntrada;
    private String guia;

    public PontoTuristicoNatureza(int id, int idTipoPontoTuristico, String tipo, String nome, Endereco endereco, String descricao, boolean curtir, double estrelas, Locale localizacao, double valorEntrada,String guia) {
        super(id, idTipoPontoTuristico, tipo, nome, endereco, descricao, curtir, estrelas, localizacao);
        this.valorEntrada = valorEntrada;
        this.guia = guia;
    }

    public double getValorEntrada() {
        return valorEntrada;
    }

    public String getGuia() {
        return guia;
    }

}
