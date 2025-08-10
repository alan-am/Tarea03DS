package com.example.Builder;

import com.example.Boleto;
import com.example.Usuario;
import com.example.Vehiculo;
import com.example.Vuelo;

public interface ReservaBuilder {
    public void reset();
    public void buildVuelo(Vuelo vuelo);
    public void buildAlquilerVehiculo(Vehiculo vehiculo);
    public void buildBoleto(Boleto boleto);
    public void buildDatos(String id, Usuario reservador);
    public void buildPrecio();
}
