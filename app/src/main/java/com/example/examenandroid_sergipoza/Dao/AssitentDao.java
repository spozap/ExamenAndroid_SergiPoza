package com.example.examenandroid_sergipoza.Dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.examenandroid_sergipoza.Models.Assistent;

import java.util.List;

@Dao
public interface AssitentDao {

    @Insert
    void insertAssistent(Assistent e);

    @Query("SELECT * FROM Assistent")
    List<Assistent> getAssistents();

}
