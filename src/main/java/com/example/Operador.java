package com.example;

public interface Operador {

    public void setNextOperador(Operador operador);

    public void manejarConsulta(ReporteIncidencia reporte);
    
}
