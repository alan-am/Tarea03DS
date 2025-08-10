package com.example.Builder;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
