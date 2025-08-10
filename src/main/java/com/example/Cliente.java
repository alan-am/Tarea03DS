package com.example;

import java.util.List;

import com.example.Builder.Reserva;

public class Cliente extends Usuario {
    private List<Reserva> reservasGeneradas;

    public Cliente(String id, String nombre, String email, String telefono) {
        super(id, nombre, email, telefono);
    }

    public void realizarReserva() {
        // Lógica para realizar una reserva omitida, debido a que seria una implementacion de integracion
        //que incluiria metodos externos
    }

    public void cancelarReserva() {
        // Lógica para cancelar una reserva omitida, debido a que seria una implementacion de integracion
        //que incluiria metodos externos
    }

    public void visualizarReserva() {
        for (Reserva reserva : reservasGeneradas) {
            System.out.println(reserva);
        }
    }

    public ReporteIncidencia colocarReporte(String idReporte, String descripcion) {
        return new ReporteIncidencia(idReporte, descripcion, this);
    }


    public List<Reserva> getReservasGeneradas() {
        return reservasGeneradas;
    }
    public void setReservasGeneradas(List<Reserva> reservasGeneradas) {
        this.reservasGeneradas = reservasGeneradas;
    }

}
