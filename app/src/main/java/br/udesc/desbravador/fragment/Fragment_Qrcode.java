package br.udesc.desbravador.fragment;

import static android.app.Activity.RESULT_CANCELED;
import static android.app.Activity.RESULT_OK;
import static android.content.Context.CAMERA_SERVICE;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.mlkit.vision.codescanner.GmsBarcodeScanner;
import com.google.mlkit.vision.codescanner.GmsBarcodeScanning;

import br.udesc.desbravador.R;
import br.udesc.desbravador.activity.CadastroActivity;
import br.udesc.desbravador.activity.HistoriaActivity;
import br.udesc.desbravador.activity.NaturezaActivity;
import br.udesc.desbravador.activity.PontosTuristicosAcitivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_Qrcode#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_Qrcode extends Fragment {

    ImageButton btnAcionarLeitorQrCode;
    ImageView imvVerQrCode;

    private final static int selecao_camera = 1;


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

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment__qrcode, container, false);

            configuracaoButton(v);

        if(ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.CAMERA},0);
        }

        configuracaoButton(v);
        return v;


    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }


    private void configuracaoButton(@NonNull View view){
        imvVerQrCode = (ImageView) view.findViewById(R.id.imageView);
        view.findViewById(R.id.btnAcionarLeitorQrCode).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                //Intent intent1 = new Intent(MediaStore.EXTRA_SHOW_ACTION_ICONS);
                startActivityForResult(intent, 1);
                //startActivityForResult(intent1, 1);

            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == getActivity().RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap image = (Bitmap) extras.get("data");
            imvVerQrCode.setImageBitmap(image);

        }
        super.onActivityResult(requestCode,resultCode, data);

    }
}