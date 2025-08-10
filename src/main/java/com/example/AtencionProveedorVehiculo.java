package com.example;

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
        if (this.operador != null) {
            this.operador.manejarConsulta(reporte);
        } else {
            System.out.println("No hay un operador disponible para manejar la consulta: " + reporte);
        }
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }


}
