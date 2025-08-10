package com.example.Builder;

import java.time.LocalDateTime;
import java.util.ArrayList;

import com.example.Boleto;
import com.example.Usuario;
import com.example.Vehiculo;
import com.example.Vuelo;

public class TravelEaseReserva implements ReservaBuilder {

    private Reserva reserva;    

    public Reserva getReserva(){
        return reserva;
    }

    @Override
    public void reset() {
        this.reserva = new Reserva();
    }

    @Override
    public void buildVuelo(Vuelo vuelo) {
        this.reserva.setVuelo(vuelo);
    }

    @Override
    public void buildAlquilerVehiculo(Vehiculo vehiculo) {
        if (this.reserva.getVehiculosReservados() == null) {
            this.reserva.setVehiculosReservados(new ArrayList<>());
        }
        this.reserva.getVehiculosReservados().add(vehiculo);
    }

    @Override
    public void buildBoleto(Boleto boleto) {
        if (this.reserva.getBoletos() == null) {
            this.reserva.setBoletos(new ArrayList<>());
        }
        this.reserva.getBoletos().add(boleto);
    }

    @Override
    public void buildDatos(String id, Usuario reservador) {
        this.reserva.setId(id);
        this.reserva.setReservador(reservador);
        this.reserva.setFechaCreacion(LocalDateTime.now());
        this.reserva.setEstado(EstadoReserva.PENDIENTE);
    }


    
}
