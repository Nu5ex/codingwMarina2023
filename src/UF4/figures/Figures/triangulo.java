package UF4.figures.Figures;

public class triangulo {
    public int lado2;

    public int lado3;

    public int lado4;
    public String color;

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public int getLado4() {
        return lado4;
    }

    public void setLado4(int lado4) {
        this.lado4 = lado4;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public triangulo (int l2, int l3, int l4, String c) {
        l2=lado2;
        l3=lado3;
        l4=lado4;
        c=color;
    }
}
