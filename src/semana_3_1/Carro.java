package semana_3_1;

import java.util.Date;

public class Carro extends MedioTransporte{
    private int kilometraje;
    private boolean tieneRTV;

    public Carro(String color, Date fechaCreacion, int cantidadPasajeros, int cantidadRuedas, double peso, String marca, String modelo, double precio, int kilometraje, boolean tieneRTV) {
        super(color, fechaCreacion, cantidadPasajeros, cantidadRuedas, peso, marca, modelo, precio);
        this.kilometraje = kilometraje;
        this.tieneRTV = tieneRTV;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public boolean isTieneRTV() {
        return tieneRTV;
    }

    public void setTieneRTV(boolean tieneRTV) {
        this.tieneRTV = tieneRTV;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "kilometraje=" + kilometraje +
                ", tieneRTV=" + tieneRTV +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Carro Finalizado");
    }

    public void encenderRadio(){}

    public void acelerar(){}
}
