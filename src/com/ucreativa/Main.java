package com.ucreativa;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Impresora impresora = new Impresora("1011040226", "Epson", "L6171", 12, 229900, "Multifuncional", "Inyección", "1200 x 2400 dpi", "33ppm", "Ejecutivo, Legal, A4, Papel fotográfico");
        System.out.println(impresora.toString());

        Lampara lampara = new Lampara("4410200090", "Concepts", "4425700321", 1, 19265, "De mesa", "Contemporáneo");
        System.out.println(lampara.toString());

        Lavadora lavadora = new Lavadora("6080200017", "Mabe", "LMD1800BO", 24,  209000.99, 39, "Semiautomática", "110v");
        System.out.println(lavadora.toString());

        Telefono telefono = new Telefono("5001110509", "Motorola", "ONE FUSION NEGRO E", 12, 129000, "720 x 1600, 269ppi", "6.5\"", "128 GB", "3G, Bluetooth, USB, Wi-Fi, 4G, LTE", "Android 10");
        System.out.println(telefono.toString());

        Televisor televisor = new Televisor("9008010027", "TCL", "55P7151", 12, 285340, 55, "3840x2160", 3, 2);
        System.out.println(televisor.toString());
    }
}
