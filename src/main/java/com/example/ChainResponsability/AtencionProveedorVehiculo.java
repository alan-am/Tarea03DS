package com.example.ChainResponsability;

import com.example.ProveedorVehiculo;
import com.example.ReporteIncidencia;

public class AtencionProveedorVehiculo implements Operador {

    private Operador operador;
    private ProveedorVehiculo proveedorVehiculo;

    public AtencionProveedorVehiculo(ProveedorVehiculo proveedorVehiculo) {
        this.operador = null;
        this.proveedorVehiculo = proveedorVehiculo;
    }
    
    @Override
    public String toString() {
        return "AtencionProveedorVehiculo{" +
                "operador=" + operador +
                ", proveedorVehiculo=" + proveedorVehiculo +
                '}';
    }

    @Override
    public void setNextOperador(Operador operador) {
        this.operador = operador;
    }
    

    @Override
    public void manejarConsulta(ReporteIncidencia reporte) {
        System.out.println("- Consulta gestionada por un operador de la rentadora: " + this.proveedorVehiculo + " para el reporte: " + reporte.getId());
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }


}
