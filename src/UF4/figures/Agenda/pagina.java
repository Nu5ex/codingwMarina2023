package UF4.figures.Agenda;

public class pagina {
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    private int mes;
    private int dia;

    public void afegirCita(cita c){

    }
    public void borrarCita(cita c){

    }
    public cita cercarCita(){
        cita c1 = new cita();
        return c1;
    }
    public cita llistarCites(){
        cita c2 = new cita();
        return c2;
    }
}
