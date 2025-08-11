package com.example;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.Builder.Reserva;

public class ClienteTest {
    @Test
    public void realizarReservaTest() {
        Cliente cliente = new Cliente(null, null, null, null);

        assertDoesNotThrow(() -> {
            cliente.realizarReserva();
        });
    }

    @Test
    @DisplayName("visualizarReserva: itera sobre lista vacía sin lanzar excepción")
    void visualizarReserva_listaVacia() {
        Cliente c = new Cliente("C1", "N", "E", "T");
        c.setReservasGeneradas(new ArrayList<Reserva>());
        assertDoesNotThrow(c::visualizarReserva);
    }

    @Test
    @DisplayName("colocarReporte: crea reporte con id y descripcion provistos")
    void colocarReporte_creaReporte() {
        Cliente c = new Cliente("C1", "N", "E", "T");
        ReporteIncidencia r = c.colocarReporte("R1", "prob");
        assertEquals("R1", r.getId());
        assertEquals("prob", r.getDescripcion());
        assertEquals(c, r.getClienteReportador());
    }
}
