package com.example.examenandroid_sergipoza.ui.listaAsistentes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.examenandroid_sergipoza.R;

public class listaAsistentesFragment extends Fragment {

    private listaAsistentesViewModel listaAsistentesViewModel;
    private Button asistir;
    private RecyclerView rvAsistentes;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        listaAsistentesViewModel =
                ViewModelProviders.of(this).get(listaAsistentesViewModel.class);
        View root = inflater.inflate(R.layout.lista_asistentes, container, false);

        asistir = root.findViewById(R.id.asistirBtn);
        rvAsistentes = root.findViewById(R.id.listaAsistentes);

        asistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController nc =Navigation.findNavController(getActivity(),R.id.nav_host_fragment);
                nc.navigate(R.id.nav_tools);
            }
        });
        return root;
    }
}