package com.example.ChainResponsability;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.ReporteIncidencia;

public class AgenteSoporteToStringAndExceptionsTest {

    // Metodo: toString() | Entrada: campos básicos | Salida esperada: string exacto
    @Test
    @DisplayName("AgenteSoporte.toString: refleja todos los campos")
    void toString_formato() {
        AgenteSoporte ag = new AgenteSoporte("A1", "N", "E", "T", null);
        String esperado = "AgenteSoporte{" +
                "idAgente='A1'" +
                ", nombre='N'" +
                ", email='E'" +
                ", telefono='T'" +
                ", operador=null" +
                "}";
        assertEquals(esperado, ag.toString());
    }

    // Metodo: setNextOperador(Operador) | Entrada: operador dummy | Salida esperada: UnsupportedOperationException
    @Test
    @DisplayName("setNextOperador: lanza UnsupportedOperationException")
    void setNextOperador_excepcion() {
        AgenteSoporte ag = new AgenteSoporte("A1", "N", "E", "T", null);
        assertThrows(UnsupportedOperationException.class, () -> ag.setNextOperador(null));
    }

    // Metodo: manejarConsulta(ReporteIncidencia) | Entrada: reporte dummy | Salida esperada: UnsupportedOperationException
    @Test
    @DisplayName("manejarConsulta: lanza UnsupportedOperationException")
    void manejarConsulta_excepcion() {
        AgenteSoporte ag = new AgenteSoporte("A1", "N", "E", "T", null);
        assertThrows(UnsupportedOperationException.class, () -> ag.manejarConsulta(new ReporteIncidencia("1", "d", null)));
    }
}