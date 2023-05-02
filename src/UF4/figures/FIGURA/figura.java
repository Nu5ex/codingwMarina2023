package UF4.figures.FIGURA;

public class figura {
    public String figura;
    public static int id;

    public figura(){
        id++;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void imprimirDdes(){
        calcularArea();
        System.out.println("ID DE LA FIGURA: "+ getId()+ ", ÉS: " + getFigura());
        System.out.println("AREA DE LA FIGURA: "+ getFigura()+ ", ÉS: " + calcularArea());
        System.out.println("------------------------------");
    }
    public double calcularArea(){
        return 0;
    }
}
