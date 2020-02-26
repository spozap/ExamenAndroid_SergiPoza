package com.example.examenandroid_sergipoza.ui.detallEsdev;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.examenandroid_sergipoza.Models.Esdeveniment;
import com.example.examenandroid_sergipoza.R;

public class detallEsdevFragment extends Fragment {

    private detallEsdevViewModel detallEsdevViewModel;

    private TextView nombre,organizador,sala,precio,aforo,descripcion,fecha,lugar;
    private ImageButton mensajes,asistentes,edit;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        detallEsdevViewModel =
                ViewModelProviders.of(this).get(detallEsdevViewModel.class);
        View root = inflater.inflate(R.layout.detall_esdev, container, false);

        Esdeveniment e = (Esdeveniment) getArguments().getSerializable("Esd");

        mensajes = root.findViewById(R.id.mensajesImageButton);
        asistentes = root.findViewById(R.id.asistentesImageButton);
        edit = root.findViewById(R.id.editImageButton);

        asistentes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController nc = Navigation.findNavController(getActivity(),R.id.nav_host_fragment);
                nc.navigate(R.id.nav_gallery);
            }
        });

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController nc = Navigation.findNavController(getActivity(),R.id.nav_host_fragment);
                nc.navigate(R.id.nav_edit_esd);
            }
        });


        return root;
    }
}