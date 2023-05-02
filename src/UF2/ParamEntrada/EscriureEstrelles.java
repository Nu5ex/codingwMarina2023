package UF2.ParamEntrada;

public class EscriureEstrelles {
    public static void main (String [] args){
        EscriureEstrelles programa = new EscriureEstrelles();
        programa.inici();
    }
    public void inici(){
        est(4);
        est(10);
        est(10);
        est(20);
        est(10);
        est(20);
        est(10);
        est(20);
        est(10);
        est(20);
    }
    public void est(int b){
        for (int x = 0; b>x;x++) {
            System.out.print("*");
        }
        System.out.println("");
    }

}

