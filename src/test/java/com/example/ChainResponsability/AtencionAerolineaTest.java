package com.example.ChainResponsability;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.example.ReporteIncidencia;

public class AtencionAerolineaTest {
    @Test
    void manejarConsultaTest() {
        AtencionAerolinea atencionAerolinea = new AtencionAerolinea(null);
        ReporteIncidencia reporteDummy = new ReporteIncidencia(null, null, null);

        assertThrows(UnsupportedOperationException.class, () -> {
            atencionAerolinea.manejarConsulta(reporteDummy);
        });
    }
}
