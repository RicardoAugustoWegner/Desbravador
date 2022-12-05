package br.udesc.desbravador.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import br.udesc.desbravador.R;
import br.udesc.desbravador.model.Usuario;
import br.udesc.desbravador.model_DAO.UsuarioDAO;

public class CadastroActivity extends AppCompatActivity {

    private EditText campoNome, campoEmail, campoConfirmeEmail, campoSenha, campoConfirmeSenha;
    private Button btnConfirmarCadastro;
    private Usuario usuario;
    private ProgressBar progressBar;

    private UsuarioDAO usuarioDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        usuarioDAO = new UsuarioDAO(this);

        iniciarComponentes();
        //configuracaoButton();
        validadaDados();
    }

    public void iniciarComponentes(){
        campoNome = findViewById(R.id.txtNomeCadastro);
        campoEmail = findViewById(R.id.txtEmailCadastro);
        campoConfirmeEmail = findViewById(R.id.txtConfirmeEmailCadastro);
        campoSenha = findViewById(R.id.txtSenhaCadastro);
        campoConfirmeSenha = findViewById(R.id.txtConfirmeSenhaCadastro);
        progressBar = findViewById(R.id.pbCadastro);
    }

    /*private void configuracaoButton(){
        btnConfirmarCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
    }*/

    private void validadaDados(){

        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();
        String emailConfirmar = campoConfirmeEmail.getText().toString();
        String senha = campoSenha.getText().toString();
        String senhaConfirmar = campoConfirmeSenha.getText().toString();

        if(!nome.isEmpty()) {
            if(!email.isEmpty()) {
                if(emailConfirmar.equals(email)) {
                    if(!senha.isEmpty()) {
                        if(senhaConfirmar.equals(senha)) {

                            progressBar.setVisibility(View.VISIBLE);

                            Usuario usuario = new Usuario();
                            usuario.setNome(nome);
                            usuario.setEmail(email);
                            usuario.setSenha(senha);
                            usuarioDAO.cadastrarUsuario(usuario);

                            Toast.makeText(getApplicationContext(), "Cadastrado com Sucesso", Toast.LENGTH_LONG).show();
                            finish();

                        } else {

                            Toast.makeText(getApplicationContext(), "Senhas informadas são diferentes", Toast.LENGTH_LONG).show();
                            campoConfirmeSenha.requestFocus();
                        }
                    } else {
                        campoSenha.requestFocus();
                        campoSenha.setError("Informe sua senha");
                    }
                } else {
                    campoConfirmeEmail.requestFocus();
                    campoConfirmeEmail.setError("E-mail informados são diferentes");
                }
            } else {
                campoEmail.requestFocus();
                campoEmail.setError("Informe seu e-mail");
            }
        } else {
            campoNome.requestFocus();
            campoNome.setError("Informe seu nome");
        }
    }

    @SuppressLint({"ResourceAsColor", "SetTextI18n"})
    public void abrirToast(View view){

        TextView textView = new TextView(getApplicationContext());
        textView.setBackgroundResource(R.drawable.botao_borda_verde_radius);
        textView.setTextSize(15);
        textView.setTextColor(R.color.cor_text_verde_escuro);
        ;

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(textView);
        toast.show();
    }



}
