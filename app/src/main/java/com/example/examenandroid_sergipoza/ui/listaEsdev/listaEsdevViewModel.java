package com.example.examenandroid_sergipoza.ui.listaEsdev;

import android.os.AsyncTask;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.examenandroid_sergipoza.Models.Esdeveniment;
import com.example.examenandroid_sergipoza.Repository.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class listaEsdevViewModel extends ViewModel {

    public static class listarEsd extends AsyncTask<Void,Void, ArrayList<Esdeveniment>> {

        ArrayList<Esdeveniment> listaEsdev = new ArrayList<>();

        private final MutableLiveData<ArrayList<Esdeveniment>> result = new MutableLiveData<>();

        public MutableLiveData<ArrayList<Esdeveniment>> getResult() {
            return result;
        }

        @Override
        protected ArrayList<Esdeveniment> doInBackground(Void... voids) {
            Connection c = Repository.openPostgresConnection();

            if (c != null) {
                String selectEsdev = "SELECT * FROM eventdetail";

                try {

                    PreparedStatement pst = c.prepareStatement(selectEsdev);

                    ResultSet resultado = pst.executeQuery();

                    while (resultado.next()) {
                        Esdeveniment es = new Esdeveniment();

                        es.setNombre(resultado.getString(1));
                        es.setFecha(String.valueOf(resultado.getDate(2)));
                        es.setLugar(resultado.getString(3));
                        es.setOrganizador(resultado.getString(4));
                        es.setSala(resultado.getString(5));
                        es.setPrecio(String.valueOf(resultado.getString(6)));
                        es.setSala(String.valueOf(resultado.getString(7)));
                        es.setDescripcion(resultado.getString(8));

                        listaEsdev.add(es);

                    }


                } catch (SQLException e) {
                    e.printStackTrace();
                }

                try {
                    c.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            return listaEsdev;
        }

        @Override
        protected void onPostExecute(ArrayList<Esdeveniment> esdeveniments) {
            super.onPostExecute(esdeveniments);
            result.postValue(esdeveniments);
        }
    }
}