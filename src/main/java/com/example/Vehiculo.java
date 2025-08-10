package com.example;

public class Vehiculo {
    private TipoVehiculo tipo;
    private String placa;
    private Integer maxPasajeros;
    private String ubiActual;
    private EstadoVehiculo estado;
    private ProveedorVehiculo proveedor;
    private double precioAlquiler;

    public Vehiculo(TipoVehiculo tipo, String placa, Integer maxPasajeros, String ubiActual, EstadoVehiculo estado, ProveedorVehiculo proveedor, double precioAlquiler) {
        this.tipo = tipo;
        this.placa = placa;
        this.maxPasajeros = maxPasajeros;
        this.ubiActual = ubiActual;
        this.estado = estado;
        this.proveedor = proveedor;
        this.precioAlquiler = precioAlquiler;
    }


    public boolean verificarDisponibilidad(){
        return this.estado == EstadoVehiculo.DISPONIBLE;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "tipo=" + tipo +
                ", placa='" + placa + '\'' +
                ", maxPasajeros=" + maxPasajeros +
                ", ubiActual='" + ubiActual + '\'' +
                ", estado=" + estado +
                ", proveedor=" + proveedor + '\'' +
                ", precioAlquiler=" + precioAlquiler +
                '}';
    }
    
    //getters and setters
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
    public double getPrecioAlquiler() {
        return precioAlquiler;
    }
    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }
    
}
