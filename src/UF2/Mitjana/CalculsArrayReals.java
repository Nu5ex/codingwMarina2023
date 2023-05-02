package UF2.Mitjana;
import java.util.Scanner;

/**
 *
 */
public class CalculsArrayReals {

        static Scanner myObj = new Scanner(System.in);

        public static double[] leerArray ( double[] array){
            for (int i = 0; i < array.length; i++) {
                array[i] = myObj.nextDouble();
            }
            return array;
        }

        public static double calcularMitjana ( double[] media){
            double mit=0;
            for (int i=0; i < media.length; i++) {
                mit = mit + media[i];
            }
            return mit/media.length;
        }
}
