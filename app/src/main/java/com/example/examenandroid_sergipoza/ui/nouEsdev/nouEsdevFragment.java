package com.example.examenandroid_sergipoza.ui.nouEsdev;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.examenandroid_sergipoza.Models.Esdeveniment;
import com.example.examenandroid_sergipoza.R;

public class nouEsdevFragment extends Fragment {

    private nouEsdevViewModel nouEsdevViewModel;

    private Button cancelar,confirmar;
    private EditText nombre,organizador,sala,precio,aforo,descripcion,fecha,lugar;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        nouEsdevViewModel =
                ViewModelProviders.of(this).get(nouEsdevViewModel.class);
        View root = inflater.inflate(R.layout.nou_esdev, container, false);

        confirmar = root.findViewById(R.id.confirmarButton);

        nombre = root.findViewById(R.id.nombreDetailEditText);
        organizador = root.findViewById(R.id.organizadorEditText);
        sala = root.findViewById(R.id.salaEditText);
        precio = root.findViewById(R.id.precioEditText);
        aforo = root.findViewById(R.id.aforoEditText);
        descripcion = root.findViewById(R.id.descripcionEditText);
        fecha = root.findViewById(R.id.fechaDetailEditText);
        lugar = root.findViewById(R.id.lugarDetailEditText);

        confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Esdeveniment esd = new Esdeveniment(nombre.getText().toString(),
                        organizador.getText().toString(),
                        sala.getText().toString(),
                        precio.getText().toString(),
                        aforo.getText().toString(),
                        descripcion.getText().toString(),
                        fecha.getText().toString(),
                        lugar.getText().toString());

                        nouEsdevViewModel.anadirEsdev anadir = new nouEsdevViewModel.anadirEsdev(esd);

                        anadir.execute();


            }
        });

        return root;
    }
}