package semana_4_2;

public interface Actor {
    public static String nombreArtistico = "Luis";
    public static int anniosExperiencia = 4;
    public static String tipo = "Principal";

    void actuar();

     void divertir();

     void desaparecer();

    static String identifador() {
        return "Yo soy un Actor";
    }
}
