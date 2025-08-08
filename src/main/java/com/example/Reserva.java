package com.example;

import java.time.LocalDateTime;
import java.util.List;

public class Reserva implements Servicio {
    private String id;
    private LocalDateTime fechaCreacion;
    private Usuario reservador;
    private EstadoReserva estado;
    private Vuelo vuelo;
    private List<Boleto> boletos;
    private List<Vehiculo> vehiculosReservados;
    private double precio;

    public Reserva(String id, LocalDateTime fechaCreacion, Usuario reservador, EstadoReserva estado, Vuelo vuelo, List<Boleto> boletos, List<Vehiculo> vehiculosReservados, double precio) {
        this.id = id;
        this.fechaCreacion = fechaCreacion;
        this.reservador = reservador;
        this.estado = estado;
        this.vuelo = vuelo;
        this.boletos = boletos;
        this.vehiculosReservados = vehiculosReservados;
        this.precio = precio;
    }

    public void confirmar() {
        this.estado = EstadoReserva.CONFIRMADA;
    }

    public void cancelar() {
        this.estado = EstadoReserva.CANCELADA;
    }

}
