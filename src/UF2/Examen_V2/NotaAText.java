package UF2.Examen_V2;

public class NotaAText {

    //Param. entr: la nota que volem transformar a text
    //Param. sort: la nota transformada en text
    public String notaAText(double nota) {

        String txt;

        if (nota < 0 || nota > 10) {
            txt = "No existe";
        }
        else if (nota >= 0 || nota <= 5) {
            txt = "Insuficiente";
        }
        else if (nota >= 5) {
            txt = "Suficiente";
        }
        else if (nota >= 6) {
            txt = "Bien";
        }
        else if (nota == 7 || nota == 8) {
            txt = "Notable";
        }
        else if (nota == 9 || nota == 10) {
            txt = "Sobresaliente";
        }
        else {
            txt = "No existe";
        }
        return txt;
    }
}

