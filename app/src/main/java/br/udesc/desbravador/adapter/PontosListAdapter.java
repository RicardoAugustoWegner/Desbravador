package br.udesc.desbravador.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.udesc.desbravador.model.PontoTuristico;

public class PontosListAdapter extends BaseAdapter {

    private final List<PontoTuristico> pontosTuristicos;
    private Context context;


    public PontosListAdapter(List<PontoTuristico> pontosTuristicos, Activity act) {
        this.pontosTuristicos = pontosTuristicos;
        this.context = context;
    }

    @Override
    public int getCount() {
        return pontosTuristicos.size();
    }

    @Override
    public Object getItem(int i) {
        return pontosTuristicos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return pontosTuristicos.get(i).getIdPontoTuristico();
    }

    public List<PontoTuristico> getPontosTuristicos() {
        return pontosTuristicos;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        //View view = inflater.inflate(R.layout.adapter_aluno, parent, false);

//pegando as referências das Views 
        //TextView nome = (TextView) view.findViewById(R.id.lista_curso_personalizada_nome);
       // TextView descricao = (TextView) view.findViewById(R.id.lista_curso_personalizada_descricao);
        //ImageView imagem = (ImageView) view.findViewById(R.id.lista_curso_personalizada_imagem);

//populando as Views 
        //nome.setText(curso.getNome());
        //descricao.setText(curso.getDescricao());
       // imagem.setImageResource(R.drawable.java);

        //return view;

        return null;
    }
}
