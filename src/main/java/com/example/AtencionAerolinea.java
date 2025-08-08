package com.example;

public class AtencionAerolinea implements Operador {

    private Operador operador;

    @Override
    public void setNextOperador(Operador operador) {
        this.operador = operador;
    }

    @Override
    public void manejarConsulta(ReporteIncidencia reporte) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'manejarConsulta'");
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }

    @Override
    public String toString() {
        return "AtencionAerolinea{" +
                "operador=" + operador +
                '}';
    }

}
