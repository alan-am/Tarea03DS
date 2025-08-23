package com.example.RentadoresVehiculos;

import com.example.ProveedorVehiculo;
import com.example.Vehiculo;

public class RentACar implements ProveedorVehiculo {

    @Override
    public void reservarVehiculo(Vehiculo vehiculo) {
        System.out.println("Vehículo reservado con RentACar: " + vehiculo);
    }

    @Override
    public void confirmarVehiculo(String reservaId) {
        System.out.println("Vehículo confirmado con RentACar. ID de reserva: " + reservaId);
    }

    @Override
    public void cancelarVehiculo(String reservaId) {
        System.out.println("Vehículo cancelado con RentACar. ID de reserva: " + reservaId);
    }

    @Override
    public String toString() {
        return "RentACar";
    }

}
