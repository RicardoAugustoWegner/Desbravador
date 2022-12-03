package br.udesc.desbravador;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import br.udesc.desbravador.activity.PontosTuristicosAcitivity;
import br.udesc.desbravador.databinding.ActivityFragmentsBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityFragmentsBinding binding;

    private NavHostFragment navHostFragment;
    private NavController navController;

    private static final String[] LOCAIS = new String[]{
            "Cachoeira do Tatete", "Três Cachoeiras", "Cachoeira da Onça", "Cachoeira Tabarelli", "Cachoeira da Santa", "Prefeitura"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFragmentsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        iniciarNavegacao();

        AutoCompleteTextView escreverTexto = findViewById(R.id.editAutoCompletar3);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, LOCAIS);
        escreverTexto.setAdapter(adapter);
    }

    private void iniciarNavegacao(){
        navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.menu_navegacao);
        navController = navHostFragment.getNavController();
        NavigationUI.setupWithNavController(binding.bottomNavigation, navController);
    }

    public void listaLocais(View view) {
        Intent listaLocais = new Intent(br.udesc.desbravador.MainActivity.this, PontosTuristicosAcitivity.class);
        startActivity(listaLocais);
    }
}




    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);
    }

    public void fazerLogin(View view) {
        Intent login = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(login);
    }

    public void listaLocais(View view) {
        Intent listaLocais = new Intent(MainActivity.this, PontosTuristicosAcitivity.class);
        startActivity(listaLocais);
    }*/


//private static final String[] LOCAIS = new String[]{
//      "Cachoeira do Tatete", "Cachoeira da Onça", "Cachoeira Tabarelli", "Cachoeira da Santa", "Prefeitura"
//};

//AutoCompleteTextView texto = findViewById(R.id.editAutoCompletar);
//ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
//       android.R.layout.simple_list_item_1, LOCAIS);
//texto.setAdapter(adapter);