package br.udesc.desbravador.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import br.udesc.desbravador.R;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void abrirCadastro(View view) {

        Intent cadastro = new Intent(LoginActivity.this, CadastroActivity.class);
        startActivity(cadastro);

        //public void login (View view){
         //   TextInputEditText campo_email = findViewById(R.id.txt_email_login);
          //  String email = campo_email.getText().toString();

         //   TextInputEditText campo_senha = findViewById(R.id.txt_senha_login);
         //   String senha = campo_senha.getText().toString();
        //}
    }
}
