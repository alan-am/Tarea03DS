package com.example.ChainResponsability;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.ReporteIncidencia;

public class AtencionAerolineaTest {

    // Metodo: toString() | Entrada: operador=null, aerolinea=null | Salida esperada: string exacto
    @Test
    @DisplayName("AtencionAerolinea.toString: incluye operador y aerolinea con valores actuales")
    void toString_formato() {
        AtencionAerolinea at = new AtencionAerolinea(null);
        assertEquals("AtencionAerolinea{operador=null, aerolinea=null}", at.toString());
    }

    @Test
    void manejarConsultaTest() {
        AtencionAerolinea atencionAerolinea = new AtencionAerolinea(null);
        ReporteIncidencia reporteDummy = new ReporteIncidencia(null, null, null);

        assertThrows(UnsupportedOperationException.class, () -> {
            atencionAerolinea.manejarConsulta(reporteDummy);
        });
    }
}
