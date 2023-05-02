package UF4.figures.FIGURA;

public class cercle extends figura {
    private int radi;
    public int getRadi() {
        return radi;
    }

    public void setRadi(int radi) {
        this.radi = radi;
    }


    public cercle (int r){
        radi = r;
        setFigura("cercle");
    }
    public double calcularArea(){
        radi = radi /2;
        return radi;
    }
}
