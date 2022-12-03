package br.udesc.desbravador.model;

import java.util.ArrayList;
import java.util.List;

public class Estrelas {

    private PontoTuristico pontoTuristico;
    private int estrelas ;

    public Estrelas(PontoTuristico pontoTuristico, int estrelas) {
        this.pontoTuristico = pontoTuristico;
        this.estrelas = estrelas;
    }

    public PontoTuristico getPontoTuristico() {
        return pontoTuristico;
    }

    public int getEstrelas() {
        return estrelas;
    }

}
