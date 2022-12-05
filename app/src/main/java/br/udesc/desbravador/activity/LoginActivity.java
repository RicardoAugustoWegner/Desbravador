package br.udesc.desbravador.activity;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.udesc.desbravador.MainActivity;
import br.udesc.desbravador.R;
import br.udesc.desbravador.model.Usuario;
import br.udesc.desbravador.model_DAO.UsuarioDAO;

public class LoginActivity extends AppCompatActivity {

    private EditText campoEmail;
    private EditText campoSenha;
    private Button login;

    private static Usuario usuarioLogado;
    private static Boolean logado = false;
    UsuarioDAO usuarioDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        iniciarComponentes();
        //usuarioLogado();
    }

    public void iniciarComponentes(){

        campoEmail = findViewById(R.id.txtsenhalogina);
        campoSenha = findViewById(R.id.txtemaillogina);
        login = findViewById(R.id.btn_entrar_login);

    }

    /*public void usuarioLogado(){
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (Usuario u : usuarioDAO.UsuarioLogando()) {
                    if (u.getEmail().equals(campoEmail) && u.getSenha().equals(campoSenha)) {
                        usuarioLogado = u;
                        logado = true;
                        Toast.makeText(getApplicationContext(), "Login com Sucesso", Toast.LENGTH_LONG).show();
                        Intent mainActivity = new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(mainActivity);

                    } else {
                        Toast.makeText(getApplicationContext(), "Senha ou e-mail incorreto", Toast.LENGTH_LONG).show();
                    }
                }
            }
        }
    }*/
}