package br.udesc.desbravador.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import br.udesc.desbravador.R;
import br.udesc.desbravador.model.Usuario;

public class CadastroActivity extends AppCompatActivity {

    private EditText campoNome, campoEmail, campoConfirmeEmail, campoSenha, campoConfirmeSenha;
    private Button btnConfirmarCadastro;
    private Usuario usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        iniciarComponentes();
    }

    public void iniciarComponentes(){
        campoNome = findViewById(R.id.txtNomeCadastro);
        campoEmail = findViewById(R.id.txtEmailCadastro);
        campoConfirmeEmail = findViewById(R.id.txtConfirmeEmailCadastro);
        campoSenha = findViewById(R.id.txtSenhaCadastro);
        campoSenha = findViewById(R.id.txtConfirmeSenhaCadastro);
    }

    @SuppressLint({"ResourceAsColor", "SetTextI18n"})
    public void abrirToast(View view){

        TextView textView = new TextView(getApplicationContext());
        textView.setBackgroundResource(R.drawable.botao_borda_verde_radius);
        textView.setTextSize(15);
        textView.setTextColor(R.color.cor_text_verde_escuro);
        textView.setText("Cadastrado com Sucesso!");

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(textView);
        toast.show();
    }
}
