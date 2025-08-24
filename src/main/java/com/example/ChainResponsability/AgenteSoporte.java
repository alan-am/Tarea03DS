package com.example.ChainResponsability;

import com.example.ReporteIncidencia;
import com.example.Usuario;

public class AgenteSoporte extends Usuario implements Operador {
    private Operador operador;

    public AgenteSoporte(String idAgente, String nombre, String email, String telefono) {
        super(idAgente, nombre, email, telefono);
    }

    public String getIdAgente() {
        return getId();
    }

    public void setIdAgente(String idAgente) {
        setId(idAgente);
    }

    public Operador getOperador() {
        return operador;
    }

    @Override
    public String toString() {
        return "AgenteSoporte{" +
                "idAgente='" + getId() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", telefono='" + getTelefono() + '\'' +
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
            System.out.println("- Agente de soporte " + getNombre() + " está gestionando la consulta.");
            return true;
        } else if (operador != null && !puedeGestionar) {
            System.out.println("- Agente de soporte " + getNombre() + " no puede gestionar la consulta. Pasando al siguiente operador.");
            return false;
        }
        return false;
    }
}
