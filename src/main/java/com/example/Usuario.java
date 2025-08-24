package com.example;

public class Usuario {
    private String id;
    private Contacto contacto;

    public Usuario(String id, String nombre, String email, String telefono) {
        this.id = id;
        this.contacto = new Contacto(nombre, email, telefono);
    }

    public void iniciarSesion() {
        System.out.println("Usuario " + contacto.getNombre() + " ha iniciado sesión.");
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", contacto=" + contacto +
                '}';
    }

    // Getters
    public String getId() {
        return id;
    }

    public Contacto getContacto() {
        return contacto;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
}
    


