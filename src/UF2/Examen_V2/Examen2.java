package UF2.Examen_V2;

import UF2.Examen_V2.CalculArrays;
import UF2.Examen_V2.NotaAText;
import UF2.Examen_V2.CercaDicotomica;

import java.util.Scanner;

public class Examen2 {
    public int MARCA_NOTES = -1;
    public int NUM_NOTES = 0;
    public String MARCA_FI = "fi";
    private boolean fi = false;
    public double max = 0;
    public double min = 10;
    public double mitj = 0;


    private final CalculArrays calculador = new CalculArrays();
    private final CercaDicotomica cerca = new CercaDicotomica();
    private final NotaAText transformar = new NotaAText();

    double[] array = {2, 10, 6.3, 4.9, 0, 7.1, 8.3,4,5.7,8};
    public double mida = array.length;

    public static void main(String[] args) {
        Examen2 programa = new Examen2();
        programa.inici();
    }

    public void inici(){
        ImprimirArrayNotes();
        while (!fi) {
            MostrarMenu();
            TractarOpcio();
        }
    }

    //Param. entr:no en té
    //Param. sort:no en té
    //FUNCIÓ: llegir les notes
    private void ImprimirArrayNotes() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //Param. entr:
    //Param. sort:
    private void MostrarMenu() {
        System.out.println("\nBenvinguda al càlcul de notes de classe.");
        System .out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
        System.out.println("[MAX] Saber la nota màxima de classe");
        System.out.println("[MIN] Saber la nota mínima de classe");
        System.out.println("[MIT] Saber la nota mitjana de classe");
        System.out.println("[FI] Sortir.");
        System.out.print("Opció: ");
    }

    //Param. entr:
    //Param. sort:
    //FUNCIÓ: tractar cadascuna de les opcions que l'usuari pot triar
    private void TractarOpcio() {
        Scanner lector = new Scanner(System.in);
        String opcio = lector.nextLine();

        if (opcio.equalsIgnoreCase("MAX")) {
            double max = CalculArrays.calcularMaxim(array);
        }
        else if (opcio.equalsIgnoreCase("MIN")) {
            double max = CalculArrays.calcularMinim(array);
        }
        else if (opcio.equalsIgnoreCase("MIT")) {
            double max = CalculArrays.calcularMitjana(array);
        }
        else if (opcio.equalsIgnoreCase("FI")) {
            fi = true;
        }
        else {
            System.out.println("Opció incorrecta!");
        }
    }

    //Param. entr: la nota que volem transformar en text
    //Param. sort: la nota JA transformada en text i si modificar la variable per saber si algú ha tret un 8.
    //FUNCIÓ: Cridem la funció que ens transforma en text la nostra nota.
    private String PrepararSortida(double valor) {
        String resultado = String.valueOf(valor);
        return resultado;
    }

    //Param. entr:
    //Param. sort:
    //FUNCIÓ: buscar si algú ha tret un 8 utilitzant una funció ja creada
    private boolean MirarSiAlgu8() {
        for (double nota : array) {
            if (nota == 8) {
                System.out.println("El array contiene el número 8");
                return true;
            }
        }
        System.out.println("El array no contiene el número 8");
        return false;
    }

    //Param. entr:
    //Param. sort:
    //FUNCIÓ: imprimir el resultat de l'opció que l'usuari ha triat.
    public void ImprimirResultat(double valornota, String text, String opcio) {
        String opcioescollida = "";
        if (opcio.equalsIgnoreCase("MAX")){
            opcioescollida = "màxim";
        }
        else if (opcio.equalsIgnoreCase("MIN")){
            opcioescollida = "mínim";
        }
        else {
            opcioescollida = "mitjà";
        }
        System.out.print("El valor " + opcioescollida +" de l'array que has escrit és " + valornota);
        System.out.println(" que equival a un " + text + ".\n");
    }

}
