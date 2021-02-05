package com.ucreativa;


public class Lampara extends Articulo {

    private String tipoLampara;
    private String estilo;

    public Lampara() {
        // TODO Auto-generated constructor stub
    }

    public Lampara(String codigo, String marca, String modelo, int garantiaEnMeses, double precio, String tipoLampara, String estilo) {
        super(codigo, marca, modelo, garantiaEnMeses, precio);
        this.tipoLampara = tipoLampara;
        this.estilo = estilo;
    }

    public String getTipoLampara() {
        return tipoLampara;
    }

    public void setTipoLampara(String tipoLampara) {
        this.tipoLampara = tipoLampara;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return "**********INFORMACIÓN DE LA LÁMPARA**********\n" +
                "Marca: " + this.getMarca() + "\n" +
                "Modelo: " + this.getModelo() + "\n" +
                "Garantía: " + this.getGarantiaEnMeses() + " meses\n" +
                "Precio: " + this.getPrecio() + "\n" +

                "Tipo: " + this.getTipoLampara() + "\n" +
                "Estilo: " + this.getEstilo() + "\n" +
                "**********FIN DE LA IMPRESIÓN**********\n";
    }

    public void encender() {
    }

    public void apagar() {
    }

    public void emitirSonido() {
    }
}