package com.example.Enums;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EnumsTest {
    @Test
    void vehiculoSuvTest() {
        assertDoesNotThrow(() -> {
            TipoVehiculo valor = TipoVehiculo.valueOf("SUV");
            assertEquals(TipoVehiculo.SUV, valor);
        });
    }

    @Test
    void vehiculoEconomicoTest() {
        assertDoesNotThrow(() -> {
            TipoVehiculo valor = TipoVehiculo.valueOf("ECONOMICO");
            assertEquals(TipoVehiculo.ECONOMICO, valor);
        });
    }

    @Test
    void vehiculoLujoTest() {
        assertDoesNotThrow(() -> {
            TipoVehiculo valor = TipoVehiculo.valueOf("LUJO");
            assertEquals(TipoVehiculo.LUJO, valor);
        });
    }

    @Test
    void estadoVehiculoDisponibleTest() {
        assertDoesNotThrow(() -> {
            EstadoVehiculo valor = EstadoVehiculo.valueOf("DISPONIBLE");
            assertEquals(EstadoVehiculo.DISPONIBLE, valor);
        });
    }

    @Test
    void estadoVehiculoReservadoTest() {
        assertDoesNotThrow(() -> {
            EstadoVehiculo valor = EstadoVehiculo.valueOf("RESERVADO");
            assertEquals(EstadoVehiculo.RESERVADO, valor);
        });
    }

    @Test
    void estadoVehiculoEnMantenimientoTest() {
        assertDoesNotThrow(() -> {
            EstadoVehiculo valor = EstadoVehiculo.valueOf("EN_MANTENIMIENTO");
            assertEquals(EstadoVehiculo.EN_MANTENIMIENTO, valor);
        });
    }
}
