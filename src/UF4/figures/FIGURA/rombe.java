package UF4.figures.FIGURA;

public class rombe extends figura{
    private int dm;
    private int dM;

    public int getDm() {
        return dm;
    }

    public void setDm(int dm) {
        this.dm = dm;
    }

    public int getdM() {
        return dM;
    }

    public void setdM(int dM) {
        this.dM = dM;
    }

    public rombe(int dm, int dM){
        this.dm = dm;
        this.dM = dM;
        setFigura("rombe");
    }
    public double calcularArea(){
        dm=(dm*dM)/2;
        return dm;

    }
}
