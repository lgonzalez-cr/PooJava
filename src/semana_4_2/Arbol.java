package semana_4_2;

public class Arbol extends Vegetal implements Actor{
    private int cantidadRamas;
    private int edad;
    private String nombreCientifico;

    public Arbol(String nombre, String tipo, String color, int cantidadRamas, int edad, String nombreCientifico) {
        super(nombre, tipo, color);
        this.cantidadRamas = cantidadRamas;
        this.edad = edad;
        this.nombreCientifico = nombreCientifico;
    }

    @Override
    public void actuar() {
        System.out.println("Como árbol, yo hago hago el papel");
    }

    @Override
    public void divertir() {
        System.out.println("Como árbol, yo me divierto");
    }

    @Override
    public void desaparecer() {
        System.out.println("Como árbol, yo desaparezco");
    }

    @Override
    public void realizarFotosintesis() {
        System.out.println("Como árbol, yo hago mi fotosíntesis");
    }

    @Override
    public void madurar() {
        super.madurar();
    }

    @Override
    public void podrirse() {
        super.podrirse();
    }

    public void podrirse(boolean hueleFeo) {
        System.out.println("Me podrí y " + ( hueleFeo == true ? " huelo feo. " : " no huelo feo."));
    }

    public void crecer() {
        System.out.println("Estoy creciendo");
    }

    public void darFruto() {
        System.out.println("Fruto generado");
    }

    @Override
    public String toString() {
        return "Arbol{" +
                "cantidadRamas=" + cantidadRamas +
                ", edad=" + edad +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }

    public int getCantidadRamas() {
        return cantidadRamas;
    }

    public void setCantidadRamas(int cantidadRamas) {
        this.cantidadRamas = cantidadRamas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }
}
