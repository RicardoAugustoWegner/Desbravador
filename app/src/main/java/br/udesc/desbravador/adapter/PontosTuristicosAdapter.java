package br.udesc.desbravador.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.udesc.desbravador.R;
import br.udesc.desbravador.activity.NaturezaActivity;
import br.udesc.desbravador.model.PontoTuristico;
import br.udesc.desbravador.model_DAO.PontoTuristicoDAO;

public class PontosTuristicosAdapter extends RecyclerView.Adapter<PontosTuristicosAdapter.MyViewHolder> {

    private List<PontoTuristico> pontoTuristicosList;

    public PontosTuristicosAdapter(List<PontoTuristico> pontoTuristicosList, NaturezaActivity naturezaActivity) {
        this.pontoTuristicosList = pontoTuristicosList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_simple_pontos_turisticos, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        PontoTuristico pontoTuristico = pontoTuristicosList.get(position);

        holder.txtNomeLocal.setText(pontoTuristico.getNome());

    }

    @Override
    public int getItemCount() {
        return pontoTuristicosList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imgRecyclePontoTurstico;
        TextView txtNomeLocal;
        CheckBox cboxUmaEstrela;
        CheckBox cboxDuasEstrela;
        CheckBox cboxTresEstrela;
        CheckBox cboxQuatroEstrela;
        CheckBox cboxCincoEstrela;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgRecyclePontoTurstico = (ImageView) itemView.findViewById(R.id.imgRecyclePontoTurstico);
            txtNomeLocal = (TextView) itemView.findViewById(R.id.txtNomeLocal);
            cboxUmaEstrela = (CheckBox) itemView.findViewById(R.id.cboxUmaEstrela);
            cboxDuasEstrela = (CheckBox) itemView.findViewById(R.id.cboxDuasEstrela);
            cboxTresEstrela = (CheckBox) itemView.findViewById(R.id.cboxTresEstrela);
            cboxQuatroEstrela = (CheckBox) itemView.findViewById(R.id.cboxQuatroEstrela);
            cboxCincoEstrela = (CheckBox) itemView.findViewById(R.id.cboxCincoEstrela);

        }
    }

}

