package com.example.examenandroid_sergipoza.ui.listaEsdev;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.examenandroid_sergipoza.R;

public class listaEsdevFragment extends Fragment {

    private listaEsdevViewModel listaEsdevViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        listaEsdevViewModel =
                ViewModelProviders.of(this).get(listaEsdevViewModel.class);
        View root = inflater.inflate(R.layout.lista_esdev, container, false);

        return root;
    }
}