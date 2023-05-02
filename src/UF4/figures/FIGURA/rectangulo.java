package UF4.figures.FIGURA;

public class rectangulo extends figura {
    private int costat1;
    private int costat2;

    public int getCostat1() {
        return costat1;
    }

    public void setCostat1(int costat1) {
        this.costat1 = costat1;
    }

    public int getCostat2() {
        return costat2;
    }

    public void setCostat2(int costat2) {
        this.costat2 = costat2;
    }

/*public rectangulo(){
        costat1 = c1;
        costat2 = c2;
        setFigura("rectangulo");
    }*/
    public rectangulo(){
        setFigura("rectangulo");
    }
    public double calcularArea(){
        costat1 = costat1 *costat2;
        return costat1;
    }
}
