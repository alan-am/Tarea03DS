package com.example;

import com.example.Enums.EstadoAsiento;
import com.example.Enums.TipoAsiento;

public class Asiento {
    private String numeroAsiento;
    private TipoAsiento tipo;
    private EstadoAsiento estado;

    
    public Asiento(String numeroAsiento, TipoAsiento tipo, EstadoAsiento estado) {
        this.numeroAsiento = numeroAsiento;
        this.tipo = tipo;
        this.estado = estado;
    }

    public boolean verificarDisponibilidad(){
        return this.estado == EstadoAsiento.DISPONIBLE;
    }


    //toString
    @Override
    public String toString() {
        return "Asiento [numeroAsiento=" + numeroAsiento + ", tipo=" + tipo + ", estado=" + estado + "]";
    }
    
    //getters and setters
    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public TipoAsiento getTipo() {
        return tipo;
    }


    public void setTipo(TipoAsiento tipo) {
        this.tipo = tipo;
    }


    public EstadoAsiento getEstado() {
        return estado;
    }


    public void setEstado(EstadoAsiento estado) {
        this.estado = estado;
    }
    
}

