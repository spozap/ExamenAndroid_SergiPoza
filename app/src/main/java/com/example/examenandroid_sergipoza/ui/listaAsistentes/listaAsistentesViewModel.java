package com.example.examenandroid_sergipoza.ui.listaAsistentes;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.examenandroid_sergipoza.Models.Assistent;
import com.example.examenandroid_sergipoza.Repository.Repository;

public class listaAsistentesViewModel extends ViewModel {

    public void insertarAsistente(Assistent e){
        Repository.insertarAsistente(e);
    }
}