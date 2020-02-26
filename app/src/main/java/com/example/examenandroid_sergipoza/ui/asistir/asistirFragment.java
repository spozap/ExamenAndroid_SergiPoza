package com.example.examenandroid_sergipoza.ui.asistir;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.examenandroid_sergipoza.Models.Assistent;
import com.example.examenandroid_sergipoza.R;

public class asistirFragment extends Fragment {

    private asistirViewModel asistirViewModel;
    private EditText nombre,apellido,email,telefono,edad;
    private Button confirmar;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        asistirViewModel =
                ViewModelProviders.of(this).get(asistirViewModel.class);
        View root = inflater.inflate(R.layout.asistir, container, false);

        nombre = root.findViewById(R.id.nomAssistentEditText);
        apellido = root.findViewById(R.id.cognomAssistentEditText);
        email = root.findViewById(R.id.emailAssistentEditText);
        telefono = root.findViewById(R.id.telefonAssistentEditText);
        edad = root.findViewById(R.id.edatAssistentEditText);
        confirmar = root.findViewById(R.id.button2);

        confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Assistent as = new Assistent();
                as.setNombre(nombre.getText().toString());
                as.setCognom(apellido.getText().toString());
                as.setEmail(email.getText().toString());
                as.setTelefon(telefono.getText().toString());
                as.setEdad(Integer.parseInt(edad.getText().toString()));

                asistirViewModel.insertarAsistente(as);
            }
        });

        return root;
    }
}