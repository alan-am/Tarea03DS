package com.example.ChainResponsability;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.ReporteIncidencia;

public class AtencionProveedorVehiculoTest {
    @Disabled
    @Test
    void manejarConsultaTest() {
        AtencionProveedorVehiculo atencionProveedorVehiculo = new AtencionProveedorVehiculo(null);
        ReporteIncidencia reporteDummy = new ReporteIncidencia(null, null, null);

        
        assertThrows(UnsupportedOperationException.class, () -> {
            atencionProveedorVehiculo.manejarConsulta(reporteDummy);
        });
    }

    @Test
    @DisplayName("AtencionProveedorVehiculo.toString: incluye operador y proveedorVehiculo")
    void toString_formato() {
        AtencionProveedorVehiculo at = new AtencionProveedorVehiculo(null);
        assertEquals("AtencionProveedorVehiculo{operador=null, proveedorVehiculo=null}", at.toString());
    }


}
