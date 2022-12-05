package br.udesc.desbravador.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import br.udesc.desbravador.databinding.ActivityFragmentsBinding;
import br.udesc.desbravador.R;
import br.udesc.desbravador.databinding.ActivityFragmentsBinding;
import br.udesc.desbravador.databinding.ActivityMainBinding;
import br.udesc.desbravador.model_DAO.BancoDesbravadoresHelpers;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Fragments extends AppCompatActivity {

    private ActivityFragmentsBinding binding;

    private NavHostFragment navHostFragment;
    private NavController navController;

    ImageView imageViewFoto;


    BancoDesbravadoresHelpers bancoDesbravadoresHelpers;
    SQLiteDatabase sqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFragmentsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        iniciarNavegacao();
        configuracaoButton(binding.getRoot());

        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA},0);
        }

        imageViewFoto = findViewById(R.id.imageView);
        findViewById(R.id.btn_q).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 1);
            }
        });

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap image = (Bitmap) extras.get("data");
            imageViewFoto.setImageBitmap(image);
        }

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

    private void configuracaoButton(View view){
        view.findViewById(R.id.btn_criar_conta).setOnClickListener(v ->
                startActivity(new Intent(this, CadastroActivity.class)));


        //view.findViewById(R.id.butNatureza).setOnClickListener(v ->
        //        startActivity(new Intent(this, NaturezaActivity.class)));

        //view.findViewById(R.id.btn_entrar_login).setOnClickListener(v ->
        //       startActivity(new Intent(getActivity(), PontosTuristicosAcitivity.class)));
    }

}