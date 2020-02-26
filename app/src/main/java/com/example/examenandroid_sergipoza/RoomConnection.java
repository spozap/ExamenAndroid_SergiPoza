package com.example.examenandroid_sergipoza;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.examenandroid_sergipoza.Dao.AssitentDao;
import com.example.examenandroid_sergipoza.Models.Assistent;

@Database(entities = {Assistent.class}, version = 2)
public abstract class RoomConnection extends RoomDatabase {

    private static RoomConnection INSTANCE;

    public abstract AssitentDao assitentDao();

    public static RoomConnection getRoomConnection(Context c){
        if (INSTANCE == null){
            INSTANCE = Room.databaseBuilder(c,RoomConnection.class,"timeapp.db").allowMainThreadQueries().build();
        }
        return INSTANCE;
    }

    public static void destroyRoomConnection() {
        INSTANCE = null;
    }




}
