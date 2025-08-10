package com.example;

public class ReporteIncidencia {
    private String id;
    private String descripcion;
    private Cliente clienteReportador;
    
    public ReporteIncidencia(String id, String descripcion, Cliente clienteReportador) {
        this.id = id;
        this.descripcion = descripcion;
        this.clienteReportador = clienteReportador;
    }

    
    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cliente getClienteReportador() {
        return clienteReportador;
    }

    public void setClienteReportador(Cliente clienteReportador) {
        this.clienteReportador = clienteReportador;
    }

    
}
