package com.ucreativa;


/**
 * @author PC
 */
public class Telefono extends Articulo {

    private String resolucionPantalla;
    private String tamanoPantalla;
    private String capacidadMemoriaInterna;
    private String conectividad;
    private String sistemaOperativo;

    /**
     *
     */
    public Telefono() {
        // TODO Auto-generated constructor stub
    }


    public Telefono(String codigo, String marca, String modelo, int garantiaEnMeses, double precio,
                    String resolucionPantalla, String tamanoPantalla, String capacidadMemoriaInterna,
                    String conectividad, String sistemaOperativo) {
        super(codigo, marca, modelo, garantiaEnMeses, precio);
        this.resolucionPantalla = resolucionPantalla;
        this.tamanoPantalla = tamanoPantalla;
        this.capacidadMemoriaInterna = capacidadMemoriaInterna;
        this.conectividad = conectividad;
        this.sistemaOperativo = sistemaOperativo;
    }


    public String getResolucionPantalla() {
        return resolucionPantalla;
    }


    public void setResolucionPantalla(String resolucionPantalla) {
        this.resolucionPantalla = resolucionPantalla;
    }


    public String getTamanoPantalla() {
        return tamanoPantalla;
    }


    public void setTamanoPantalla(String tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }


    public String getCapacidadMemoriaInterna() {
        return capacidadMemoriaInterna;
    }


    public void setCapacidadMemoriaInterna(String capacidadMemoriaInterna) {
        this.capacidadMemoriaInterna = capacidadMemoriaInterna;
    }


    public String getConectividad() {
        return conectividad;
    }


    public void setConectividad(String conectividad) {
        this.conectividad = conectividad;
    }


    public String getSistemaOperativo() {
        return sistemaOperativo;
    }


    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public String toString() {
        return "**********INFORMACIÓN DEL TELEFONO**********\n" +
                "Marca: " + this.getMarca() + "\n" +
                "Modelo: " + this.getModelo() + "\n" +
                "Garantía: " + this.getGarantiaEnMeses() + " meses\n" +
                "Precio: " + this.getPrecio() + "\n" +

                "Resolución: " + this.getResolucionPantalla() + "\n" +
                "Cantidad de pulgadas: " + this.getTamanoPantalla() + "\n" +
                "Memoria interna: " + this.getCapacidadMemoriaInterna() + "\n" +
                "Connectividad: " + this.getConectividad() + "\n" +
                "Sistema operativo: " + this.getSistemaOperativo() + "\n" +
                "**********FIN DE LA IMPRESIÓN**********\n";
    }

    public void guardarNumero() {
    }

    public void colgar() {
    }

    public void llamar() {
    }
}
