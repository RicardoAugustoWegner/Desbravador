package br.udesc.desbravador.model_DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import br.udesc.desbravador.model.Usuario;

public class UsuarioDAO {

    private final SQLiteDatabase write;
    private final SQLiteDatabase read;


    public UsuarioDAO(Context context) {
        BancoDesbravadoresHelpers bancoDesbravadoresHelpers = new BancoDesbravadoresHelpers(context);
        this.write = bancoDesbravadoresHelpers.getWritableDatabase();
        this.read = bancoDesbravadoresHelpers.getReadableDatabase();
    }

    public void cadastrarUsuario(Usuario usuario){

        ContentValues cv = new ContentValues();
        cv.put("nome", usuario.getNome());
        cv.put("email", usuario.getEmail());
        cv.put("nome", usuario.getSenha());

        try {
            write.insert(BancoDesbravadoresHelpers.TB_USUARIO, null, cv);
            //write.close();
        } catch (Exception e) {
            Log.i("ERROR", "Erro ao cadastrar usuário" + e.getMessage());
        }

    }

}
