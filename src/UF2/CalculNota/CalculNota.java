package UF2.CalculNota;

import java.util.Scanner;

public class CalculNota {
    private double min = 0;
    private double max = 0;
    private double mitj = 0;

    public static void main(String args[]) {
        CalculNota programa = new CalculNota();
        programa.inici();
    }

    public void inici() {
        mostrarMenu();
        llegirDades();
        calculaMax();
        calculaMin();
        calculaMitj();
        imprimir();
    }

    private void imprimir() {
        System.out.println("La nota más pequeña és: " + min + '\n' + "La nota más gande: " + max + '\n' + "Y la media és: " + mitj);
    }

    public void mostrarMenu() {
        System.out.println("Indica 5 notas de 0 al 10");
    }

    public void llegirDades() {
        Scanner s = new Scanner(System.in);
        double nota = s.nextDouble();
    }

    public static double calculaMax() {
        double[] nums = new double[5];
        double max = nums[5];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
        }
        return max;
    }

    public static double calculaMin() {
        double[] nums = new double[5];
        double min = nums[5];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) min = nums[i];
        }
        return min;
    }

    public static double calculaMitj() {
        double sum = 0;
        double[] nums = new double[5];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum / nums.length;

    }
}
