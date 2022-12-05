package br.udesc.desbravador.model;

import java.util.ArrayList;
import java.util.List;

public class Estrelas {

    private int idUsuario;
    private int idLocal;
    private int estrela;

    public Estrelas() {

    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(int idLocal) {
        this.idLocal = idLocal;
    }

    public int getEstrela() {
        return estrela;
    }

    public void setEstrela(int estrela) {
        this.estrela = estrela;
    }
}
