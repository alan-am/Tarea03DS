package com.example.ChainResponsability;

import com.example.ReporteIncidencia;
import com.example.Usuario;

public class AgenteSoporte extends Usuario implements Operador {
    private String idAgente;
    private String nombre;
    private String email;
    private String telefono;
    private Operador operador;

    public AgenteSoporte(String idAgente, String nombre, String email, String telefono) {
        super(idAgente, nombre, email, telefono);
        this.idAgente = idAgente;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public String getIdAgente() {
        return idAgente;
    }

    public void setIdAgente(String idAgente) {
        this.idAgente = idAgente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Operador getOperador() {
        return operador;
    }

    @Override
    public String toString() {
        return "AgenteSoporte{" +
                "idAgente='" + idAgente + '\'' +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", operador=" + operador +
                '}';
    }

    @Override
    public void setNextOperador(Operador operador) {
        this.operador = operador;
    }

    @Override
    public void manejarConsulta(ReporteIncidencia reporte) {
        if(!gestionarConsulta(false) && operador != null){
            operador.manejarConsulta(reporte);
        }
    }

    public boolean gestionarConsulta(boolean puedeGestionar) {
        if (puedeGestionar) {
            System.out.println("- Agente de soporte " + nombre + " está gestionando la consulta.");
            return true;
        } else if (operador != null && !puedeGestionar) {
            System.out.println("- Agente de soporte " + nombre + " no puede gestionar la consulta. Pasando al siguiente operador.");
            return false;
        }
        return false;
    }
}
