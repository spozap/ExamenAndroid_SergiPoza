package com.example.examenandroid_sergipoza.Models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Assistent  {

    public Assistent() {
    }

    @PrimaryKey(autoGenerate = true)
    private int asistentId;

    private String evento;

    private String nombre;

    private String cognom;

    private String email;

    private String telefon;

    private int edad;

    public int getAsistentId() {
        return asistentId;
    }

    public void setAsistentId(int asistentId) {
        this.asistentId = asistentId;
    }

    @NonNull
    public String getEvento() {
        return evento;
    }

    public void setEvento(@NonNull String evento) {
        this.evento = evento;
    }

    @NonNull
    public String getNombre() {
        return nombre;
    }

    public void setNombre(@NonNull String nombre) {
        this.nombre = nombre;
    }

    @NonNull
    public String getCognom() {
        return cognom;
    }

    public void setCognom(@NonNull String cognom) {
        this.cognom = cognom;
    }

    @NonNull
    public String getEmail() {
        return email;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }

    @NonNull
    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(@NonNull String telefon) {
        this.telefon = telefon;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
