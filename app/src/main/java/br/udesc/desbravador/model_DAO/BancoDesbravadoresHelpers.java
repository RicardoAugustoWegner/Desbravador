package br.udesc.desbravador.model_DAO;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import br.udesc.desbravador.model.Usuario;

public  class BancoDesbravadoresHelpers extends SQLiteOpenHelper {

    private static final int DATA_VERSION = 1;
    private static final String NAME_DB = "bancodesbravadores.db";
    static final String TB_USUARIO = "tb_usuario";
    static final String TB_PONTO_TURISTICO = "tb_ponto_turistico";
    static final String TB_TIPO_TURISMO = "tb_tipo_turismo";
    static final String TB_FAVORITO = "tb_favorito";
    static final String TB_ESTRELA = "tb_estrela";

    public BancoDesbravadoresHelpers(Context context) {
        super(context, NAME_DB, null, DATA_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String sql = "CREATE TABLE IF NOT EXISTS " +  TB_USUARIO +
                " (id_usuario INTEGER PRIMARY KEY AUTOINCREMENT , " +
                "nome TEXT not null ," +
                "email TEXT UNIQUE not null , " +
                "senha TEXT not null); ";

        try{
            sqLiteDatabase.execSQL(sql);
        } catch (Exception e) {
            Log.i("ERROR", "Erro ao criar a tabela: " + e.getMessage());
        }

        String sql1 = "CREATE TABLE IF NOT EXISTS " +  TB_PONTO_TURISTICO +
                " (id_ponto_turistico INTEGER PRIMARY KEY AUTOINCREMENT , " +
                "id_tipo_turismo INTEGER not null ," +
                "nome TEXT not null , " +
                "descricao TEXT not null ," +
                "latitude FLOAT not null , " +
                "longitude FLOAT not null , " +
                "endereco String not null, " +
                "imagem_pequena TEXT not null , " +
                "imagem_grande TEXT not null , " +
                "e_util BOOLEAN not null , " +
                "e_cnpj BOOLEAN not null , " +
                "telefone STRING , " +
                "whatsapp STRING , " +
                "facebook STRING , " +
                "instagram STRING , " +
                "email STRING , " +
                "funcionamento STRING , " +
                "FOREIGN KEY(id_tipo_turismo) REFERENCES TB_TIPO_TURISMO(id_tipo_turismo)); ";

        try{
            sqLiteDatabase.execSQL(sql1);
        } catch (Exception e) {
            Log.i("ERROR", "Erro ao criar a tabela: " + e.getMessage());
        }

        String sql2 = "CREATE TABLE IF NOT EXISTS " +  TB_TIPO_TURISMO +
                " (id_tipo_turismo INTEGER PRIMARY KEY AUTOINCREMENT , " +
                "descricao TEXT not null); ";

        try{
            sqLiteDatabase.execSQL(sql2);
        } catch (Exception e) {
            Log.i("ERROR", "Erro ao criar a tabela: " + e.getMessage());
        }

        String sql3 = "CREATE TABLE IF NOT EXISTS " +  TB_FAVORITO +
                "(id_usuario INTEGER PRIMARY KEY not null , " +
                "id_ponto_turistico INTEGER PRIMARY KEY not null , " +
                "FOREIGN KEY(id_usuario) REFERENCES TB_USUARIO(id_usuario) , " +
                "FOREIGN KEY(id_ponto_turistico) REFERENCES TB_TIPO_TURISMO(id_ponto_turistico));";

        try{
            sqLiteDatabase.execSQL(sql3);
        } catch (Exception e) {
            Log.i("ERROR", "Erro ao criar a tabela: " + e.getMessage());
        }

        String sql4 = "CREATE TABLE IF NOT EXISTS " +  TB_ESTRELA +
                "(id_usuario INTEGER PRIMARY KEY not null, " +
                "id_ponto_turistico INTEGER PRIMARY KEY not null , " +
                "estralas INTERGER not null , " +
                "FOREIGN KEY(id_usuario) REFERENCES TB_USUARIO(id_usuario) , " +
                "FOREIGN KEY(id_ponto_turistico) REFERENCES TB_TIPO_TURISMO(id_ponto_turistico)); ";
        try{
            sqLiteDatabase.execSQL(sql4);
        } catch (Exception e) {
            Log.i("ERROR", "Erro ao criar a tabela: " + e.getMessage());
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String query = "DROP TABLE IF EXISTS "+TB_USUARIO;
        db.execSQL(query);
        this.onCreate(db);
    }
}
