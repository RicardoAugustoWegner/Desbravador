package br.udesc.desbravador.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.udesc.desbravador.R;
import br.udesc.desbravador.model.Usuario;
import br.udesc.desbravador.repository.Banco;

public class LoginActivity extends AppCompatActivity {

    private EditText campoEmail;
    private EditText campoSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        iniciarComponentes();
        configuracaoButtonCadastrase();
    }

    public void iniciarComponentes(){

        campoEmail = findViewById(R.id.txt_email_login);
        campoSenha = findViewById(R.id.txt_senha_login);

    }

    private void configuracaoButtonCadastrase(){


        findViewById(R.id.btn_criar_conta).setOnClickListener(v ->
                startActivity(new Intent(this, CadastroActivity.class)));

        findViewById(R.id.btn_entrar_login).setOnClickListener(v ->
                finish());



        //view.findViewById(R.id.butNatureza).setOnClickListener(v ->
        //        startActivity(new Intent(this, NaturezaActivity.class)));

        //view.findViewById(R.id.btn_entrar_login).setOnClickListener(v ->
        //       startActivity(new Intent(getActivity(), PontosTuristicosAcitivity.class)));
    }

    /*public void configuraButtonLogin() {
        return null;
        /*for (Usuario usuario : Banco.getList())
        if (campoEmail.getText() =)

        if (bd.isAutenticado() == false){
            view.findViewById(R.id.btn_login).setOnClickListener(v ->
                    startActivity(new Intent(this, CadastroActivity.class)));
        } else {
            view.findViewById(R.id.btn_entrar_login).setOnClickListener(v ->
                    startActivity(new Intent(this, NaturezaActivity.class)));
        }
    }*/
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