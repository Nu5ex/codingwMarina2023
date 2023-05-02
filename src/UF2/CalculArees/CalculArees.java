package UF2.CalculArees;

import java.util.Scanner;
public class CalculArees {
    private String forma = "";
    private double ar = 0;

    public void triangle(double b, double h) {
        ar = (b * h) / 2;
    }

    public void quadrat(double r) {
        ar = Math.pow(r, 2);
    }

    public void rectangle(double a, double b) {
        ar = a * b;
    }

    public void trapezi(double a, double b, double h) {
        ar = ((a * b) * h) / 2;
    }

    public void rombe(double dM, double dm) {
        ar = (dM * dm) / 2;
    }

    public void paralelogram(double b, double h) {
        ar = b * h;
    }

    public void cercle(double r) {
        ar = Math.pow(r, 2) * Math.PI;
    }
    public static void main(String args[]) {
        CalculArees programa = new CalculArees();
        programa.inici();
    }

    public void inici() {
        Menu();
        figures();
        calcular();
        imprimir();
    }

    public void figures() {
        Scanner s = new Scanner(System.in);
        forma = s.nextLine();
    }

    public void Menu() {
        System.out.println("De quina figura vols calcular l'area?\n");
        System.out.println("Tens les següents opcions: triangle, quadrat, rectangle, trapezi, rombe, paralelogram o cercle.\n");
    }

    public void calcular() {

        if (forma.equals("triangle")) {
            double b = 23.0;
            double h = 8.0;
            triangle(b, h);
        }

        //cas en que la figura = "quadrat"
        else if (forma.equals("quadrat")) {
            double r = 37.0;
            quadrat(r);
        }

        //cas en que la figura = "rectangle"
        else if (forma.equals("rectangle")) {
            double a = 68.0;
            double b = 39.0;
            rectangle(a, b);
        }

        //cas en que la figura = "trapezi"
        else if (forma.equals("trapezi")) {
            double a = 35.0;
            double b = 16.0;
            double h = 5.0;
            trapezi(a, b, h);
        }

        //cas en que la figura = "rombe"
        else if (forma.equals("rombe")) {
            double dM = 75.0;
            double dm = 30.0;
            rombe(dM, dm);
        }

        //cas en que la figura = "paralelogram"
        else if (forma.equals("paralelogram")) {
            double b = 45.0;
            double h = 13.0;
            paralelogram(b, h);
        }

        //cas en que la figura = "cercle"
        else if (forma.equals("cercle")) {
            System.out.println("Quin es el radi del cercle?");
            double r = 5;
            //funció matemàtica que eleva a 2 el radi
            //Math.PI = nombre pi (3.14159....)
            cercle(r);
        }
    }

    public void imprimir() {
        System.out.println("L'area del " + forma + " es " + ar);
    }
}
