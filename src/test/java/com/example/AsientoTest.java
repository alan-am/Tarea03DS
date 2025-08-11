package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.Enums.EstadoAsiento;
import com.example.Enums.TipoAsiento;

public class AsientoTest {
    // Metodo: verificarDisponibilidad() | Entrada: estado=DISPONIBLE | Salida esperada: true
    @Test
    @DisplayName("verificarDisponibilidad: true cuando el estado es DISPONIBLE")
    void verificarDisponibilidad_disponible() {
        Asiento asiento = new Asiento("E-001", TipoAsiento.ECONOMICO, EstadoAsiento.DISPONIBLE);
        assertTrue(asiento.verificarDisponibilidad());
    }

    @Test
    @DisplayName("verificarDisponibilidad: false cuando el estado no es DISPONIBLE")
    void verificarDisponibilidad_noDisponible() {
        Asiento asiento = new Asiento("E-002", TipoAsiento.PRIMERA, EstadoAsiento.RESERVADO);
        assertFalse(asiento.verificarDisponibilidad());
    }

    @Test
    @DisplayName("toString: incluye numero, tipo y estado en el formato esperado")
    void toString_formato() {
        Asiento asiento = new Asiento("E-003", TipoAsiento.EJECUTIVO, EstadoAsiento.OCUPADO);
        assertEquals("Asiento [numeroAsiento=E-003, tipo=EJECUTIVO, estado=OCUPADO]", asiento.toString());
    }
    
}
