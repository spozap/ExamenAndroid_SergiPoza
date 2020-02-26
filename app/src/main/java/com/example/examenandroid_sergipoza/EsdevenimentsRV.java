package com.example.examenandroid_sergipoza;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.RecyclerView;

import com.example.examenandroid_sergipoza.Models.Esdeveniment;

import java.util.ArrayList;

public class EsdevenimentsRV extends RecyclerView.Adapter<EsdevenimentsRV.esdevenimentsViewHolder>{

    private ArrayList<Esdeveniment> listaEsdev;
    private NavController nc;

    public void setListaEsdev(ArrayList<Esdeveniment> listaEsdev) {
        this.listaEsdev = listaEsdev;
    }

    public EsdevenimentsRV(ArrayList<Esdeveniment> listaEsdev, NavController mc) {
        this.listaEsdev = listaEsdev;
        this.nc = nc;
    }

    @Override
    public esdevenimentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_row,parent,false);
        return new esdevenimentsViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull esdevenimentsViewHolder holder, int position) {
        holder.nombre.setText(listaEsdev.get(position).getNombre());
        holder.lugar.setText(listaEsdev.get(position).getLugar());
        holder.fecha.setText(listaEsdev.get(position).getFecha());
    }

    @Override
    public int getItemCount() {
        return listaEsdev.size();
    }

    public class esdevenimentsViewHolder extends RecyclerView.ViewHolder {

        TextView nombre,fecha,lugar;

        public esdevenimentsViewHolder(View itemView) {
            super(itemView);

            nombre = itemView.findViewById(R.id.nombreEvento);
            fecha = itemView.findViewById(R.id.nombreFecha);
            lugar = itemView.findViewById(R.id.nombreLugar);


        }
    }

}
