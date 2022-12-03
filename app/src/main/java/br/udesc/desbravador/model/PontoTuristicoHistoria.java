package br.udesc.desbravador.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class PontoTuristicoHistoria extends PontoTuristico{

    private List<String> paragrafos = new ArrayList<String>();

    public PontoTuristicoHistoria(int id, int idTipoPontoTuristico, String tipo, String nome, Endereco endereco, String descricao, boolean curtir, double estrelas, Locale localizacao, List<String> paragrafos) {
        super(id, idTipoPontoTuristico, tipo, nome, endereco, descricao, curtir, estrelas, localizacao);
        this.paragrafos = paragrafos;
    }

    public List<String> getParagrafos() {
        return paragrafos;
    }

}
