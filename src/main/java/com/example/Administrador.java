package com.example;

import com.example.ChainResponsability.Operador;

public class Administrador extends Usuario implements Operador {
    private String credencialAdmin;
    private Operador operador;

    public Administrador(String idUsuario, String nombre, String email, String telefono, String credencialAdmin) {
        super(idUsuario, nombre, email, telefono);
        this.credencialAdmin = credencialAdmin;
    }
    

    @Override
    public String toString() {
        return "Administrador [credencialAdmin=" + credencialAdmin + ", operador=" + operador + "]";
    }


    public void gestionarPoliticas() {
        System.out.println("Gestionando políticas de la empresa. "+
                " Credencial: " + credencialAdmin);
    }

    public void autorizarReembolsos() {
        System.out.println("Autorizando reembolsos de reservas."+ 
                " Credencial: " + credencialAdmin);
    }

    public void gestionarItinerarios() {
        System.out.println("Gestionando itinerarios de reservas. "+
                " Credencial: " + credencialAdmin);
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
}
