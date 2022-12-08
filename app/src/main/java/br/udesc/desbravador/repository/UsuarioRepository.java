package br.udesc.desbravador.repository;

import java.util.List;

import br.udesc.desbravador.model.Usuario;

public interface UsuarioRepository {


    public boolean insert(Usuario usuario);
    public boolean update(Usuario usuario);
    public boolean delete(Usuario usuario);
    public List<Usuario> selectAll();


}
