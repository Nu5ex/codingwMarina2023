package UF4.figures.Empresa;

public class Sucursal {
    private String  nom;
    private String  adreça;
    private String  telefon;
    private String  email;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdreça() {
        return adreça;
    }

    public void setAdreça(String adreça) {
        this.adreça = adreça;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void descansa(Transportista t){

    }
    public void treballa(Transportista t){

    }
    public void altaClient(Client c){

    }
    public void baixaClient(Client c){

    }
    public void altaEncarrec(Encarrec e){

    }
    public void anulaEncarrec(Encarrec e){

    }
}
