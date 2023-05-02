package UF2.notas;

import UF2.CalculNota.CalculNota;
import UF2.PrediccioPersones.PrediccioPersones;

import java.util.Scanner;

public class notas {
    double nota = 0;
    String palabra = "";

    public static void main (String[] args) {
        notas programa = new notas();
        programa.inici();
    }

    private void inici() {
        mostrarMenu();
        leerDatos();
        notsss();
        imprimir();
    }

    private void mostrarMenu() {
        System.out.println("Ingresa tu nota con un número:");
    }

    private void leerDatos() {
        Scanner s = new Scanner(System.in);
        nota = s.nextDouble();
    }

    private void notsss() {
        if(nota >  0 && nota < 4.9 ){
            palabra = "SUSPENSO";
        }
        else if(nota > 5 && nota < 6.49 ){
            palabra = "APROBADO";
        }
        else if(nota > 6.5 && nota < 8.9 ){
            palabra = "NOTABLE";
        }
        else if(nota > 9 && nota < 10 ){
            palabra = "EXCELENTE";
        }
        else{
            palabra = "NO SIRVE";
        }

    }

    private void imprimir() {
        System.out.println("Tu nota és: " + palabra );
    }
}
