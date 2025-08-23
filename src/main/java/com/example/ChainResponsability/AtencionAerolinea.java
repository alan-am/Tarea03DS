package com.example.ChainResponsability;

import com.example.Aerolinea;
import com.example.ReporteIncidencia;

public class AtencionAerolinea implements Operador {

    private Operador operador;
    private Aerolinea aerolinea;

    public AtencionAerolinea(Aerolinea aerolinea) {
        this.operador = null;
        this.aerolinea = aerolinea;
    }

    
    @Override
    public String toString() {
        return "AtencionAerolinea{" +
                "operador=" + operador +
                ", aerolinea=" + aerolinea +
                '}';
    }

    @Override
    public void setNextOperador(Operador operador) {
        this.operador = operador;
    }

    @Override
    public void manejarConsulta(ReporteIncidencia reporte) {
        System.out.println("- Consulta gestionada por un operador de la aerolinea: " + this.aerolinea + " para el reporte: " + reporte.getId());
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }

}
