package com.example.examenandroid_sergipoza.ui.nouEsdev;

import android.os.AsyncTask;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.examenandroid_sergipoza.Models.Esdeveniment;
import com.example.examenandroid_sergipoza.Repository.Repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class nouEsdevViewModel extends ViewModel {


    public static class anadirEsdev extends AsyncTask<Void,Void,Void>{

        private Esdeveniment es;

        public anadirEsdev(Esdeveniment es) {
            this.es = es;
        }

        private final MutableLiveData<Boolean> result = new MutableLiveData<>();

        public MutableLiveData<Boolean> getResult() {
            return result;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            Connection c = Repository.openPostgresConnection();

            if (c != null){

                String insertEsdev = "INSERT INTO eventdetail VALUES(?,?,?,?,?,?,?,?)";

                PreparedStatement insert;
                try {
                    insert = c.prepareStatement(insertEsdev);
                    insert.setString(1,es.getNombre());
                    insert.setDate(2, Date.valueOf(es.getFecha()));
                    insert.setString(3,es.getLugar());
                    insert.setString(4,es.getOrganizador());
                    insert.setString(5,es.getSala());
                    insert.setInt(6,Integer.parseInt(es.getPrecio()));
                    insert.setInt(7,Integer.parseInt(es.getAforo()));
                    insert.setString(8,es.getDescripcion());

                    insert.execute();


                } catch (SQLException e) {
                    e.printStackTrace();
                }

                try {
                    c.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            return null;
        }

    }

}