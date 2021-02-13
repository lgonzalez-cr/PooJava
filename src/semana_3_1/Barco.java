package semana_3_1;

import java.util.Date;

public class Barco extends MedioTransporte {
    private String pocisionAncla;
    private int cantidadChimeneas;
    private int espacioAutos;

    public Barco(String color, Date fechaCreacion, int cantidadPasajeros, int cantidadRuedas, double peso, String marca, String modelo, double precio, String pocisionAncla, int cantidadChimeneas, int espacioAutos) {
        super(color, fechaCreacion, cantidadPasajeros, cantidadRuedas, peso, marca, modelo, precio);
        this.pocisionAncla = pocisionAncla;
        this.cantidadChimeneas = cantidadChimeneas;
        this.espacioAutos = espacioAutos;
    }

    public String getPocisionAncla() {
        return pocisionAncla;
    }

    public void setPocisionAncla(String pocisionAncla) {
        this.pocisionAncla = pocisionAncla;
    }

    public int getCantidadChimeneas() {
        return cantidadChimeneas;
    }

    public void setCantidadChimeneas(int cantidadChimeneas) {
        this.cantidadChimeneas = cantidadChimeneas;
    }

    public int getEspacioAutos() {
        return espacioAutos;
    }

    public void setEspacioAutos(int espacioAutos) {
        this.espacioAutos = espacioAutos;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "pocisionAncla='" + pocisionAncla + '\'' +
                ", cantidadChimeneas=" + cantidadChimeneas +
                ", espacioAutos=" + espacioAutos +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Barco Finalizado");
    }

    public void bajarAncla(){}

    public void subirAncla(){}
}
