package semana_4_2;

public class Vehiculo implements Actor, ObjetoInerte{

    private String marca;
    private String modelo;
    private int anno;
    private String color;
    private double peso;
    private double precio;

    public Vehiculo(String marca, String modelo, int anno, String color, double peso, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anno = anno;
        this.color = color;
        this.peso = peso;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void actuar() {
        System.out.println("Actuando como vehículo!");
    }

    @Override
    public void divertir() {
        System.out.println("Diversión como vehículo!");
    }

    @Override
    public void desaparecer() {
        System.out.println("Auto guardado en garaje!");
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anno=" + anno +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                ", precio=" + precio +
                '}';
    }
}
