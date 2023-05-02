package UF4.figures.FIGURA;

public class trapezi extends figura{
    private int a;
    private int b;
    private int h;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public trapezi(int a, int b, int h){
        this.a = a;
        this.b = b;
        this.h = h;
        setFigura("trapezi");
    }
    public double calcularArea(){
        h= h*((a+b)/2);
        return h;
    }

}
