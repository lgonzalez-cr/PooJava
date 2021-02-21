package semana_4_2;

public class Vegetal {
    private String nombre;
    private String tipo;
    private String color;

    public Vegetal(String nombre, String tipo, String color) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.color = color;
    }

    public void realizarFotosintesis(){
        System.out.println("Fotosíntesis realizada con éxito");
    }

    public void madurar(){
        System.out.println("Maduración completada");
    }

    public void podrirse(){
        System.out.println("Ya me podrí");
    }

    @Override
    public String toString() {
        return "Vegetal{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
