package UF4.figures.Agenda;

public class cita {
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    private int dia;
    private int hora;
    private String text;
    private String titol;

    public cita(){}

    public cita modificarText(int hora, int dia, String titol, String text){
        this.dia=dia;
        this.text=text;
        this.hora=hora;
        this.titol=titol;
        return null;
    }

}
