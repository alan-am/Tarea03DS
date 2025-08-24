package com.example.Decorator;

import com.example.Builder.Reserva;

public class CoberturaExtendida {

    private Reserva servicio;
    private double precio;

    public CoberturaExtendida(Reserva servicio, double precio) {
        this.servicio = servicio;
        this.precio = precio;
    }

    public Reserva getServicio() {
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
