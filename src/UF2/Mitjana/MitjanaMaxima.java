package UF2.Mitjana;

public class MitjanaMaxima {
    public static void main(String[] args) {
        MitjanaMaxima programa = new MitjanaMaxima();
        programa.inici();
    }

    public void inici() {

        CalculsArrayReals calculador = new CalculsArrayReals();

        System.out.println("INTRODUCE 1R ARRAY");
        double[] arrayA = new double[6];
        arrayA = calculador.leerArray(arrayA);

        System.out.println("INTRODUCE 2NDO ARRAY");
        double[] arrayB = new double[6];
        arrayB = calculador.leerArray(arrayB);

        double mitjA = calculador.calcularMitjana(arrayA);
        double mitjB = calculador.calcularMitjana(arrayB);

        if (mitjA > mitjB) {
            System.out.println("arrayA té una mitjana més alta.");
        }
        else if (mitjA < mitjB) {
            System.out.println("arrayB té una mitjana més alta.");
        }
        else {
            System.out.println("Les dues mitjanes són iguals!");
        }
    }

}
