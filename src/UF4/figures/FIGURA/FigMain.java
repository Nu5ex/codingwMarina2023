package UF4.figures.FIGURA;

import UF4.figures.persona.Persona;

public class FigMain {
    public static void main(String[] args) {
        cercle ce = new cercle(40);
        ce.imprimirDdes();
        cuadrado cu = new cuadrado(10);
        cu.imprimirDdes();
        paralelogram p = new paralelogram(20,30);
        p.imprimirDdes();
        rectangulo re = new rectangulo();
        re.setCostat1(50);
        re.setCostat2(20);
        re.imprimirDdes();
        rombe ro = new rombe(40,40);
        ro.imprimirDdes();
        trapezi tra = new trapezi(20,30,40);
        tra.imprimirDdes();
        triangulo tri = new triangulo(90,90);
        tri.imprimirDdes();
    }
}
