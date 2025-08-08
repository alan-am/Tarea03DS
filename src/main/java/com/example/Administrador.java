package com.example;

public class Administrador extends Usuario implements Operador {
    private String idAdministrador;
    private String nombre;
    private String email;
    private String telefono;
    private Operador operador;

    public Administrador(String idAdministrador, String nombre, String email, String telefono, Operador operador) {
        super(idAdministrador, nombre, email, telefono);
        this.idAdministrador = idAdministrador;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.operador = operador;
    }

    public void gestionarPoliticas() {
        // Lógica para gestionar políticas
    }

    public void autorizarReembolsos() {
        // Lógica para autorizar reembolsos
    }

    public void gestionarItinerarios() {
        // Lógica para gestionar itinerarios
    }

    // Getters
    public String getIdAdministrador() {
        return idAdministrador;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getTelefono() {
        return telefono;
    }

    public Operador getOperador() {
        return operador;
    }

    // Setters
    public void setIdAdministrador(String idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "idAdministrador='" + idAdministrador + '\'' +
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
