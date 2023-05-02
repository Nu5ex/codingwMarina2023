package UF4.figures.societat;

import UF4.figures.persona.Persona;

public class MainSociedad {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setDni("888888R");
        p1.setNom("Dolores Deculo");
        p1.setEdat(200);
        p1.visualitzar();

        Persona p2 = new Persona("999999S", "Pablo", 69);
        p2.visualitzar();
        Persona p3 = new Persona("999999S", "Pablo");
        p3.visualitzar();
        Persona p4 = new Persona(69,"999999S");
        p4.visualitzar();
        Persona p5 = new Persona("Pablo", 69);
        p5.visualitzar();
        Persona p6 = new Persona(69);
        p6.visualitzar();
        Persona p7 = new Persona("999999S");
        p7.visualitzar();


    }
}
