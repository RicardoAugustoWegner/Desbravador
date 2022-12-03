package br.udesc.desbravador.adapter;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import br.udesc.desbravador.R;

public class PontosTuristicosAdapter extends RecyclerView.Adapter<PontosTuristicosAdapter.MyViewHolder> {

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLocal = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista_ponto_turistico, parent, false);
        return new MyViewHolder(itemLocal);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.nome.setText("Cachoeiras");
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imagemLocal;
        TextView nome;
        CheckBox estrela1;
        CheckBox estrela2;
        CheckBox estrela3;
        CheckBox estrela4;
        CheckBox estrela5;
        CheckBox curtida;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            //imagemLocal = (ImageView) itemView.findViewById(R.id.);
            nome = (TextView) itemView.findViewById(R.id.txtNomeLocal);
            estrela1 = (CheckBox) itemView.findViewById(R.id.cboxUmaEstrela);
            estrela2 = (CheckBox) itemView.findViewById(R.id.cboxDuasEstrela);
            estrela3 = (CheckBox) itemView.findViewById(R.id.cboxTrêsEstrela);
            estrela4 = (CheckBox) itemView.findViewById(R.id.cboxQuatroEstrela);
            estrela5 = (CheckBox) itemView.findViewById(R.id.cboxCincoEstrela);
            curtida = (CheckBox) itemView.findViewById(R.id.btnCurtirLocal);
        }
    }

}

