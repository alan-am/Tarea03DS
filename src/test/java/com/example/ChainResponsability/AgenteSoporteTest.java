package com.example.ChainResponsability;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.ReporteIncidencia;

public class AgenteSoporteTest {
    @Test
    void manejarConsultaTest() {
        AgenteSoporte agenteSoporte = new AgenteSoporte(null, null, null, null);
        ReporteIncidencia reporteDummy = new ReporteIncidencia(null, null, null);

        assertThrows(UnsupportedOperationException.class, () -> {
            agenteSoporte.manejarConsulta(reporteDummy);
        });
    }

    @Test
    @DisplayName("AgenteSoporte.toString: refleja todos los campos")
    void toString_formato() {
        AgenteSoporte ag = new AgenteSoporte("A1", "N", "E", "T");
        String esperado = "AgenteSoporte{" +
                "idAgente='A1'" +
                ", nombre='N'" +
                ", email='E'" +
                ", telefono='T'" +
                ", operador=null" +
                "}";
        assertEquals(esperado, ag.toString());
    }
}
