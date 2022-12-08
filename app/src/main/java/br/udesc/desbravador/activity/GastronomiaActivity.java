package br.udesc.desbravador.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import br.udesc.desbravador.R;
import br.udesc.desbravador.adapter.PontosTuristicosAdapter;
import br.udesc.desbravador.model.PontoTuristico;
import br.udesc.desbravador.model_DAO.PontoTuristicoDAO;

public class GastronomiaActivity extends AppCompatActivity implements PontosTuristicosAdapter.OnClickListener {

    private RecyclerView recyclerView;
    private PontosTuristicosAdapter adapter;
    PontoTuristicoDAO pontoTuristicoDAO = new PontoTuristicoDAO();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gastronomia);
        carregarPontosTurisicosList();
        iniciaComponents();
    }

    private void carregarPontosTurisicosList(){
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        adapter = new PontosTuristicosAdapter(pontoTuristicoDAO.selectTipo(3), this);
        recyclerView.setAdapter(adapter);
    }

    private void iniciaComponents(){
        recyclerView = findViewById(R.id.recycleNatureza);
    }


    @Override
    public void OnClick(PontoTuristico pontoTuristico) {
        Toast.makeText(this, pontoTuristico.getNome(), Toast.LENGTH_SHORT).show();

    }
}