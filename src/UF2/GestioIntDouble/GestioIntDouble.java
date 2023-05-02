package UF2.GestioIntDouble;
import java.util.Scanner;


public class GestioIntDouble {
    public static void main(String[] args) {
        GestioIntDouble programa = new GestioIntDouble();

        programa.inici();
    }
    public void inici() {
        Doubleneta jfc = new Doubleneta();

        Scanner myObj = new Scanner(System.in);
        System.out.println("Quieres Int o Double?");
        String pr1 = myObj.nextLine();

        if(pr1.matches("Int") || pr1.matches("int")  ){
            int[] notes = new int[10];
            Intsito np = new Intsito();
            double max = np.calcularMaxim(notes);
            double min = np.calcularMinim(notes);
            double mitjana = np.calcularMitjana(notes);

            System.out.println("Introduce 10 numeros");
            int num = myObj.nextInt();
        }
    }

}
