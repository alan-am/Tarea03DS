package com.example;

public class CoberturaExtendida implements Servicio {

    private Servicio servicio;
    private double precio;

    public CoberturaExtendida(Servicio servicio, double precio) {
        this.servicio = servicio;
        this.precio = precio;
    }

    public Servicio getServicio() {
        return servicio;
    }   
    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "CoberturaExtendida{" +
                "servicio=" + servicio +
                ", precio=" + precio +
                '}';
    }
    
}
