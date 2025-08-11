package com.example;

import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.Test;

import com.example.Builder.EstadoReserva;
import com.example.Builder.Reserva;
import com.example.Builder.TravelEaseReserva;
import com.example.Enums.EstadoAsiento;
import com.example.Enums.EstadoVehiculo;
import com.example.Enums.TipoAsiento;
import com.example.Enums.TipoVehiculo;

//probando el flujo completo del builder TravelEaseReserva, test de integracion para probar que tal
class DummyAerolinea implements Aerolinea {
    @Override public void reservarVuelo() {}
    @Override public void confirmarVuelo() {}
    @Override public void cancelarVuelo() {}
}

class DummyProveedor implements ProveedorVehiculo {
    @Override public void reservarVehiculo(Vehiculo vehiculo) {}
    @Override public void confirmarVehiculo(String s) {}
    @Override public void cancelarVehiculo(String s) {}
}


public class TravelEaseReservaFullFlowTest {

    @Test
    void flujoCompletoBuilder_deberiaConstruirReservaConTodoYCalcularPrecio() {
        // Arrange
        TravelEaseReserva builder = new TravelEaseReserva();
        builder.reset();

        Usuario reservador = new Usuario("U-1", "Pepe", "p@p.com", "0999");
        Vuelo vuelo = new Vuelo("V-001", "GYE", "UIO", new DummyAerolinea(), LocalDateTime.now());

        Asiento a1 = new Asiento("E-001", TipoAsiento.ECONOMICO, EstadoAsiento.DISPONIBLE);
        Asiento a2 = new Asiento("E-002", TipoAsiento.ECONOMICO, EstadoAsiento.DISPONIBLE);

        Boleto b1 = new Boleto("B-1", a1, vuelo, reservador, 120.5);
        Boleto b2 = new Boleto("B-2", a2, vuelo, reservador, 99.5);

        Vehiculo v1 = new Vehiculo(TipoVehiculo.SUV, "ABC-123", 5, "GYE",
                EstadoVehiculo.DISPONIBLE, new DummyProveedor(), 40.0);

        // Act
        builder.buildDatos("R-001", reservador);
        builder.buildVuelo(vuelo);
        builder.buildBoleto(b1);
        builder.buildBoleto(b2);
        builder.buildAlquilerVehiculo(v1);
        builder.buildPrecio();
        Reserva r = builder.getReserva();

        // Assert: datos básicos
        assertEquals("R-001", r.getId());
        assertSame(reservador, r.getReservador());
        assertNotNull(r.getFechaCreacion(), "Fecha de creación debería setearse en buildDatos");
        assertEquals(EstadoReserva.PENDIENTE, r.getEstado(), "Estado inicial debe ser PENDIENTE");
        assertSame(vuelo, r.getVuelo());

        // Assert: colecciones
        assertEquals(2, r.getBoletos().size(), "Deben haberse agregado 2 boletos");
        assertEquals(Arrays.asList(b1, b2), r.getBoletos(), "Orden de los boletos debe mantenerse");
        assertEquals(1, r.getVehiculosReservados().size(), "Debe haber 1 vehículo reservado");
        assertSame(v1, r.getVehiculosReservados().get(0));

        // Assert: precio
        double esperado = 120.5 + 99.5 + 40.0;
        assertEquals(esperado, r.getPrecio(), 1e-9, "Precio total debe ser la suma de boletos + alquiler");
    }
}
