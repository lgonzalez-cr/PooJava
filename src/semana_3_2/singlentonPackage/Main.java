package semana_3_2.singlentonPackage;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Value 1");
        Singleton anotherSingleton = Singleton.getInstance("Value 2");

        //Value 1 se imprime dos veces dado que no se realiza una segunda inicializacion
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
