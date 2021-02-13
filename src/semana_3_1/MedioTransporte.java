package semana_3_1;

import java.util.Date;

public abstract  class MedioTransporte {
    private String color;
    private Date fechaCreacion;
    private int cantidadPasajeros;
    private int cantidadRuedas;
    private double peso;
    private String marca;
    private String modelo;
    private double precio;


    public MedioTransporte(String color, Date fechaCreacion, int cantidadPasajeros, int cantidadRuedas, double peso, String marca, String modelo, double precio) {
        this.color = color;
        this.fechaCreacion = fechaCreacion;
        this.cantidadPasajeros = cantidadPasajeros;
        this.cantidadRuedas = cantidadRuedas;
        this.peso = peso;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCantidadRuedas() {
        return cantidadRuedas;
    }

    public void setCantidadRuedas(int cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public abstract String toString();

    protected abstract void finalize() throws Throwable;
}
