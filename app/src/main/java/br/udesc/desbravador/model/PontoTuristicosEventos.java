package br.udesc.desbravador.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class PontoTuristicosEventos extends PontoTuristico {

    private String data;
    private String hora;
    private List<String> pontoDeVendas = new ArrayList<String>();

    public PontoTuristicosEventos(int id, int idTipoPontoTuristico, String tipo, String nome, Endereco endereco, String descricao, boolean curtir, double estrelas, Locale localizacao, String data, String hora, List<String> pontoDeVendas) {
        super(id, idTipoPontoTuristico, tipo, nome, endereco, descricao, curtir, estrelas, localizacao);
        this.data = data;
        this.hora = hora;
        this.pontoDeVendas = pontoDeVendas;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public List<String> getPontoDeVendas() {
        return pontoDeVendas;
    }

}
