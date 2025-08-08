package com.example.Builder;

import com.example.Vehiculo;

public class TravelEaseReserva implements ReservaBuilder {

    private Reserva reserva;    

    public Reserva getReserva(){
        return reserva;
    }

    @Override
    public void reset() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reset'");
    }

    @Override
    public void buildVuelo(Vuelo vuelo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buildVuelo'");
    }

    @Override
    public void buildAlquilerVehiculo(Vehiculo vehiculo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buildAlquilerVehiculo'");
    }
}
