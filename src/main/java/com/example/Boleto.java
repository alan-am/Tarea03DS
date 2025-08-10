package com.example;

public class Boleto {
    private String numeroBoleto;
    private Asiento asiento;
    private Vuelo vuelo;
    private Usuario duenio;


    public Boleto(String numeroBoleto, Asiento asiento, Vuelo vuelo, Usuario duenio) {
        this.numeroBoleto = numeroBoleto;
        this.asiento = asiento;
        this.vuelo = vuelo;
        this.duenio = duenio;
    }

    //toString
    @Override
    public String toString() {
        return "Boleto [numeroBoleto=" + numeroBoleto + ", asiento=" + asiento + ", vuelo=" + vuelo + ", duenio="
                + duenio + "]";
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

    
}
