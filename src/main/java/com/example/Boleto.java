package com.example;

public class Boleto {
    private String numeroBoleto;
    private Asiento asiento;
    private Vuelo vuelo;
    private Usuario duenio;
    private double precio;


    public Boleto(String numeroBoleto, Asiento asiento, Vuelo vuelo, Usuario duenio, double precio) {
        this.numeroBoleto = numeroBoleto;
        this.asiento = asiento;
        this.vuelo = vuelo;
        this.duenio = duenio;
        this.precio = precio;
    }

    //toString
    @Override
    public String toString() {
        return "Boleto [numeroBoleto=" + numeroBoleto + ", asiento=" + asiento + ", vuelo=" + vuelo + ", duenio=" + duenio + ", precio=" + precio + "]";
    }

    //getter and setters
    public String getNumeroBoleto() {
        return numeroBoleto;
    }
    public void setNumeroBoleto(String numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
    }
    public Asiento getAsiento() {
        return asiento;
    }
    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }
    public Vuelo getVuelo() {
        return vuelo;
    }
    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
    public Usuario getDuenio() {
        return duenio;
    }
    public void setDuenio(Usuario duenio) {
        this.duenio = duenio;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }    
}
