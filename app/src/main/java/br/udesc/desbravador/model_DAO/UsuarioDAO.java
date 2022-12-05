package br.udesc.desbravador.model_DAO;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import br.udesc.desbravador.model.PontoTuristico;
import br.udesc.desbravador.model.Usuario;

public class UsuarioDAO {

    private final SQLiteDatabase write;
    private final SQLiteDatabase read;


    public UsuarioDAO(Context context) {
        BancoDesbravadoresHelpers bancoDesbravadoresHelpers = new BancoDesbravadoresHelpers(context);
        this.write = bancoDesbravadoresHelpers.getWritableDatabase();
        this.read = bancoDesbravadoresHelpers.getReadableDatabase();
    }

    public void cadastrarUsuario(Usuario usuario) {

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

    public List<Usuario> UsuarioLogando (){

        List<Usuario> usuariosList = new ArrayList<>();

        String sql = "SELECT * FROM " + BancoDesbravadoresHelpers.TB_USUARIO +";";
        Cursor cursor = read.rawQuery(sql, null);

        while (cursor.moveToNext()){

            @SuppressLint("Range") int id = cursor.getInt(cursor.getColumnIndex("id_usuario"));
            @SuppressLint("Range") String nome = cursor.getString(cursor.getColumnIndex("nome"));
            @SuppressLint("Range") String senha = cursor.getString(cursor.getColumnIndex("senha"));
            @SuppressLint("Range") String email = cursor.getString(cursor.getColumnIndex("email"));

            Usuario usuarioLog = new Usuario();
            usuarioLog.setId(id);
            usuarioLog.setNome(senha);
            usuarioLog.setSenha(senha);
            usuarioLog.setEmail(email);

            usuariosList.add(usuarioLog);
        }
        return usuariosList;
    }

    /*public Usuario validarLogin(String login, String senha) {

        String[] selectionArgs = new String[]{login, senha};
        Cursor cursor = dao.getReadableDatabase().rawQuery("SELECT * FROM Usuarios WHERE usuario_nome=? AND usuario_senha=?", selectionArgs);
        Usuario usuarioLinha = null;
        while (cursor.moveToNext()) {
            usuarioLinha = new Usuario();
            usuarioLinha.setNome(cursor.getString(cursor.getColumnIndex("usuario_nome")));
            usuarioLinha.setSenha(cursor.getString(cursor.getColumnIndex("usuario_senha")));
        }cursor.close();
        return usuarioLinha;
    }*/

}
