package com.example.Builder;

import java.time.LocalDateTime;
import java.util.List;

import com.example.Boleto;
import com.example.Usuario;
import com.example.Vehiculo;
import com.example.Vuelo;
import com.example.Observer.EventManager;

public class Reserva {
    private String id;
    private LocalDateTime fechaCreacion;
    private Usuario reservador;
    private EstadoReserva estado;
    private Vuelo vuelo;
    private List<Boleto> boletos;
    private List<Vehiculo> vehiculosReservados;
    private double precio;
    private EventManager eventManager; //por relacion de agregacion

    public Reserva(){};

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

    //crear eventManager - por agregacion
    public void setEventManager(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    //notificar cambio
    private void notificarCambio(String mensaje) {
        if (eventManager != null) {
            eventManager.notify(mensaje);
        }
    }

    public void confirmar() {
        this.estado = EstadoReserva.CONFIRMADA;
    }

    public void cancelar() {
        this.estado = EstadoReserva.CANCELADA;
    }

    @Override
    public String toString() {
        return "Reserva [id=" + id + ", fechaCreacion=" + fechaCreacion + ", reservador=" + reservador + ", estado="
                + estado + ", vuelo=" + vuelo + ", boletos=" + boletos + ", vehiculosReservados=" + vehiculosReservados
                + ", precio=" + precio + "]";
    }

    //getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Usuario getReservador() {
        return reservador;
    }

    public void setReservador(Usuario reservador) {
        this.reservador = reservador;
    }

    public EstadoReserva getEstado() {
        return estado;
    }

    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public List<Boleto> getBoletos() {
        return boletos;
    }

    public void setBoletos(List<Boleto> boletos) {
        this.boletos = boletos;
    }

    public List<Vehiculo> getVehiculosReservados() {
        return vehiculosReservados;
    }

    public void setVehiculosReservados(List<Vehiculo> vehiculosReservados) {
        this.vehiculosReservados = vehiculosReservados;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
}
