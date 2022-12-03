package br.udesc.desbravador.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import br.udesc.desbravador.databinding.ActivityFragmentsBinding;
import br.udesc.desbravador.R;
import br.udesc.desbravador.databinding.ActivityFragmentsBinding;
import br.udesc.desbravador.databinding.ActivityMainBinding;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class Fragments extends AppCompatActivity {

    private ActivityFragmentsBinding binding;

    private NavHostFragment navHostFragment;
    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFragmentsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        iniciarNavegacao();
    }

    private void iniciarNavegacao(){
        navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.menu_navegacao);
        navController = navHostFragment.getNavController();
        NavigationUI.setupWithNavController(binding.bottomNavigation, navController);
    }

    private static final String[] LOCAIS = new String[]{
            "Cachoeira do Tatete", "Cachoeira da Onça", "Cachoeira Tabarelli", "Cachoeira da Santa", "Prefeitura"
    };

    //AutoCompleteTextView texto = findViewById(R.id.editAutoCompletar);
   // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
    //        android.R.layout.simple_list_item_1, LOCAIS);
    //texto.set;

}