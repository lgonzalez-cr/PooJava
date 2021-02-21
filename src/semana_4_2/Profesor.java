package semana_4_2;

public class Profesor extends Persona{
    private String correo;
    private int experiencia;
    private double salario;

    public Profesor(String nombre, int edad, String identificacion, String correo, int experiencia, double salario) {
        super();
        super.edad = edad;
        super.nombre = nombre;
        super.identificacion = identificacion;
        this.correo = correo;
        this.experiencia = experiencia;
        this.salario = salario;
    }

    public void planear() {
        System.out.println("Estoy planeando");
    }

    public void darClase() {
        System.out.println("Dando clase");
    }

    public void revisarTareaDos() {
        System.out.println("R");
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "correo='" + correo + '\'' +
                ", experiencia=" + experiencia +
                ", salario=" + salario +
                ", nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", edad=" + edad +
                '}';
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
