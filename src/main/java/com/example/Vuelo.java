package com.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.example.Enums.EstadoAsiento;
import com.example.Enums.TipoAsiento;

public class Vuelo {
    private String numero;
    private String origen;
    private String destino;
    private Aerolinea aerolinea;
    private List<Asiento> asientos;
    private LocalDateTime horarioSalida;

    public Vuelo(String numero, String origen, String destino, Aerolinea aerolinea,
            LocalDateTime horarioSalida) {
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.aerolinea = aerolinea;
        this.asientos = new ArrayList<>(); //por agregacion
        this.horarioSalida = horarioSalida;
    }

    public void setearAsientos(int cantidadTotalAsientos){
        // Validación básica para evitar números no válidos
        if (cantidadTotalAsientos <= 0) {
            System.out.println("No se pueden crear 0 o menos asientos.");
            return;
        }

        this.asientos.clear(); // Limpiamos la lista por si ya tenía asientos

        for (int i = 1; i <= cantidadTotalAsientos; i++) {
            String numeroAsiento = "E-" + String.format("%03d", i); // Generacion numeros asientos(E-001, E-002...)
            Asiento nuevoAsiento = new Asiento(numeroAsiento, TipoAsiento.ECONOMICO, EstadoAsiento.DISPONIBLE);
            this.asientos.add(nuevoAsiento);
        }
    }

    //toString
    @Override
    public String toString() {
        return "Vuelo [numero=" + numero + ", origen=" + origen + ", destino=" + destino + ", aerolinea=" + aerolinea
                + ", asientos=" + asientos + ", horarioSalida=" + horarioSalida + "]";
    }


    //getters and setters
    public boolean verificarDisponibilidad(){
        return true;
    }


    public String getNumero() {
        return numero;
    }


    public void setNumero(String numero) {
        this.numero = numero;
    }


    public String getOrigen() {
        return origen;
    }


    public void setOrigen(String origen) {
        this.origen = origen;
    }


    public String getDestino() {
        return destino;
    }


    public void setDestino(String destino) {
        this.destino = destino;
    }


    public Aerolinea getAerolinea() {
        return aerolinea;
    }


    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }


    public List<Asiento> getAsientos() {
        return asientos;
    }


    public void setAsientos(List<Asiento> asientos) {
        this.asientos = asientos;
    }


    public LocalDateTime getHorarioSalida() {
        return horarioSalida;
    }


    public void setHorarioSalida(LocalDateTime horarioSalida) {
        this.horarioSalida = horarioSalida;
    }

    
}
