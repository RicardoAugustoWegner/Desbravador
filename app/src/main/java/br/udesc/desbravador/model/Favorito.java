package br.udesc.desbravador.model;

import java.util.ArrayList;
import java.util.List;

public class Favorito {

    private int idUsuario;
    private int idFavorito;

    public Favorito() {

    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdFavorito() {
        return idFavorito;
    }

    public void setIdFavorito(int idFavorito) {
        this.idFavorito = idFavorito;
    }
}
