package com.example;

import java.time.LocalDateTime;
import java.util.Date;

import com.example.Aerolineas.Avianca;
import com.example.Builder.Reserva;
import com.example.Builder.ReservaBuilder;
import com.example.Builder.TravelEaseReserva;
import com.example.ChainResponsability.AgenteSoporte;
import com.example.ChainResponsability.AtencionAerolinea;
import com.example.ChainResponsability.AtencionProveedorVehiculo;
import com.example.Enums.EstadoVehiculo;
import com.example.Enums.TipoVehiculo;
import com.example.RentadoresVehiculos.RentACar;

public class Main {
    public static void main(String[] args) {
        //Creacion Clientes
        Cliente cliente1 = new Cliente("1", "Geovanny", "tuntunsahur@gmail.com", "0999999999");
        Cliente cliente2 = new Cliente("2", "Pepe", "pepe@hotmail.com", "0988888888");
        Cliente cliente3 = new Cliente("3", "Juan", "juan@outlook.com", "0977777777");

        //Creacion Vuelo
        Aerolinea avianca = new Avianca();
        Vuelo vuelo1 = new Vuelo("V-001", "GYE", "UIO", avianca, LocalDateTime.of(2025, 8, 25, 14, 30)); // 25 de agosto de 2025 a las 14:30
    
        //Creacion Vehiculos
        ProveedorVehiculo rentACar = new RentACar();
        Vehiculo vehiculo1 = new Vehiculo(TipoVehiculo.SUV, "ABC-123", 5, "GYE", EstadoVehiculo.DISPONIBLE, rentACar, 40.0);

        //Creacion Asientos
        vuelo1.setearAsientos(10); // Agregar 10 asientos al vuelo automaticamente
        //System.out.println(vuelo1);


        //Creacion Builder reservas
        TravelEaseReserva builder = new TravelEaseReserva();

        //Creacion Reserva CLiente 1
        cliente1.realizarReserva();
        builder.reset();
        builder.buildDatos("Reserva 001", cliente1);
        builder.buildVuelo(vuelo1);
        builder.buildBoleto(new Boleto("B-001", vuelo1.getAsientos().get(0), vuelo1, cliente1, 150.0));
        builder.buildBoleto(new Boleto("B-002", vuelo1.getAsientos().get(1), vuelo1, cliente2, 160.0));
        builder.buildPrecio();

        Reserva reserva1 = builder.getReserva();
        //System.out.println("Reserva Cliente 1: \n" + reserva1);

        //Creacion Reserva Cliente 2
        cliente2.realizarReserva();
        builder.reset();
        builder.buildDatos("Reserva 002", cliente2);
        builder.buildVuelo(vuelo1);
        builder.buildBoleto(new Boleto("B-003", vuelo1.getAsientos().get(2), vuelo1, cliente2, 150.0));
        builder.buildAlquilerVehiculo(vehiculo1);
        builder.buildPrecio();
        Reserva reserva2 = builder.getReserva();
        //System.out.println("Reserva Cliente 2: \n" + reserva2.getPrecio());

        //Creacion Agentes de soporte
        AgenteSoporte agente1 = new AgenteSoporte("Agente 007", "Eddy", "skibidiEddy@gmail.com" , "0431212");
        AtencionAerolinea agenteAvianca = new AtencionAerolinea(avianca);
        AtencionProveedorVehiculo agenteRentACar = new AtencionProveedorVehiculo(rentACar);

        agente1.setNextOperador(agenteAvianca);

        //Simulacion reporte de incidencia cliente 1
        ReporteIncidencia reporte1 = new ReporteIncidencia("Reporte 001", "El vuelo se retraso 5 horas", cliente1);
        agente1.manejarConsulta(reporte1);

        
    }
}