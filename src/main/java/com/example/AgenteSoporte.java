package com.example;

public class AgenteSoporte extends Usuario implements Operador {
    private String idAgente;
    private String nombre;
    private String email;
    private String telefono;
    private Operador operador;

    public AgenteSoporte(String idAgente, String nombre, String email, String telefono, Operador operador) {
        super(idAgente, nombre, email, telefono);
        this.idAgente = idAgente;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.operador = operador;
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

    public void setOperador(Operador operador) {
        this.operador = operador;
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNextOperador'");
    }

    @Override
    public void manejarConsulta(ReporteIncidencia reporte) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'manejarConsulta'");
    }

}
