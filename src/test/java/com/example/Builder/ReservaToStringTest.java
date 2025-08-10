package com.example.Builder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ReservaToStringTest {

    // Metodo: toString() | Entrada: Reserva nueva (todos null, precio=0.0) | Salida esperada: string exacto
    @Test
    @DisplayName("Reserva.toString: refleja nulls y precio 0.0 en formato esperado")
    void toString_formato() {
        Reserva reserva = new Reserva();
        String esperado = "Reserva [id=null, fechaCreacion=null, reservador=null, estado=null, vuelo=null, boletos=null, vehiculosReservados=null, precio=0.0]";
        assertEquals(esperado, reserva.toString());
    }
}