package UF4.figures.Empresa;

public class TipusProducte {
    private String  nom;
    private int codiIdentificador;
    private double  preu;
    private int  estoc;

    private boolean  aLaVenda;
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCodiIdentificador() {
        return codiIdentificador;
    }

    public void setCodiIdentificador(int codiIdentificador) {
        this.codiIdentificador = codiIdentificador;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public int getEstoc() {
        return estoc;
    }

    public void setEstoc(int estoc) {
        this.estoc = estoc;
    }

    public boolean isaLaVenda() {
        return aLaVenda;
    }

    public void setaLaVenda(boolean aLaVenda) {
        this.aLaVenda = aLaVenda;
    }

}
