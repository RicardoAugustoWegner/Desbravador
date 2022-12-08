package br.udesc.desbravador.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import br.udesc.desbravador.R;
import br.udesc.desbravador.activity.CadastroActivity;
import br.udesc.desbravador.activity.LogadoActivity;
import br.udesc.desbravador.activity.LoginActivity;
import br.udesc.desbravador.activity.PontosTuristicosAcitivity;
import br.udesc.desbravador.databinding.ActivityMainBinding;
import br.udesc.desbravador.repository.Banco;

    public class MainActivity extends AppCompatActivity {

        private ActivityMainBinding binding;

        private NavHostFragment navHostFragment;
        private NavController navController;

        private static final String[] LOCAIS = new String[]{
                "Cachoeira do Tatete", "Três Cachoeiras", "Cachoeira da Onça", "Cachoeira Tabarelli", "Cachoeira da Santa", "Prefeitura"
        };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            binding = ActivityMainBinding.inflate(getLayoutInflater());
            setContentView(binding.getRoot());
            iniciarNavegacao();
            Banco.isAutenticado();
            Banco.getUsuarioAutenticado();
            Banco.inicia();

            configuracaoButton(binding.getRoot());

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

        /*public void listaLocais(View view) {
            Intent listaLocais = new Intent(br.udesc.desbravador.MainActivity.this, PontosTuristicosAcitivity.class);
            startActivity(listaLocais);
        }*/

        private void configuracaoButton(View view){

            if (Banco.isAutenticado() == false){
                view.findViewById(R.id.btn_login).setOnClickListener(v ->
                        startActivity(new Intent(this, LoginActivity.class)));
            } else {
                view.findViewById(R.id.btn_login).setOnClickListener(v ->
                        startActivity(new Intent(this, LogadoActivity.class)));
            }
            //view.findViewById(R.id.butNatureza).setOnClickListener(v ->
            //       startActivity(new Intent(this, NaturezaActivity.class)));

            //view.findViewById(R.id.btn_entrar_login).setOnClickListener(v ->
            //       startActivity(new Intent(getActivity(), PontosTuristicosAcitivity.class)));
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

    /*private ActivityFragmentsBinding binding;

    private NavHostFragment navHostFragment;
    private NavController navController;

    ImageView imageViewFoto;

    Banco bd = new Banco();


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
        findViewById(R.id.btn_login).setOnClickListener(new View.OnClickListener() {
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

        /*if (bd.isAutenticado() == false){
            view.findViewById(R.id.btn_login).setOnClickListener(v ->
                    startActivity(new Intent(this, LoginActivity.class)));
        } else {
            view.findViewById(R.id.btn_login).setOnClickListener(v ->
                    startActivity(new Intent(this, LogadoActivity.class)));
        }*/


        /*if (bd.isAutenticado() == false){
            view.findViewById(R.id.btn_login).setOnClickListener(v ->
                    startActivity(new Intent(this, CadastroActivity.class)));
        } else {
            view.findViewById(R.id.btn_entrar_login).setOnClickListener(v ->
                    startActivity(new Intent(this, NaturezaActivity.class)));
        }*/

        //view.findViewById(R.id.butNatureza).setOnClickListener(v ->
        //        startActivity(new Intent(this, NaturezaActivity.class)));

        //view.findViewById(R.id.btn_entrar_login).setOnClickListener(v ->
        //       startActivity(new Intent(getActivity(), PontosTuristicosAcitivity.class)));



