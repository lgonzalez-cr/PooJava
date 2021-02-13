package semana_3_2.singlentonPackage;

public class Singleton {
    private static Singleton single_instance = null;
    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (single_instance == null) {
            single_instance = new Singleton(value);
        }
        return single_instance;
    }


}
