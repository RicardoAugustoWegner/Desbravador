package br.udesc.desbravador.model_DAO;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

import br.udesc.desbravador.model.PontoTuristico;
import br.udesc.desbravador.repository.Banco;
import br.udesc.desbravador.repository.PontoTuristicoRepository;

public class PontoTuristicoDAO implements PontoTuristicoRepository {
    @Override
    public boolean insert(PontoTuristico pontoTuristico) {
        return Banco.pontoTuristico.add(pontoTuristico);
    }

    @Override
    public boolean update(PontoTuristico pontoTuristico) {
        for (int i = 0; i < Banco.pontoTuristico.size(); i++) {
            if(idSaoIguais(Banco.pontoTuristico.get(i),pontoTuristico)){
                Banco.pontoTuristico.set(i, pontoTuristico);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(PontoTuristico pontoTuristico) {
        return Banco.pontoTuristico.remove(pontoTuristico);
    }

    @Override
    public List<PontoTuristico> selectAll() {
        return Banco.pontoTuristico;
    }

    @NonNull
    public static List<PontoTuristico> selectTipo(int i) {

        List<PontoTuristico> listPontoPorTipo = new ArrayList<>();
        for (PontoTuristico c : Banco.pontoTuristico){
            if (c.getIdTipoPontoTuristico() == i){
                listPontoPorTipo.add(c);
            }
        }
        return listPontoPorTipo;
    }



    private boolean idSaoIguais(@NonNull PontoTuristico pontoTuristico, @NonNull PontoTuristico pontoAComparar) {
        return pontoTuristico.getIdPontoTuristico() ==  pontoAComparar.getIdPontoTuristico();
    }
}

    /*private final SQLiteDatabase write;
    private final SQLiteDatabase read;

    public PontoTuristicoDAO(Context context) {
        BancoDesbravadoresHelpers bancoDesbravadoresHelpers = new BancoDesbravadoresHelpers(context);
        this.write = bancoDesbravadoresHelpers.getWritableDatabase();
        this.read = bancoDesbravadoresHelpers.getReadableDatabase();
    }

    public void salvarProduto(){

    }

    public List<PontoTuristico> getListPontoTuristicos(){

        List<PontoTuristico> pontosTuristicosList = new ArrayList<>();

        String sql = "SELECT * FROM " + BancoDesbravadoresHelpers.TB_PONTO_TURISTICO + ";";
        Cursor cursor = read.rawQuery(sql, null);

        while(cursor.moveToNext()){

            @SuppressLint("Range") String nome = cursor.getString(cursor.getColumnIndex("nome"));
            @SuppressLint("Range") int imagem_pequena = Integer.parseInt(cursor.getString(cursor.getColumnIndex("imagem_pequena")));


            PontoTuristico pontoTuristico = new PontoTuristico();
            pontoTuristico.setNome(nome);
            pontoTuristico.setImagemPequena(imagem_pequena);

            pontosTuristicosList.add(pontoTuristico);

        }
        return pontosTuristicosList;
    }*/




