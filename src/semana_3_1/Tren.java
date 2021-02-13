package semana_3_1;

import java.util.Date;

public class Tren extends MedioTransporte{

    private String origen;
    private  String destino;
    private String tipoTren;

    public Tren(String color, Date fechaCreacion, int cantidadPasajeros, int cantidadRuedas, double peso, String marca, String modelo, double precio, String origen, String destino, String tipoTren) {
        super(color, fechaCreacion, cantidadPasajeros, cantidadRuedas, peso, marca, modelo, precio);
        this.origen = origen;
        this.destino = destino;
        this.tipoTren = tipoTren;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getTipoTren() {
        return tipoTren;
    }

    public void setTipoTren(String tipoTren) {
        this.tipoTren = tipoTren;
    }

    @Override
    public String toString() {
        return "Tren{" +
                "origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", tipoTren='" + tipoTren + '\'' +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Tren Finalizado");
    }

    public void accionarSilbato(){}

    public void abrirPuertas(){}
}
