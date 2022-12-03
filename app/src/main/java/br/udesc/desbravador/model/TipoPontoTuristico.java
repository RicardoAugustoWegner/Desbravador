package br.udesc.desbravador.model;

public class TipoPontoTuristico {

    private int id;
    private String TipoPontoTuristico;

    public TipoPontoTuristico(int id, String tipoPontoTuristico) {
        this.id = id;
        TipoPontoTuristico = tipoPontoTuristico;
    }

    public int getId() {
        return id;
    }

    public String getTipoPontoTuristico() {
        return TipoPontoTuristico;
    }


}
