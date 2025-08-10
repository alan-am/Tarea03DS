package com.example;

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
