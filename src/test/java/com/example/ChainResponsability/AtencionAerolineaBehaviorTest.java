package com.example.ChainResponsability;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.ReporteIncidencia;

public class AtencionAerolineaBehaviorTest {

    // Metodo: toString() | Entrada: operador=null, aerolinea=null | Salida esperada: string exacto
    @Test
    @DisplayName("AtencionAerolinea.toString: incluye operador y aerolinea con valores actuales")
    void toString_formato() {
        AtencionAerolinea at = new AtencionAerolinea(null);
        assertEquals("AtencionAerolinea{operador=null, aerolinea=null}", at.toString());
    }

    // Metodo: manejarConsulta(ReporteIncidencia) | Entrada: sin siguiente operador | Salida esperada: no excepción
    @Test
    @DisplayName("manejarConsulta: no lanza excepción cuando no hay siguiente operador")
    void manejarConsulta_sinSiguiente() {
        AtencionAerolinea at = new AtencionAerolinea(null);
        assertDoesNotThrow(() -> at.manejarConsulta(new ReporteIncidencia("1", "d", null)));
    }

    // Metodo: manejarConsulta(ReporteIncidencia) | Entrada: con siguiente operador | Salida esperada: delega la llamada
    @Test
    @DisplayName("manejarConsulta: delega al siguiente operador si existe")
    void manejarConsulta_conSiguiente() {
        AtencionAerolinea at = new AtencionAerolinea(null);
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