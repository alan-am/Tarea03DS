package com.example;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class VehiculoTest {
    @Test
    void verificarDisponibilidadTest() {
        Vehiculo vehiculo = new Vehiculo(null, null, null, null, null, null, 0);
        
        assertDoesNotThrow(() -> {
            vehiculo.verificarDisponibilidad();
        });
    }
}
