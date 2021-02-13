package semana_3_1;

import java.util.Date;

public class MainTransportes {
    public static void main(String args[]){
        Barco barco = new Barco("Azul", new Date(), 100, 0, 500, "No sé", "Tampoco sé", 10000, "arriba", 2, 50);
        barco = null;
        System.gc();

        Avion avion = new Avion("Rojo", new Date(), 60, 6, 200, "Marca 1", "Modelo 2", 100000, 2, 2000);
        avion = null;
        System.gc();

        Bicicleta bicicleta = new Bicicleta("Rojo", new Date(), 2, 2, 15, "Marca 3", "Modelo 3", 40000, 3, 2);
        bicicleta = null;
        System.gc();

        Carro carro = new Carro("Rojo", new Date(), 8, 4, 1500, "Marca 4", "Modelo 4", 10000000, 50000, true);
        carro = null;
        System.gc();

        Tren tren = new Tren("Rojo", new Date(), 8, 4, 1500, "Marca 4", "Modelo 4", 10000000, "San Jose", "Heredia", "Eléctrico");
        tren = null;
        System.gc();
    }

}
