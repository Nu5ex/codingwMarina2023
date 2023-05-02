package UF2.Examen_V2;

public class CalculArrays {

    //Param. entr:
    //Param. sort:
    public static double calcularMaxim(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    //Param. entr:
    //Param. sort:
    public static double calcularMinim(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    //Param. entr:
    //Param. sort:
    public static double calcularMitjana(double[] array) {
        double suma = 0;
        double mida = array.length; //corregido
        for (int i = 0; i < mida; i++) {
            suma = suma + array[i];
        }
        return suma/mida;
    }
}