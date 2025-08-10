package com.example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.Builder.Reserva;

public class ClienteBehaviorTestPlan {

    // Metodo: realizarReserva() | Entrada: ninguno | Salida esperada: no excepción
    @Test
    @DisplayName("realizarReserva: método vacío no lanza excepción")
    void realizarReserva_noExcepcion() {
        Cliente c = new Cliente("C1", "N", "E", "T");
        assertDoesNotThrow(c::realizarReserva);
    }

    // Metodo: cancelarReserva() | Entrada: ninguno | Salida esperada: no excepción
    @Test
    @DisplayName("cancelarReserva: método vacío no lanza excepción")
    void cancelarReserva_noExcepcion() {
        Cliente c = new Cliente("C1", "N", "E", "T");
        assertDoesNotThrow(c::cancelarReserva);
    }

    // Metodo: visualizarReserva() | Entrada: lista vacía | Salida esperada: no excepción
    @Test
    @DisplayName("visualizarReserva: itera sobre lista vacía sin lanzar excepción")
    void visualizarReserva_listaVacia() {
        Cliente c = new Cliente("C1", "N", "E", "T");
        c.setReservasGeneradas(new ArrayList<Reserva>());
        assertDoesNotThrow(c::visualizarReserva);
    }

    // Metodo: colocarReporte(id, descripcion) | Entrada: id=R1, desc=prob | Salida esperada: ReporteIncidencia con campos asignados
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