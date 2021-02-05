package com.ucreativa;


/**
 * @author PC
 */
public class Televisor extends Articulo {


    private int cantidadPulgadas;
    private String resolucion;
    private int cantidadPuertosHdmi;
    private int cantidadPuertosUsb;

    /**
     *
     */
    public Televisor() {
        // TODO Auto-generated constructor stub
    }

    public Televisor(String codigo, String marca, String modelo, int garantiaEnMeses, double precio, int cantidadPulgadas, String resolucion, int cantidadPuertosHdmi,
                     int cantidadPuertosUsb) {
        super(codigo, marca, modelo, garantiaEnMeses, precio);
        this.cantidadPulgadas = cantidadPulgadas;
        this.resolucion = resolucion;
        this.cantidadPuertosHdmi = cantidadPuertosHdmi;
        this.cantidadPuertosUsb = cantidadPuertosUsb;
    }

    public int getCantidadPulgadas() {
        return cantidadPulgadas;
    }

    public void setCantidadPulgadas(int cantidadPulgadas) {
        this.cantidadPulgadas = cantidadPulgadas;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public int getCantidadPuertosHdmi() {
        return cantidadPuertosHdmi;
    }

    public void setCantidadPuertosHdmi(int cantidadPuertosHdmi) {
        this.cantidadPuertosHdmi = cantidadPuertosHdmi;
    }

    public int getCantidadPuertosUsb() {
        return cantidadPuertosUsb;
    }

    public void setCantidadPuertosUsb(int cantidadPuertosUsb) {
        this.cantidadPuertosUsb = cantidadPuertosUsb;
    }

    @Override
    public String toString() {
        return "**********INFORMACIÓN DEL TELEVISOR**********\n" +
                "Marca: " + this.getMarca() + "\n" +
                "Modelo: " + this.getModelo() + "\n" +
                "Garantía: " + this.getGarantiaEnMeses() + "\n" + " meses" +
                "Precio: " + this.getPrecio() + "\n" +

                "Resolución: " + this.getResolucion() + "\n" +
                "Cantidad de pulgadas: " + this.getCantidadPulgadas() + "\n" +
                "Cantidad de puertos HDMI: " + this.getCantidadPuertosHdmi() + "\n" +
                "Cantidad de puertos USB: " + this.getCantidadPuertosUsb() + "\n" +
                "**********FIN DE LA IMPRESIÓN**********\n";
    }
    
    public void buscarCanales() {
    }

    public void encenderWifi() {
    }

    public void leerUsb() {
    }
}