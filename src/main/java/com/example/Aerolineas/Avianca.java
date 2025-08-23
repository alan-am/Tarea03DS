package com.example.Aerolineas;

import com.example.Aerolinea;

public class Avianca implements Aerolinea{
    @Override
    public void reservarVuelo() {
        System.out.println("Vuelo reservado con Avianca");
    }

    @Override
    public void confirmarVuelo() {
        System.out.println("Vuelo confirmado con Avianca");
    }

    @Override
    public void cancelarVuelo() {
        System.out.println("Vuelo cancelado con Avianca");
    }

    @Override
    public String toString() {
        return "Avianca";
    }

}
