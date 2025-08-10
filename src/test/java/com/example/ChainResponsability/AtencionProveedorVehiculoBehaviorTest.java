package com.example.ChainResponsability;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.ReporteIncidencia;

public class AtencionProveedorVehiculoBehaviorTest {

    // Metodo: toString() | Entrada: operador=null, proveedorVehiculo=null | Salida esperada: string exacto
    @Test
    @DisplayName("AtencionProveedorVehiculo.toString: incluye operador y proveedorVehiculo")
    void toString_formato() {
        AtencionProveedorVehiculo at = new AtencionProveedorVehiculo(null);
        assertEquals("AtencionProveedorVehiculo{operador=null, proveedorVehiculo=null}", at.toString());
    }

    // Metodo: manejarConsulta(ReporteIncidencia) | Entrada: sin siguiente operador | Salida esperada: no excepción
    @Test
    @DisplayName("manejarConsulta: no lanza excepción cuando no hay siguiente operador")
    void manejarConsulta_sinSiguiente() {
        AtencionProveedorVehiculo at = new AtencionProveedorVehiculo(null);
        assertDoesNotThrow(() -> at.manejarConsulta(new ReporteIncidencia("1", "d", null)));
    }

    // Metodo: manejarConsulta(ReporteIncidencia) | Entrada: con siguiente operador | Salida esperada: delega la llamada
    @Test
    @DisplayName("manejarConsulta: delega al siguiente operador si existe")
    void manejarConsulta_conSiguiente() {
        AtencionProveedorVehiculo at = new AtencionProveedorVehiculo(null);
        class OpStub implements Operador {
            boolean llamado = false;
            @Override public void setNextOperador(Operador o) { }
            @Override public void manejarConsulta(ReporteIncidencia r) { llamado = true; }
        }
        OpStub stub = new OpStub();
        at.setNextOperador(stub);
        at.manejarConsulta(new ReporteIncidencia("1", "d", null));
        assertTrue(stub.llamado);
    }
}