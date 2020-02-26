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
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.examenandroid_sergipoza.EsdevenimentsRV;
import com.example.examenandroid_sergipoza.Models.Esdeveniment;
import com.example.examenandroid_sergipoza.R;

import java.util.ArrayList;

public class listaEsdevFragment extends Fragment {

    private listaEsdevViewModel listaEsdevViewModel;
    private ArrayList<Esdeveniment> lista;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        listaEsdevViewModel =
                ViewModelProviders.of(this).get(listaEsdevViewModel.class);
        View root = inflater.inflate(R.layout.lista_esdev, container, false);
        RecyclerView rvEsdev = root.findViewById(R.id.esdevenimentsRV);

        rvEsdev.setLayoutManager(new LinearLayoutManager(getContext()));

        lista = new ArrayList<>();


        final EsdevenimentsRV esdevenimentsRV = new EsdevenimentsRV(lista, Navigation.findNavController(getActivity(),
                R.id.nav_host_fragment));

        listaEsdevViewModel.listarEsd listaEsd = new listaEsdevViewModel.listarEsd();

        listaEsd.execute();

        listaEsd.getResult().observe(getViewLifecycleOwner(), new Observer<ArrayList<Esdeveniment>>() {
            @Override
            public void onChanged(ArrayList<Esdeveniment> esdeveniments) {
                lista = esdeveniments;
                esdevenimentsRV.setListaEsdev(lista);
                esdevenimentsRV.notifyDataSetChanged();
            }
        });

        rvEsdev.setAdapter(esdevenimentsRV);

        return root;
    }
}