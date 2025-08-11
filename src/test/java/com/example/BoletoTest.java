package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.Enums.EstadoAsiento;
import com.example.Enums.TipoAsiento;

public class BoletoTest {
    // Metodo: toString() | Entrada: numero=B1, asiento=E-010/ECONOMICO/DISPONIBLE, vuelo=(V99,O,D,null,[],fecha), duenio=Usuario(U3,...) precio=123.45 | Salida esperada: string exacto
    @Test
    @DisplayName("Boleto.toString: compone correctamente la representación con objetos anidados")
    void toString_formato() {
        // Preparar datos de prueba
        Asiento asiento = new Asiento("E-010", TipoAsiento.ECONOMICO, EstadoAsiento.DISPONIBLE);
        LocalDateTime fecha = LocalDateTime.of(2024, 1, 1, 10, 0);
        Vuelo vuelo = new Vuelo("V99", "O", "D", null, fecha);
        Usuario duenio = new Usuario("U3", "Carlos", "c@example.com", "555");
        Boleto boleto = new Boleto("B1", asiento, vuelo, duenio, 123.45);

        // Verificar el formato del toString
        String esperado = "Boleto [numeroBoleto=B1, asiento=" + asiento + ", vuelo=" + vuelo + ", duenio=" + duenio + ", precio=123.45]";
        
        // Comprobar que el toString coincide con lo esperado
        assertEquals(esperado, boleto.toString());
    }
}
