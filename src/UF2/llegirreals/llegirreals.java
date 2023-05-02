package UF2.llegirreals;

import java.util.Scanner;
public class llegirreals {
    public static void main (String[] args) {
        llegirreals programa = new llegirreals();
        programa.inici();
    }
    public void inici() {
        System.out.println("Llegiu un real pel teclat:");
        Double a = llegirEnterTeclat();
        System.out.println("El real ha estat " + a + ".");
        System.out.println("Llegiu un altre real pel teclat:");
        a = llegirEnterTeclat();
        System.out.println("L’altre real ha estat " + a + ".");
    }
    public double llegirEnterTeclat() {
        Scanner lector = new Scanner(System.in);
        double enterLlegit = 0;
        boolean llegit = false;
        while (!llegit) {
            llegit = lector.hasNextDouble();
            if (llegit) {
                enterLlegit = lector.nextDouble();
            }
            else {
                System.out.println("Això no és un real.");
                lector.nextDouble();
            }
        }

        return enterLlegit;
    }
}

