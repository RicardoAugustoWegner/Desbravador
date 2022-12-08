package br.udesc.desbravador.adapter;

import android.annotation.SuppressLint;
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
import br.udesc.desbravador.model_DAO.BancoDesbravadoresHelpers;
import br.udesc.desbravador.model_DAO.PontoTuristicoDAO;

public class PontosTuristicosAdapter extends RecyclerView.Adapter<PontosTuristicosAdapter.MyViewHolder> {

    private List<PontoTuristico> pontoTuristicosList;
    private OnClickListener onClickListener;

    public PontosTuristicosAdapter(List<PontoTuristico> pontoTuristicosList, OnClickListener onClickListener) {
        this.pontoTuristicosList = pontoTuristicosList;
        this.onClickListener = onClickListener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_simple_pontos_turisticos, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        PontoTuristico pontoTuristico = pontoTuristicosList.get(position);

        holder.imgRecyclePontoTurstico.setImageResource(pontoTuristico.getImagemPequena());
        holder.txtNomeLocal.setText(pontoTuristico.getNome());

        holder.itemView.setOnClickListener(v -> onClickListener.OnClick(pontoTuristico));
    }

    @Override
    public int getItemCount() {
        return pontoTuristicosList.size();
    }


    public interface OnClickListener  {
        void OnClick(PontoTuristico pontoTuristico);
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
            imgRecyclePontoTurstico = itemView.findViewById(R.id.imgRecyclePontoTurstico);
            txtNomeLocal = itemView.findViewById(R.id.txtNomeLocal);
            cboxUmaEstrela = itemView.findViewById(R.id.cboxUmaEstrela);
            cboxDuasEstrela =  itemView.findViewById(R.id.cboxDuasEstrela);
            cboxTresEstrela = itemView.findViewById(R.id.cboxTresEstrela);
            cboxQuatroEstrela = itemView.findViewById(R.id.cboxQuatroEstrela);
            cboxCincoEstrela = itemView.findViewById(R.id.cboxCincoEstrela);

        }
    }

}

