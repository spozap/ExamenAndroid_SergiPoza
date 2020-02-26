package com.example.examenandroid_sergipoza.Dao;

import androidx.room.Dao;
import androidx.room.Insert;

import com.example.examenandroid_sergipoza.Models.Assistent;

@Dao
public interface AssitentDao {

    @Insert
    void insertAssistent(Assistent e);

}
