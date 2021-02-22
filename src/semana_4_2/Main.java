package semana_4_2;

import java.util.Date;

public class Main {
    public static void main(String args[]){
        Main main = new Main();
        main.procesarProfesor();
        main.procesarEstudiante();
        main.procesarCoche();
        main.procesarBicicleta();
        main.procesarArbol();
        main.procesarArbusto();

        main.mostrarPolimorfismo();
    }

    public void procesarProfesor(){
        System.out.println("=========================================Información del profesor==============================================================");
        Profesor profesor = new Profesor("Juan", 29, "405690587","juan.example@gmail.com",6, 1000000);
        System.out.println(profesor.toString());
        profesor.setSalario(1100000);
        profesor.planear();
        System.out.println("Información del profesor luego de actualizar su salario");
        System.out.println(profesor.toString());
        System.out.println("=========================================Fin información del profesor===========================================================\n");
    }

    public void procesarEstudiante(){
        System.out.println("=========================================Información del estudiante==============================================================");
        Estudiante estudiante = new Estudiante("Juan", 20, "205990577","A5219", "Contaduría", "10");
        System.out.println(estudiante.toString());
        estudiante.setTipoBeca("5");
        estudiante.pedirLibroEnBiblioteca();
        System.out.println("Información del estudiante luego de actualizar su beca");
        System.out.println(estudiante.toString());
        System.out.println("=========================================Fin información del estudiante===========================================================\n");
    }

    public void procesarCoche(){
        System.out.println("=========================================Información del coche==============================================================");
        Coche coche = new Coche("Audi", "A3-Sportback",2020, "Blanco", 1200, 45000000, 0, "1HGBWJDHJH34R8WIENF", 'N');
        System.out.println(coche.toString());
        coche.setKilometraje(coche.getKilometraje() + 1);
        coche.encenderRadio();
        System.out.println("Información del coche luego de actualizar su kilometraje");
        System.out.println(coche.toString());
        System.out.println("=========================================Fin información del coche===========================================================\n");
    }

    public void procesarBicicleta(){
        System.out.println("=========================================Información del bicicleta==============================================================");
        Bicicleta bicicleta = new Bicicleta("Giant", "Montañera", 2021, "Gris",10, 2135000, 1, 1, 29);
        System.out.println(bicicleta.toString());
        bicicleta.setPlatoTraseroActual(2);
        bicicleta.frenar();
        System.out.println("Información de la bicicleta luego de actualizar su plato trasero");
        System.out.println(bicicleta.toString());
        System.out.println("=========================================Fin información de la bicicleta===========================================================\n");
    }

    public void procesarArbol(){
        System.out.println("=========================================Información del arbol==============================================================");
        Arbol arbol = new Arbol("Pino", "Planta", "Verde oscuro", 100, 5, "Pinus");
        System.out.println(arbol.toString());
        arbol.setEdad(arbol.getEdad() + 1);
        System.out.println("Información del arbol luego de actualizar su edad");
        System.out.println(arbol.toString());
        arbol.actuar();
        arbol.divertir();
        arbol.desaparecer();
        arbol.realizarFotosintesis();
        arbol.madurar();
        arbol.podrirse();
        arbol.podrirse(true);
        arbol.crecer();
        arbol.darFruto();
        System.out.println("=========================================Fin información del arbol===========================================================\n");
    }

    public void procesarArbusto(){
        System.out.println("=========================================Información del arbusto==============================================================");
        Arbusto arbusto = new Arbusto("Arándano azul", "Planta", "Verde tierno", 100, "Frío",false);
        System.out.println(arbusto.toString());
        arbusto.setAlturaEnCm(arbusto.getAlturaEnCm() + 1);
        System.out.println("Información del arbusto luego de actualizar su altura");
        System.out.println(arbusto.toString());
        arbusto.actuar();
        arbusto.divertir();
        arbusto.desaparecer();
        arbusto.realizarFotosintesis();
        arbusto.madurar();
        arbusto.podrirse();
        arbusto.generarAroma();
        arbusto.secarse();
        arbusto.generarSemillas();

        System.out.println("=========================================Fin información del coche===========================================================\n");
    }

    public void mostrarPolimorfismo(){
        System.out.println("=========================================Demostración de polimofismo==============================================================");
        System.out.println("=================================Ejemplo persona=========================================");
        Persona persona = new Estudiante("Juana", 19, "205990547","B5219", "Dirección de empresas", "7");
        persona.actuar();
        persona.divertir();
        persona.desaparecer();
        persona.saludar();
        persona.comer();
        persona.desaparecer();
        System.out.println(persona.toString());
        System.out.println("=================================Fin persona===========================================\n");

        System.out.println("=================================Ejemplo vegetal=========================================");
        Vegetal vegetal = new Arbusto("Arándano rojo", "Planta", "Verde tierno", 90, "Frío",false);
        vegetal.realizarFotosintesis();
        vegetal.madurar();
        vegetal.podrirse();
        System.out.println(vegetal.toString());
        System.out.println("=================================Fin vegetal=============================================");
        System.out.println("=========================================Fin demostración de polimofismo===========================================================");
    }
}














