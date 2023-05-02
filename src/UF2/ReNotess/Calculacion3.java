package UF2.ReNotess;

public class Calculacion3 {
    public double calcularMitjana(double[] array) {
        double suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }
        return suma/array.length;
    }
}
