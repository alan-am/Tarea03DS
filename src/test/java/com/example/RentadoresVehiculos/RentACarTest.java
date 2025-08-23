package com.example.RentadoresVehiculos;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.Vehiculo;

public class RentACarTest {
    @Test
    void reservarVehiculoTest() {
        RentACar r = new RentACar();
        
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            r.reservarVehiculo(null);
        });

        assertEquals("No es posible reserva el vehiculo sin referencia", e.getMessage());
    }

    @Test
    @DisplayName("ID: TRAC-001")
    void confirmarVehiculoTest() {
        RentACar r = new RentACar();

        assertDoesNotThrow(() -> {
            r.confirmarVehiculo("R12345");
        });
    }

    @Test
    @DisplayName("ID: TRAC-002")
    void confirmarVehiculoTest2() {
        RentACar r = new RentACar();

        assertDoesNotThrow(() -> {
            r.cancelarVehiculo("R10276");
        });
    }

}
