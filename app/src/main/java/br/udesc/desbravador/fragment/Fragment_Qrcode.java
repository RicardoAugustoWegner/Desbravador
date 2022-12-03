package br.udesc.desbravador.fragment;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import br.udesc.desbravador.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_Qrcode#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_Qrcode extends Fragment {

    public static final String EXTRA_INFO = "default";
    ImageView imvVerQrCode;
    ImageButton btnAcionarLeitorQrCode;
    private static final int Image_Capture_Code = 1;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment_Qrcode() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_Qrcode.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_Qrcode newInstance(String param1, String param2) {
        Fragment_Qrcode fragment = new Fragment_Qrcode();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }*/


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment__qrcode, container, false);
        View view = inflater.inflate(R.layout.fragment__qrcode, container, false);
        btnAcionarLeitorQrCode = (ImageButton) view.findViewById(R.id.btnAcionarLeitorQrCode);
        imvVerQrCode = (ImageView) view.findViewById(R.id.imvVerQrCode);
        btnAcionarLeitorQrCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cInt = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cInt,Image_Capture_Code);
            }
        });

        return view;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
       /* iniciarComponentes(view);
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, 0);
        }

        imvVerQrCode = (ImageView) findViewById(R.id.imvVerQrCode);
        findViewById(R.id.btnAcionarLeitorQrCode).setOnClickListener(new View.OnClickListener()){

        }*/
    }

    private void iniciarComponentes(View view){
        btnAcionarLeitorQrCode = view.findViewById(R.id.btnAcionarLeitorQrCode);
    }

    public void tirarFoto(){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 1);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == Image_Capture_Code) {
            if (resultCode == 1) {
                Bitmap bp = (Bitmap) data.getExtras().get("data");
                imvVerQrCode.setImageBitmap(bp);
            } else if (resultCode != 1) {
                Toast.makeText(getActivity(), "Cancelled", Toast.LENGTH_LONG).show();
            }
        }
    }
}