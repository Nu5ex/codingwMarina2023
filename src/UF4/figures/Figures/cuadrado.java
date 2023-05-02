package UF4.figures.Figures;

public class cuadrado {
    public int lado;
    public String color;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public cuadrado(int l, String c) {
        l= lado;
        c= color;
    }
}
