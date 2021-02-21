package semana_4_2;

import java.util.Date;

public class Bicicleta extends Vehiculo{

    private int platoDelanteroActual;
    private int platoTraseroActual;
    private int numeroDeBicicleta;

    public Bicicleta(String marca, String modelo, Date anno, String color, double peso, double precio, int platoDelanteroActual, int platoTraseroActual, int numeroDeBicicleta) {
        super(marca, modelo, anno, color, peso, precio);
        this.platoDelanteroActual = platoDelanteroActual;
        this.platoTraseroActual = platoTraseroActual;
        this.numeroDeBicicleta = numeroDeBicicleta;
    }

    public void frenar(){
        System.out.println("Freno accionado");
    }

    public void encenderLuz(){
        System.out.println("Luz encendida");
    }

    public void cambiarPlatoActual(int numeroPlato, String ubicacionPlato){
        System.out.println("Se cambió al plato " + numeroPlato + " en el piñón " + (ubicacionPlato == "adelante" ? " delantero." : "trasero"));
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "platoDelanteroActual=" + platoDelanteroActual +
                ", platoTraseroActual=" + platoTraseroActual +
                ", numeroDeBicicleta=" + numeroDeBicicleta +
                '}';
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

    public int getNumeroDeBicicleta() {
        return numeroDeBicicleta;
    }

    public void setNumeroDeBicicleta(int numeroDeBicicleta) {
        this.numeroDeBicicleta = numeroDeBicicleta;
    }
}
