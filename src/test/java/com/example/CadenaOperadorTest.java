package com.example;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.example.ChainResponsability.AtencionAerolinea;
import com.example.ChainResponsability.AtencionProveedorVehiculo;
import com.example.ChainResponsability.Operador;

class TerminalOperador implements Operador {
    boolean recibido = false;
    @Override public void setNextOperador(Operador op) {}
    @Override public void manejarConsulta(ReporteIncidencia reporte) { recibido = true; }
}

public class CadenaOperadorTest {

    @Test
    void manejarConsulta_deberiaPropagarseATravesDeLaCadena() {
        // Arrange
        TerminalOperador terminal = new TerminalOperador();
        AtencionProveedorVehiculo atProv = new AtencionProveedorVehiculo(null);
        AtencionAerolinea atAero = new AtencionAerolinea(null);
        AdministradorAdapter admin = new AdministradorAdapter();

        // Cadena: Proveedor -> Aerolínea -> Admin -> Terminal
        atProv.setNextOperador(atAero);
        atAero.setNextOperador(admin);
        admin.setNextOperador(terminal);

        // Reporte dummy
        Cliente c = new Cliente("C-1", "Ana", "a@a.com", "0999");
        ReporteIncidencia r = c.colocarReporte("R-1", "Demora en atención");

        // Act
        atProv.manejarConsulta(r);

        // Assert
        assertTrue(terminal.recibido, "El reporte debe llegar al manejador terminal");
    }

    // Adaptador simple para cumplir con el rol Operador
    static class AdministradorAdapter implements Operador {
        private Operador next;
        @Override public void setNextOperador(Operador operador) { this.next = operador; }
        @Override public void manejarConsulta(ReporteIncidencia reporte) {
            if (next != null) next.manejarConsulta(reporte);
        }
    }
}
