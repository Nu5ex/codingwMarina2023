package UF4.figures.FIGURA;

public class cuadrado extends figura{

    private int costat;
    public int getCostat() {
        return costat;
    }

    public void setCostat(int costat) {
        this.costat = costat;
    }

    public cuadrado(int r){
        costat=r;
        setFigura("cuadrado");
    }
    public double calcularArea(){
        costat = costat*4;
        return costat;
    }

}
