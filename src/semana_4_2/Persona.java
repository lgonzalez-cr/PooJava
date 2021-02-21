package semana_4_2;

public abstract class Persona implements Actor{
    public String nombre;
    public String identificacion;
    public int edad;

    @Override
    public void actuar() {
        System.out.println("Estoy Actuando desde persona!");
    }

    @Override
    public void divertir() {
        System.out.println("Diversión a otro nivel!");
    }

    @Override
    public void desaparecer() {
        System.out.println("Adiós!");
    }

    public void saludar() {
        System.out.println("Hola mi nombre es " + nombre + " y tengo " + edad + " años.");
    }

    public void despedirse() {
        System.out.println("Chao pescado.");
    }

    public void comer() {
        System.out.println("Estoy comiendo.");
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", edad=" + edad +
                '}';
    }
}
