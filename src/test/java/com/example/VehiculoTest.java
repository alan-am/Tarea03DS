package com.example;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.Enums.EstadoVehiculo;
import com.example.Enums.TipoVehiculo;

public class VehiculoTest {
    @Test
    void verificarDisponibilidadTest() {
        Vehiculo vehiculo = new Vehiculo(null, null, null, null, null, null, 0);
        
        assertDoesNotThrow(() -> {
            vehiculo.verificarDisponibilidad();
        });
    }

    @Test
    @DisplayName("verificarDisponibilidad: true cuando el estado es DISPONIBLE")
    void verificarDisponibilidad_disponible() {
        Vehiculo v = new Vehiculo(TipoVehiculo.SUV, "P", 5, "U", EstadoVehiculo.DISPONIBLE, null, 10.0);
        assertTrue(v.verificarDisponibilidad());
    }

        // Metodo: verificarDisponibilidad() | Entrada: estado=RESERVADO | Salida esperada: false
    @Test
    @DisplayName("verificarDisponibilidad: false cuando el estado no es DISPONIBLE")
    void verificarDisponibilidad_noDisponible() {
        Vehiculo v = new Vehiculo(TipoVehiculo.SUV, "P", 5, "U", EstadoVehiculo.RESERVADO, null, 10.0);
        assertFalse(v.verificarDisponibilidad());
    }

    @Test
    @DisplayName("toString: incluye el apóstrofe tras proveedor segun implementación actual")
    void toString_formatoConApostrofeProveedor() {
        Vehiculo v = new Vehiculo(TipoVehiculo.SUV, "P1", 4, "U1", EstadoVehiculo.DISPONIBLE, null, 99.9);
        String esperado = "Vehiculo{" +
                "tipo=SUV" +
                ", placa='P1'" +
                ", maxPasajeros=4" +
                ", ubiActual='U1'" +
                ", estado=DISPONIBLE" +
                ", proveedor=null'" +
                ", precioAlquiler=99.9" +
                "}";
        assertEquals(esperado, v.toString());
    }
}
