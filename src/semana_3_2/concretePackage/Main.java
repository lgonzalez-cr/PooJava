package semana_3_2.concretePackage;

public class Main {
    public static void main(String args[]) {
        int passwordSize = 32;
        Randoms randoms = new Randoms();
        System.out.println("Random password: " + randoms.generateRandomPassword(passwordSize));
    }
}
