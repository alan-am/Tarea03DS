package com.example.ChainResponsability;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.example.ReporteIncidencia;

public class AtencionProveedorVehiculoTest {
    @Test
    void manejarConsultaTest() {
        AtencionProveedorVehiculo atencionProveedorVehiculo = new AtencionProveedorVehiculo(null);
        ReporteIncidencia reporteDummy = new ReporteIncidencia(null, null, null);

        assertThrows(UnsupportedOperationException.class, () -> {
            atencionProveedorVehiculo.manejarConsulta(reporteDummy);
        });
    }
}
