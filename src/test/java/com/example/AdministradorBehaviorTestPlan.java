package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.ChainResponsability.Operador;

public class AdministradorBehaviorTestPlan {

    // Metodo: toString() | Entrada: credencial=CR1, operador=null | Salida esperada: string exacto
    @Test
    @DisplayName("Administrador.toString: incluye credencial y operador")
    void toString_formato() {
        Administrador a = new Administrador("U1", "N", "E", "T", "CR1");
        assertEquals("Administrador [credencialAdmin=CR1, operador=null]", a.toString());
    }

    // Metodo: gestionarPoliticas() | Entrada: - | Salida esperada: no excepción
    @Test
    @DisplayName("gestionarPoliticas: no lanza excepciones")
    void gestionarPoliticas_noExcepcion() {
        Administrador a = new Administrador("U1", "N", "E", "T", "CR1");
        assertDoesNotThrow(a::gestionarPoliticas);
    }

    // Metodo: autorizarReembolsos() | Entrada: - | Salida esperada: no excepción
    @Test
    @DisplayName("autorizarReembolsos: no lanza excepciones")
    void autorizarReembolsos_noExcepcion() {
        Administrador a = new Administrador("U1", "N", "E", "T", "CR1");
        assertDoesNotThrow(a::autorizarReembolsos);
    }

    // Metodo: gestionarItinerarios() | Entrada: - | Salida esperada: no excepción
    @Test
    @DisplayName("gestionarItinerarios: no lanza excepciones")
    void gestionarItinerarios_noExcepcion() {
        Administrador a = new Administrador("U1", "N", "E", "T", "CR1");
        assertDoesNotThrow(a::gestionarItinerarios);
    }

    // Metodo: manejarConsulta(ReporteIncidencia) | Entrada: sin siguiente operador | Salida esperada: no excepción
    @Test
    @DisplayName("manejarConsulta: sin siguiente operador no lanza excepciones")
    void manejarConsulta_sinSiguiente() {
        Administrador a = new Administrador("U1", "N", "E", "T", "CR1");
        assertDoesNotThrow(() -> a.manejarConsulta(new ReporteIncidencia("1", "d", null)));
    }

    // Metodo: manejarConsulta(ReporteIncidencia) | Entrada: con siguiente operador | Salida esperada: delega la llamada
    @Test
    @DisplayName("manejarConsulta: delega la llamada al siguiente operador si existe")
    void manejarConsulta_conSiguiente() {
        Administrador a = new Administrador("U1", "N", "E", "T", "CR1");
        class OpStub implements Operador {
            boolean llamado = false;
            @Override public void setNextOperador(Operador o) {}
            @Override public void manejarConsulta(ReporteIncidencia r) { llamado = true; }
        }
        OpStub stub = new OpStub();
        a.setNextOperador(stub);
        a.manejarConsulta(new ReporteIncidencia("1", "d", null));
        assertTrue(stub.llamado);
    }
}