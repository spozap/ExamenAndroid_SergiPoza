package com.example.examenandroid_sergipoza.Models;

import java.io.Serializable;

public class Esdeveniment implements Serializable {

    private String nombre,organizador,sala,precio,aforo,descripcion,fecha,lugar;

    public Esdeveniment(String nombre, String organizador, String sala, String precio, String aforo, String descripcion, String fecha, String lugar) {
        this.nombre = nombre;
        this.organizador = organizador;
        this.sala = sala;
        this.precio = precio;
        this.aforo = aforo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.lugar = lugar;
    }

    public Esdeveniment() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrganizador() {
        return organizador;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getAforo() {
        return aforo;
    }

    public void setAforo(String aforo) {
        this.aforo = aforo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
