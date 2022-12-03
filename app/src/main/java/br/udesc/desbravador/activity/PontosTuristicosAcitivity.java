package br.udesc.desbravador.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

import br.udesc.desbravador.R;
import br.udesc.desbravador.databinding.ActivityMapsBinding;
import br.udesc.desbravador.model.PontoTuristico;

public class PontosTuristicosAcitivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;
    //private RecyclerView recyclerView;
    private ArrayList<PontoTuristico> pontosTuristicos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pontos_turistico);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map_tela_frag);
        mapFragment.getMapAsync(this);

        //MapFragment mapFragment = supportFragmentManager.findFragmnetById(R.id.map_tela_frag) as SupportMapFragment;
        //ListView listView = (ListView) findViewById(R.id.);
        /*recyclerView = findViewById(R.id.recyclePontosTuristicos);

        PontosTuristicosAdapter pontosTuristicosAdapter = new PontosTuristicosAdapter();

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(pontosTuristicosAdapter);*/

        //listView = findViewById(R.id.recyclePontosTuristicos);

        //pontosTuristicos = new ArrayList<PontoTuristico>();
        //int a = 1;
        /*for(int i=0;i<30;i++){
            PontoTuristico pnt = new PontoTuristico();
            pnt.setNome("Nome"+i);
            pnt.setIdTipoPontoTuristico(1);
            pnt.setId(i);
            pnt.setCurtir(false);
            pontosTuristicos.add(pnt);
        }
        listView.setAdapter(new PontosListAdapter(this, pontosTuristicos));*/

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }



}




