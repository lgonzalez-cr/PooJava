package com.ucreativa;


/**
 * @author PC
 */
public class Lavadora extends Articulo {
    private int cantidadLibras;
    private String tipoLavadora;
    private String voltaje;

    /**
     *
     */
    public Lavadora() {
        // TODO Auto-generated constructor stub
    }


    public Lavadora(String codigo, String marca, String modelo, int garantiaEnMeses, double precio, int cantidadLibras, String tipoLavadora, String voltaje) {
        super(codigo, marca, modelo, garantiaEnMeses, precio);
        this.cantidadLibras = cantidadLibras;
        this.tipoLavadora = tipoLavadora;
        this.voltaje = voltaje;
    }


    public int getCantidadLibras() {
        return cantidadLibras;
    }

    public void setCantidadLibras(int cantidadLibras) {
        this.cantidadLibras = cantidadLibras;
    }

    public String getTipoLavadora() {
        return tipoLavadora;
    }

    public void setTipoLavadora(String tipoLavadora) {
        this.tipoLavadora = tipoLavadora;
    }


    public String getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(String voltaje) {
        this.voltaje = voltaje;
    }

    @Override
    public String toString() {
        return "**********INFORMACIÓN DE LA LAVADORA**********\n" +
                "Marca: " + this.getMarca() + "\n" +
                "Modelo: " + this.getModelo() + "\n" +
                "Calidad de libras: " + this.getCantidadLibras() + "\n" +
                "Tipo de lavadora: " + this.getTipoLavadora() + "\n" +
                "Precio: " + this.getPrecio() + "\n" +
                "Garantía: " + this.getGarantiaEnMeses() + " meses\n" +
                "Voltaje: " + this.getVoltaje() + "\n" +
                "**********FIN DE LA IMPRESIÓN**********\n";
    }

    public void lavar() {
    }

    public void secar() {
    }

    public void drenarAgua() {
    }

}
