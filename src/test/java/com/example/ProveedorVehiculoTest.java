package com.example;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.example.Enums.EstadoVehiculo;
import com.example.Enums.TipoVehiculo;

class FakeProveedor implements ProveedorVehiculo {
    boolean reservarLlamado = false;
    boolean confirmarLlamado = false;
    boolean cancelarLlamado = false;

    @Override
    public void reservarVehiculo(Vehiculo vehiculo) { reservarLlamado = true; }
    @Override
    public void confirmarVehiculo(String id) { confirmarLlamado = true; }
    @Override
    public void cancelarVehiculo(String id) { cancelarLlamado = true; }
}

public class ProveedorVehiculoTest {

    @Test
    void reservarVehiculo_deberiaInvocarMetodoDelProveedor() {
        FakeProveedor p = new FakeProveedor();
        Vehiculo v = new Vehiculo(TipoVehiculo.ECONOMICO, "XYZ-111", 4, "UIO",
                EstadoVehiculo.DISPONIBLE, p, 25.0);

        // Act
        p.reservarVehiculo(v);

        // Assert
        assertTrue(p.reservarLlamado, "reservarVehiculo del proveedor debe ser llamado");
    }

    @Test
    void confirmarVehiculo_deberiaInvocarMetodoDelProveedor() {
        FakeProveedor p = new FakeProveedor();
        p.confirmarVehiculo("XYZ-111");
        assertTrue(p.confirmarLlamado, "confirmarVehiculo del proveedor debe ser llamado");
    }

    @Test
    void cancelarVehiculo_deberiaInvocarMetodoDelProveedor() {
        FakeProveedor p = new FakeProveedor();
        p.cancelarVehiculo("XYZ-111");
        assertTrue(p.cancelarLlamado, "cancelarVehiculo del proveedor debe ser llamado");
    }
}
