package com.example.examenandroid_sergipoza.ui.listaAsistentes;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.examenandroid_sergipoza.Models.Assistent;
import com.example.examenandroid_sergipoza.Repository.Repository;

import java.util.List;

public class listaAsistentesViewModel extends ViewModel {

    public List<Assistent> getAsistentes(){
        return Repository.getAsistentes();
    }
}