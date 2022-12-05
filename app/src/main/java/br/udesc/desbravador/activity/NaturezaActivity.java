package br.udesc.desbravador.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import br.udesc.desbravador.R;
import br.udesc.desbravador.adapter.PontosTuristicosAdapter;
import br.udesc.desbravador.databinding.AdapterSimplePontosTuristicosBinding;
import br.udesc.desbravador.model.PontoTuristico;
import br.udesc.desbravador.model_DAO.BancoDesbravadoresHelpers;
import br.udesc.desbravador.model_DAO.PontoTuristicoDAO;

public class NaturezaActivity extends AppCompatActivity {

    List<PontoTuristico> pontoTuristicoList;
    RecyclerView recyclerView;

    BancoDesbravadoresHelpers bd;


    /*private RecyclerView recyclerView;
    private PontosTuristicosAdapter pontosTuristicosAdapter;
    private TextView tituloNatureza;

    private PontoTuristicoDAO pontoTuristicoDAO;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_natureza);

       // bd = new BancoDesbravadoresHelpers(getApplicationContext(),);

        /*carregarPontosTurisicosList();

        recyclerView.findViewById(R.id.recycleNatureza);
        pontoTuristicoDAO = new PontoTuristicoDAO(getApplicationContext());*/

    }

    /*private void carregarPontosTurisicosList(){

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        pontosTuristicosAdapter = new PontosTuristicosAdapter(pontoTuristicoDAO.getListPontoTuristicos(), this);
        recyclerView.setAdapter(pontosTuristicosAdapter);

    }*/


}