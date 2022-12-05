package br.udesc.desbravador.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import br.udesc.desbravador.R;
import br.udesc.desbravador.activity.GastronomiaActivity;
import br.udesc.desbravador.activity.HoteisActivity;
import br.udesc.desbravador.activity.NaturezaActivity;
import br.udesc.desbravador.activity.ReligiosoActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_Home#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_Home extends Fragment {


    ImageButton btn_natureza;
    View view;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment_Home() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_Home.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_Home newInstance(String param1, String param2) {
        Fragment_Home fragment = new Fragment_Home();
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
        view = inflater.inflate(R.layout.fragment_home, container, false);
            configuracaoButton(view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
            configuracaoButton(view);
    }

    private void configuracaoButton(@NonNull View view) {
        view.findViewById(R.id.btnHistorias).setOnClickListener(v ->
                startActivity(new Intent(getActivity(), NaturezaActivity.class)));

        view.findViewById(R.id.butHoteis).setOnClickListener(v ->
                startActivity(new Intent(getActivity(), HoteisActivity.class)));

        view.findViewById(R.id.butGastronomia).setOnClickListener(v ->
                startActivity(new Intent(getActivity(), GastronomiaActivity.class)));

        view.findViewById(R.id.btn_natureza).setOnClickListener(v ->
                startActivity(new Intent(getActivity(), NaturezaActivity.class)));

        view.findViewById(R.id.butPracas).setOnClickListener(v ->
                startActivity(new Intent(getActivity(), NaturezaActivity.class)));

        view.findViewById(R.id.butReligioso).setOnClickListener(v ->
                startActivity(new Intent(getActivity(), ReligiosoActivity.class)));

        view.findViewById(R.id.butEsportes).setOnClickListener(v ->
                startActivity(new Intent(getActivity(), NaturezaActivity.class)));

        view.findViewById(R.id.butRural).setOnClickListener(v ->
                startActivity(new Intent(getActivity(), NaturezaActivity.class)));

        view.findViewById(R.id.butSaude).setOnClickListener(v ->
                startActivity(new Intent(getActivity(), NaturezaActivity.class)));

        view.findViewById(R.id.butMonumentos).setOnClickListener(v ->
                startActivity(new Intent(getActivity(), NaturezaActivity.class)));

        view.findViewById(R.id.butArtesanatos).setOnClickListener(v ->
                startActivity(new Intent(getActivity(), NaturezaActivity.class)));

        view.findViewById(R.id.butEventos).setOnClickListener(v ->
                startActivity(new Intent(getActivity(), NaturezaActivity.class)));
    }
}