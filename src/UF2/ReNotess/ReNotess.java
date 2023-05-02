package UF2.ReNotess;

public class ReNotess {
    public static void main(String[] args) {
        ReNotess programa = new ReNotess();
        programa.inici();
    }
    public void inici() {
        double[] notes = {2.0, 5.5, 7.25, 3.0, 9.5, 8.25, 7.0, 7.5};
        Calculcacion jpp = new Calculcacion();
        Calculacion2 jpp2 = new Calculacion2();
        Calculacion3 jpp3 = new Calculacion3();
        double max = jpp.calcularMaxim(notes);
        double min = jpp2.calcularMinim(notes);
        double mitjana = jpp3.calcularMitjana(notes);
        System.out.println("La nota màxima és " + max + ".");
        System.out.println("La nota mínima és " + min + ".");
        System.out.println("La mitjana de les notes és " + mitjana + ".");
    }

}
