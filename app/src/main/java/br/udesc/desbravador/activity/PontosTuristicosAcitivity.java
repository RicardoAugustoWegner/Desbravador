package br.udesc.desbravador.activity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.udesc.desbravador.R;
import br.udesc.desbravador.adapter.PontosListAdapter;
import br.udesc.desbravador.adapter.PontosTuristicosAdapter;
import br.udesc.desbravador.model.PontoTuristico;

public class PontosTuristicosAcitivity extends AppCompatActivity {

    //private RecyclerView recyclerView;
    private ArrayList<PontoTuristico> pontosTuristicos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pontos_turistico);
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
}




