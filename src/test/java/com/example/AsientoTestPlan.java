package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.Enums.EstadoAsiento;
import com.example.Enums.TipoAsiento;

public class AsientoTestPlan {

    // Metodo: verificarDisponibilidad() | Entrada: estado=DISPONIBLE | Salida esperada: true
    @Test
    @DisplayName("verificarDisponibilidad: true cuando el estado es DISPONIBLE")
    void verificarDisponibilidad_disponible() {
        Asiento asiento = new Asiento("E-001", TipoAsiento.ECONOMICO, EstadoAsiento.DISPONIBLE);
        assertTrue(asiento.verificarDisponibilidad());
    }

    // Metodo: verificarDisponibilidad() | Entrada: estado=RESERVADO | Salida esperada: false
    @Test
    @DisplayName("verificarDisponibilidad: false cuando el estado no es DISPONIBLE")
    void verificarDisponibilidad_noDisponible() {
        Asiento asiento = new Asiento("E-002", TipoAsiento.PRIMERA, EstadoAsiento.RESERVADO);
        assertFalse(asiento.verificarDisponibilidad());
    }

    // Metodo: toString() | Entrada: numero=E-003, tipo=EJECUTIVO, estado=OCUPADO | Salida esperada: string exacto
    @Test
    @DisplayName("toString: incluye numero, tipo y estado en el formato esperado")
    void toString_formato() {
        Asiento asiento = new Asiento("E-003", TipoAsiento.EJECUTIVO, EstadoAsiento.OCUPADO);
        assertEquals("Asiento [numeroAsiento=E-003, tipo=EJECUTIVO, estado=OCUPADO]", asiento.toString());
    }
}