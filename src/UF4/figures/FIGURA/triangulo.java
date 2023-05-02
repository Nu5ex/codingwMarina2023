package UF4.figures.FIGURA;

public class triangulo extends figura{
    private int base;
    private int h;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public triangulo(int a, int b){
        base =b;
        h = a;
        setFigura("triangulo");
    }

    public double calcularArea(){
        h=base*h/2;
        return h;
    }
}
