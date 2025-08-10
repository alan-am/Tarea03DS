package com.example;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AdministradorTest {
    @Test
    void manejarConsultaTest() {
        Administrador administrador = new Administrador(null, null, null, null, null);
        ReporteIncidencia reporteDummy = new ReporteIncidencia(null, null, null);

        assertThrows(UnsupportedOperationException.class, () -> {
            administrador.manejarConsulta(reporteDummy);
        });
    }
}
