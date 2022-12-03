package br.udesc.desbravador.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import br.udesc.desbravador.R;
import br.udesc.desbravador.adapter.PontosListAdapter;
import br.udesc.desbravador.model.PontoTuristico;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_Curtidas#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_Curtidas extends Fragment {


    private RecyclerView list_curtidas;
    private PontosListAdapter pontosListAdapter;

    private List<PontoTuristico> pontosTuristicosList = new ArrayList<>();


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment_Curtidas() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_Curtidas.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_Curtidas newInstance(String param1, String param2) {
        Fragment_Curtidas fragment = new Fragment_Curtidas();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__curtidas, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        iniciarComponentes(view);
        configuracaoRecycleView();
    }

    private void iniciarComponentes(View view){
        list_curtidas = view.findViewById(R.id.list_curtidas);
    }

    private void configuracaoRecycleView(){
        list_curtidas.setLayoutManager(new LinearLayoutManager(getContext()));
        list_curtidas.setHasFixedSize(true);
        //pontosListAdapter = new PontosListAdapter(pontosTuristicosList, getContext());
        //list_curtidas.setAdapter(pontosListAdapter);

    }


}