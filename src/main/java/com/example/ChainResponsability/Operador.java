package com.example.ChainResponsability;

import com.example.ReporteIncidencia;

public interface Operador {

    public void setNextOperador(Operador operador);

    public void manejarConsulta(ReporteIncidencia reporte);
    
}
