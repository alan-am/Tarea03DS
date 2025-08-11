package com.example.Builder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDateTime;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.Asiento;
import com.example.Boleto;
import com.example.Usuario;
import com.example.Vehiculo;
import com.example.Vuelo;
import com.example.Enums.EstadoAsiento;
import com.example.Enums.EstadoVehiculo;
import com.example.Enums.TipoAsiento;
import com.example.Enums.TipoVehiculo;

public class TravelEaseReservaTest {
    @Test
    @DisplayName("reset: inicializa una nueva Reserva")
    void reset_inicializaReserva() {
        TravelEaseReserva builder = new TravelEaseReserva();
        builder.reset();
        assertNotNull(builder.getReserva());
    }

    // Metodo: buildDatos(id,reservador) | Entrada: id=R1, reservador=Usuario | Salida esperada: campos seteados y estado=PENDIENTE
    @Test
    @DisplayName("buildDatos: establece id, reservador, fecha y estado PENDIENTE")
    void buildDatos_estableceCampos() {
        TravelEaseReserva builder = new TravelEaseReserva();
        builder.reset();
        Usuario user = new Usuario("U10", "N", "e", "t");
        builder.buildDatos("R1", user);
        assertEquals("R1", builder.getReserva().getId());
        assertEquals(user, builder.getReserva().getReservador());
        assertNotNull(builder.getReserva().getFechaCreacion());
        assertEquals(EstadoReserva.PENDIENTE, builder.getReserva().getEstado());
    }

    @Test
    @DisplayName("buildVuelo: asigna el vuelo a la reserva")
    void buildVuelo_asigna() {
        TravelEaseReserva builder = new TravelEaseReserva();
        builder.reset();
        Vuelo vuelo = new Vuelo("V1", "O", "D", null, LocalDateTime.of(2024,1,1,10,0));
        builder.buildVuelo(vuelo);
        assertEquals(vuelo, builder.getReserva().getVuelo());
    }

    // Metodo: buildBoleto(Boleto) | Entrada: dos boletos | Salida esperada: lista con tamaño 2
    @Test
    @DisplayName("buildBoleto: agrega boletos a la lista de la reserva")
    void buildBoleto_agrega() {
        TravelEaseReserva builder = new TravelEaseReserva();
        builder.reset();
        Boleto b1 = new Boleto("B1", new Asiento("E1", TipoAsiento.ECONOMICO, EstadoAsiento.DISPONIBLE), null, null, 50.0);
        Boleto b2 = new Boleto("B2", new Asiento("E2", TipoAsiento.ECONOMICO, EstadoAsiento.DISPONIBLE), null, null, 70.0);
        builder.buildBoleto(b1);
        builder.buildBoleto(b2);
        assertEquals(2, builder.getReserva().getBoletos().size());
    }

    @Test
    @DisplayName("buildAlquilerVehiculo: agrega vehiculos a la lista de la reserva")
    void buildAlquilerVehiculo_agrega() {
        TravelEaseReserva builder = new TravelEaseReserva();
        builder.reset();
        Vehiculo v = new Vehiculo(TipoVehiculo.SUV, "P1", 5, "U", EstadoVehiculo.DISPONIBLE, null, 120.0);
        builder.buildAlquilerVehiculo(v);
        assertEquals(1, builder.getReserva().getVehiculosReservados().size());
    }

    @Test
    @DisplayName("buildPrecio: suma correctamente precios de boletos y vehiculos")
    void buildPrecio_sumaComponentes() {
        TravelEaseReserva builder = new TravelEaseReserva();
        builder.reset();
        Boleto b1 = new Boleto("B1", new Asiento("E1", TipoAsiento.ECONOMICO, EstadoAsiento.DISPONIBLE), null, null, 50.0);
        Boleto b2 = new Boleto("B2", new Asiento("E2", TipoAsiento.ECONOMICO, EstadoAsiento.DISPONIBLE), null, null, 70.0);
        Vehiculo v = new Vehiculo(TipoVehiculo.SUV, "P1", 5, "U", EstadoVehiculo.DISPONIBLE, null, 120.0);
        builder.buildBoleto(b1);
        builder.buildBoleto(b2);
        builder.buildAlquilerVehiculo(v);
        builder.buildPrecio();
        assertEquals(240.0, builder.getReserva().getPrecio(), 0.0001);
    }

}
