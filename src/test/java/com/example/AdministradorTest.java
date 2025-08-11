package com.example;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AdministradorTest {
    
    // Metodo: toString() | Entrada: credencial=CR1, operador=null | Salida esperada: string exacto
    @Test
    @DisplayName("Administrador.toString: incluye credencial y operador")
    void toString_formato() {
        Administrador a = new Administrador("U1", "N", "E", "T", "CR1");
        assertEquals("Administrador [credencialAdmin=CR1, operador=null]", a.toString());
    }

    @Test
    @DisplayName("manejarConsulta: sin siguiente operador no lanza excepciones")
    void manejarConsulta_sinSiguiente() {
        Administrador a = new Administrador("U1", "N", "E", "T", "CR1");
        assertDoesNotThrow(() -> a.manejarConsulta(new ReporteIncidencia("1", "d", null)));
    }



    @Test
    void manejarConsultaTest() {
        Administrador administrador = new Administrador(null, null, null, null, null);
        ReporteIncidencia reporteDummy = new ReporteIncidencia(null, null, null);

        assertThrows(UnsupportedOperationException.class, () -> {
            administrador.manejarConsulta(reporteDummy);
        });
    }
}
