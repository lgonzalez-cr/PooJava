package semana_4_2;

import java.util.Date;

public class Coche extends Vehiculo{
    private double kilometraje;
    private String identificadorVim;
    private char marchaActual;

    public Coche(String marca, String modelo, Date anno, String color, double peso, double precio, double kilometraje, String identificadorVim, char marchaActual) {
        super(marca, modelo, anno, color, peso, precio);
        this.kilometraje = kilometraje;
        this.identificadorVim = identificadorVim;
        this.marchaActual = marchaActual;
    }

    public void encenderEscobillas(){
        System.out.println("Escobillas en función!");
    }

    public void cambiarMarcha(){
        System.out.println("Marcha cambiada!");
    }

    public void encenderRadio(){
        System.out.println("Radio endendido!");
    }

    @Override
    public String toString() {
        return "Coche{" +
                "kilometraje=" + kilometraje +
                ", identificadorVim='" + identificadorVim + '\'' +
                ", marchaActual=" + marchaActual +
                '}';
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getIdentificadorVim() {
        return identificadorVim;
    }

    public void setIdentificadorVim(String identificadorVim) {
        this.identificadorVim = identificadorVim;
    }

    public char getMarchaActual() {
        return marchaActual;
    }

    public void setMarchaActual(char marchaActual) {
        this.marchaActual = marchaActual;
    }
}
