package com.example;

public class SeguroViaje implements Servicio {
    private Servicio servicio;
    private double precio;

    public SeguroViaje(Servicio servicio, double precio) {
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
        return "SeguroViaje{" +
                "servicio=" + servicio +
                ", precio=" + precio +
                '}';
    }
     
}
