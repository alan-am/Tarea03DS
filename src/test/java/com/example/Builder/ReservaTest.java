package com.example.Builder;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ReservaTest{
    @Test
    void confirmarTest() {
        Reserva reserva = new Reserva();
        reserva.confirmar();

        assertEquals(EstadoReserva.CONFIRMADA, reserva.getEstado());
    }

    @Test
    void cancelarTest() {
        Reserva reserva = new Reserva();
        reserva.cancelar();

        assertEquals(EstadoReserva.CANCELADA, reserva.getEstado());
    }

    @Test
    @DisplayName("Reserva.toString: refleja nulls y precio 0.0 en formato esperado")
    void toString_formato() {
        Reserva reserva = new Reserva();
        String esperado = "Reserva [id=null, fechaCreacion=null, reservador=null, estado=null, vuelo=null, boletos=null, vehiculosReservados=null, precio=0.0]";
        assertEquals(esperado, reserva.toString());
    }


}
