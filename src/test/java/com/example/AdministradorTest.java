package com.example;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
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
    @DisplayName("ID: TGPA-001: verificar el metodo si credencialAdmin tiene un valor válido")
    void gestionarPoliticaTest() {
        Administrador admin = new Administrador("1", "Eddy", "eaaa@gmail.com", "123456789", "ADMIN123");
        
        assertDoesNotThrow(() -> {
            admin.gestionarPoliticas();
        });
    }

    @Test
    @DisplayName("ID: TGPA-002: verificar el metodo si credencialAdmin tiene un valor no válido")
    void gestionarPoliticaTest2() {
        Administrador admin = new Administrador("1", "Eddy", "eaaa@gmail.com", "123456789", null);
        
        Exception mens = assertThrows(IllegalArgumentException.class, () -> {
            admin.gestionarPoliticas();
        });

        assertEquals("La credencial del administrador no puede ser nula ni vacío", mens.getMessage());
    }
}
