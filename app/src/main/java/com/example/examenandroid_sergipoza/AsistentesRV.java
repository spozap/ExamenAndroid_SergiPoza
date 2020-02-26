package com.example.examenandroid_sergipoza;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.examenandroid_sergipoza.Models.Assistent;

import java.util.List;

public class AsistentesRV extends RecyclerView.Adapter<AsistentesRV.AssistentesViewHolder>{

    private List<Assistent> lista;

    public AsistentesRV(List<Assistent> lista) {
        this.lista = lista;
    }

    @Override
    public AssistentesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.asistent_row,parent,false);
        return new AssistentesViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AssistentesViewHolder holder, int position) {
        holder.nombre.setText(lista.get(position).getNombre());
        holder.email.setText(lista.get(position).getEmail());
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class AssistentesViewHolder extends RecyclerView.ViewHolder{

        private TextView nombre,email;

        public AssistentesViewHolder(@NonNull View itemView) {
            super(itemView);

            nombre = itemView.findViewById(R.id.nombreAsistente);
            email = itemView.findViewById(R.id.correoAsistente);

        }
    }
}
