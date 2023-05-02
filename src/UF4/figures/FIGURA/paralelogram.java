package UF4.figures.FIGURA;

public class paralelogram extends figura{
    private int b;
    private int h;


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

    public paralelogram(int b, int h){
        this.b = b;
        this.h = h;
        setFigura("paralelogram");
    }
    public double calcularArea(){
        b = b*h;
        return b;
    }

}
