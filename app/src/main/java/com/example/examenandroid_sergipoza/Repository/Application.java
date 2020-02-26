package com.example.examenandroid_sergipoza.Repository;

public class Application extends android.app.Application {


    @Override
    public void onCreate() {
        super.onCreate();
        Repository.get(this);
    }



}
