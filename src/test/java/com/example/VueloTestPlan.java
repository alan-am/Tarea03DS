package com.example;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.Enums.EstadoAsiento;
import com.example.Enums.TipoAsiento;

public class VueloTestPlan {

    // Metodo: setearAsientos(int cantidadTotalAsientos) | Entrada: 3 | Salida esperada: lista asientos con 3 elementos E-001..E-003 tipo ECONOMICO y DISPONIBLE
    @Test
    @DisplayName("setearAsientos: crea la cantidad de asientos solicitada con formato y valores por defecto")
    void setearAsientos_creaAsientosCorrectos() {
        Vuelo vuelo = new Vuelo("V1", "ORIG", "DEST", null, LocalDateTime.of(2024, 1, 1, 10, 0));
        vuelo.setearAsientos(3);

        assertNotNull(vuelo.getAsientos());
        assertEquals(3, vuelo.getAsientos().size());
        assertEquals("E-001", vuelo.getAsientos().get(0).getNumeroAsiento());
        assertEquals(TipoAsiento.ECONOMICO, vuelo.getAsientos().get(0).getTipo());
        assertEquals(EstadoAsiento.DISPONIBLE, vuelo.getAsientos().get(0).getEstado());
        assertEquals("E-003", vuelo.getAsientos().get(2).getNumeroAsiento());
    }

    // Metodo: setearAsientos(int cantidadTotalAsientos) | Entrada: 0 | Salida esperada: lista asientos vacia
    @Test
    @DisplayName("setearAsientos: no crea asientos cuando la cantidad es 0")
    void setearAsientos_cantidadCero() {
        Vuelo vuelo = new Vuelo("V2", "O", "D", null, LocalDateTime.of(2024, 1, 1, 10, 0));
        vuelo.setearAsientos(0);
        assertEquals(0, vuelo.getAsientos().size());
    }

    // Metodo: setearAsientos(int cantidadTotalAsientos) | Entrada: -5 | Salida esperada: lista asientos vacia
    @Test
    @DisplayName("setearAsientos: no crea asientos cuando la cantidad es negativa")
    void setearAsientos_cantidadNegativa() {
        Vuelo vuelo = new Vuelo("V3", "O", "D", null, LocalDateTime.of(2024, 1, 1, 10, 0));
        vuelo.setearAsientos(-5);
        assertEquals(0, vuelo.getAsientos().size());
    }

    // Metodo: setearAsientos(int) | Entrada: llamada previa con 2 y luego con 1 | Salida esperada: lista reemplazada con 1 asiento
    @Test
    @DisplayName("setearAsientos: reemplaza la lista previa de asientos al ser llamada nuevamente")
    void setearAsientos_reemplazaLista() {
        Vuelo vuelo = new Vuelo("V4", "O", "D", null, LocalDateTime.of(2024, 1, 1, 10, 0));
        vuelo.setearAsientos(2);
        assertEquals(2, vuelo.getAsientos().size());
        vuelo.setearAsientos(1);
        assertEquals(1, vuelo.getAsientos().size());
        assertEquals("E-001", vuelo.getAsientos().get(0).getNumeroAsiento());
    }

    // Metodo: toString() | Entrada: numero=V5, origen=O, destino=D, aerolinea=null, asientos=[], horarioSalida=2024-01-01T10:00 | Salida esperada: string exacto
    @Test
    @DisplayName("toString: formatea correctamente todos los campos incluyendo listas vacías")
    void toString_formatoBasico() {
        LocalDateTime fecha = LocalDateTime.of(2024, 1, 1, 10, 0);
        Vuelo vuelo = new Vuelo("V5", "O", "D", null, fecha);
        String esperado = "Vuelo [numero=V5, origen=O, destino=D, aerolinea=null, asientos=[], horarioSalida=" + fecha + "]";
        assertEquals(esperado, vuelo.toString());
    }

    // Metodo: verificarDisponibilidad() | Entrada: (sin dependencias) | Salida esperada: true
    @Test
    @DisplayName("verificarDisponibilidad: retorna true (implementación actual)")
    void verificarDisponibilidad_devuelveTrue() {
        Vuelo vuelo = new Vuelo("V6", "O", "D", null, LocalDateTime.of(2024, 1, 1, 10, 0));
        assertTrue(vuelo.verificarDisponibilidad());
    }
}