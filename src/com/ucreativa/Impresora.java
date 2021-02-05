package com.ucreativa;


/**
 * @author PC
 */
public class Impresora extends Articulo {

    private String tipoImpresora;
    private String MetodoImpresion;
    private String resolucion;
    private String VelocidadImpresion;
    private String papelSoportado;

    /**
     *
     */
    public Impresora() {
        // TODO Auto-generated constructor stub
    }

    public Impresora(String codigo, String marca, String modelo, int garantiaEnMeses, double precio, String tipoImpresora,
                     String metodoImpresion, String resolucion, String velocidadImpresion, String papelSoportado) {
        super(codigo, marca, modelo, garantiaEnMeses, precio);
        this.tipoImpresora = tipoImpresora;
        MetodoImpresion = metodoImpresion;
        this.resolucion = resolucion;
        VelocidadImpresion = velocidadImpresion;
        this.papelSoportado = papelSoportado;
    }

    public String getTipoImpresora() {
        return tipoImpresora;
    }

    public void setTipoImpresora(String tipoImpresora) {
        this.tipoImpresora = tipoImpresora;
    }

    public String getMetodoImpresion() {
        return MetodoImpresion;
    }

    public void setMetodoImpresion(String metodoImpresion) {
        MetodoImpresion = metodoImpresion;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getVelocidadImpresion() {
        return VelocidadImpresion;
    }

    public void setVelocidadImpresion(String velocidadImpresion) {
        VelocidadImpresion = velocidadImpresion;
    }

    public String getPapelSoportado() {
        return papelSoportado;
    }

    public void setPapelSoportado(String papelSoportado) {
        this.papelSoportado = papelSoportado;
    }

    @Override
    public String toString() {
        return "**********INFORMACIÓN DE LA IMPRESORA**********\n" +
                "Marca: " + this.getMarca() + "\n" +
                "Modelo: " + this.getModelo() + "\n" +
                "Garantía: " + this.getGarantiaEnMeses() + " meses\n" +
                "Precio: " + this.getPrecio() + "\n" +

                "Tipo: " + this.getTipoImpresora() + "\n" +
                "Metodo Impresión: " + this.getMetodoImpresion() + "\n" +
                "Resolución: " + this.getResolucion() + "\n" +
                "Velocidad Impresión: " + this.getVelocidadImpresion() + "\n" +
                "Papel Soportado: " + this.getPapelSoportado() + "\n" +
                "**********FIN DE LA IMPRESIÓN**********\n";
    }

    public void imprimir() {
    }

    public void escanear() {
    }

    public void extraerTinta() {
    }
}