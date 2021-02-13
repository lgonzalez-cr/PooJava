package semana_3_1;

import java.util.Date;

public class Bicicleta extends MedioTransporte {

    private int platoDelanteroActual;
    private int platoTraseroActual;

    public Bicicleta(String color, Date fechaCreacion, int cantidadPasajeros, int cantidadRuedas, double peso, String marca, String modelo, double precio, int platoDelanteroActual, int platoTraseroActual) {
        super(color, fechaCreacion, cantidadPasajeros, cantidadRuedas, peso, marca, modelo, precio);
        this.platoDelanteroActual = platoDelanteroActual;
        this.platoTraseroActual = platoTraseroActual;
    }

    public int getPlatoDelanteroActual() {
        return platoDelanteroActual;
    }

    public void setPlatoDelanteroActual(int platoDelanteroActual) {
        this.platoDelanteroActual = platoDelanteroActual;
    }

    public int getPlatoTraseroActual() {
        return platoTraseroActual;
    }

    public void setPlatoTraseroActual(int platoTraseroActual) {
        this.platoTraseroActual = platoTraseroActual;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "platoDelanteroActual=" + platoDelanteroActual +
                ", platoTraseroActual=" + platoTraseroActual +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Bicicleta Finalizada");
    }

    public void accionarFreno(){}

    public void moverCadenaEnPlatoDelantero(int numeroDePlato){}
}
