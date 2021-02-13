package semana_3_1;

import java.util.Date;

public class Avion extends MedioTransporte {

    public Avion(String color, Date fechaCreacion, int cantidadPasajeros, int cantidadRuedas, double peso, String marca, String modelo, double precio, int cantidadTurbinas, double alturaSobreElSuelo) {
        super(color, fechaCreacion, cantidadPasajeros, cantidadRuedas, peso, marca, modelo, precio);
        this.cantidadTurbinas = cantidadTurbinas;
        this.alturaSobreElSuelo = alturaSobreElSuelo;
    }

    private int cantidadTurbinas;
    private double alturaSobreElSuelo;

    public int getCantidadTurbinas() {
        return cantidadTurbinas;
    }

    public void setCantidadTurbinas(int cantidadTurbinas) {
        this.cantidadTurbinas = cantidadTurbinas;
    }

    public double getAlturaSobreElSuelo() {
        return alturaSobreElSuelo;
    }

    public void setAlturaSobreElSuelo(double alturaSobreElSuelo) {
        this.alturaSobreElSuelo = alturaSobreElSuelo;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "cantidadTurbinas=" + cantidadTurbinas +
                ", alturaSobreElSuelo=" + alturaSobreElSuelo +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Avión Finalizado");
    }

    public void despegar(){}

    public void aterrizar(){}
}
