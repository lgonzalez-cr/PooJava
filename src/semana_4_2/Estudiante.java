package semana_4_2;

public class Estudiante extends Persona{
    private String numeroCarnet;
    private String carrera;
    private String tipoBeca;

    public Estudiante(String nombre, int edad, String identificacion, String numeroCarnet, String carrera, String tipoBeca) {
        super();
        super.edad = edad;
        super.nombre = nombre;
        super.identificacion = identificacion;
        this.numeroCarnet = numeroCarnet;
        this.carrera = carrera;
        this.tipoBeca = tipoBeca;
    }

    public void realizarMatricula(){
        System.out.println("Matrícula realizada");
    }

    public void congelarCurso(){
        System.out.println("Curso congelado!");
    }

    public void pedirLibroEnBiblioteca(){
        System.out.println("Libro solicitado!");
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "numeroCarnet='" + numeroCarnet + '\'' +
                ", carrera='" + carrera + '\'' +
                ", tipoBeca='" + tipoBeca + '\'' +
                ", nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", edad=" + edad +
                '}';
    }

    public String getNumeroCarnet() {
        return numeroCarnet;
    }

    public void setNumeroCarnet(String numeroCarnet) {
        this.numeroCarnet = numeroCarnet;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getTipoBeca() {
        return tipoBeca;
    }

    public void setTipoBeca(String tipoBeca) {
        this.tipoBeca = tipoBeca;
    }
}
