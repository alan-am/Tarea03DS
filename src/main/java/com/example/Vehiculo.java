package com.example;

public class Vehiculo {
    private TipoVehiculo tipo;
    private String placa;
    private Integer maxPasajeros;
    private String ubiActual;
    private EstadoVehiculo estado;
    private ProveedorVehiculo proveedor;

    public Vehiculo(TipoVehiculo tipo, String placa, Integer maxPasajeros, String ubiActual, EstadoVehiculo estado, ProveedorVehiculo proveedor) {
        this.tipo = tipo;
        this.placa = placa;
        this.maxPasajeros = maxPasajeros;
        this.ubiActual = ubiActual;
        this.estado = estado;
        this.proveedor = proveedor;
    }

    public void asignar(){

    }

    public void verificarDisponibilidad(){
        // Lógica para verificar disponibilidad
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getMaxPasajeros() {
        return maxPasajeros;
    }

    public void setMaxPasajeros(Integer maxPasajeros) {
        this.maxPasajeros = maxPasajeros;
    }

    public String getUbiActual() {
        return ubiActual;
    }

    public void setUbiActual(String ubiActual) {
        this.ubiActual = ubiActual;
    }

    public EstadoVehiculo getEstado() {
        return estado;
    }

    public void setEstado(EstadoVehiculo estado) {
        this.estado = estado;
    }

    public ProveedorVehiculo getProveedor() {
        return proveedor;
    }

    public void setProveedor(ProveedorVehiculo proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "tipo=" + tipo +
                ", placa='" + placa + '\'' +
                ", maxPasajeros=" + maxPasajeros +
                ", ubiActual='" + ubiActual + '\'' +
                ", estado=" + estado +
                ", proveedor=" + proveedor +
                '}';
    }
    
}
