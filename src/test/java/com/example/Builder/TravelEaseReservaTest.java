package com.example.Builder;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.example.Vehiculo;
import com.example.Vuelo;

public class TravelEaseReservaTest {
    @Test
    void resetTest() {
        TravelEaseReserva travelEaseReserva = new TravelEaseReserva();

        assertThrows(UnsupportedOperationException.class, () -> {
            travelEaseReserva.reset();
        });
    }

    @Test
    void buildVueloTest() {
        Vuelo vueloDummy = new Vuelo("1", null, null, null, null);
        TravelEaseReserva travelEaseReserva = new TravelEaseReserva();

        
        assertThrows(UnsupportedOperationException.class, () -> {
            travelEaseReserva.buildVuelo(vueloDummy);
        });
    }

    @Test
    void buildAlquilerVehiculoTest() {
        Vehiculo vehiculoDummy = new Vehiculo(null, null, null, null, null, null, 0);
        TravelEaseReserva travelEaseReserva = new TravelEaseReserva();

        assertThrows(UnsupportedOperationException.class, () -> {
            travelEaseReserva.buildAlquilerVehiculo(vehiculoDummy);
        });
    }

}
