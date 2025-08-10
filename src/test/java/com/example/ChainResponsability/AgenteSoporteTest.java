package com.example.ChainResponsability;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.example.ReporteIncidencia;

public class AgenteSoporteTest {
    @Test
    void manejarConsultaTest() {
        AgenteSoporte agenteSoporte = new AgenteSoporte(null, null, null, null, null);
        ReporteIncidencia reporteDummy = new ReporteIncidencia(null, null, null);

        assertThrows(UnsupportedOperationException.class, () -> {
            agenteSoporte.manejarConsulta(reporteDummy);
        });
    }
}
