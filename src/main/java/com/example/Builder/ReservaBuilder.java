package com.example.Builder;

import com.example.Vehiculo;

public interface ReservaBuilder {
    public void reset();

    public void buildVuelo(Vuelo vuelo);

    public void buildAlquilerVehiculo(Vehiculo vehiculo);

}
