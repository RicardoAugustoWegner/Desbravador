package br.udesc.desbravador.model_DAO;

import java.util.ArrayList;
import java.util.List;

import br.udesc.desbravador.model.Usuario;

public abstract class BancoDesbravadores {

    public static List<Usuario> usuario;

    public static void inicia(){
        usuario = new ArrayList<>();

        Usuario usuario1 = new Usuario(1, "Ricardo Augusto dos Santos Wegner", "ricardoaugustowegner@gmail.com", "5555588888");
        Usuario usuario2 = new Usuario(2, "Luiz Felipe Küster", "luizkuster@gmail.com", "12345678");

        //Adiciona Elementos na lista
        usuario.add(usuario1);
        usuario.add(usuario2);
    }




}
