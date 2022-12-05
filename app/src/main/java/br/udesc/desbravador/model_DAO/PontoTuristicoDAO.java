package br.udesc.desbravador.model_DAO;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import br.udesc.desbravador.model.PontoTuristico;

public class PontoTuristicoDAO {

    private final SQLiteDatabase write;
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
            @SuppressLint("Range") String imagem_pequena = cursor.getString(cursor.getColumnIndex("imagem_pequena"));

            PontoTuristico pontoTuristico = new PontoTuristico();
            pontoTuristico.setNome(nome);
            pontoTuristico.setImagemPequena(imagem_pequena);

            pontosTuristicosList.add(pontoTuristico);

        }
        return pontosTuristicosList;
    }
}
