package br.udesc.desbravador.repository;

import java.util.List;
import br.udesc.desbravador.model.PontoTuristico;

public interface PontoTuristicoRepository {

    public boolean insert(PontoTuristico pontoTuristico);
    public boolean update(PontoTuristico pontoTuristico);
    public boolean delete(PontoTuristico pontoTuristico);
    public List<PontoTuristico> selectAll();


}
