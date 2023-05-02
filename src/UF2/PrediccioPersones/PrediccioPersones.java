package UF2.PrediccioPersones;

import java.util.Scanner;
public class PrediccioPersones {

    private String mesNaixement = "";
    private int numSort = 0;
    private int edat = 0;
    private String equipFutbol = "";
    private String llenguatgeProgramacio = "";
    private String nom = "";

    public static void main (String[] args) {
        PrediccioPersones programa = new PrediccioPersones();
        programa.inici();
    }

    public void inici() {
        mostrarMenu();
        leerDatos();
        prediccio();
        imprimir();
    }

    public void imprimir() {
        //System out final
        System.out.print("------------------------------------------------\n");

        System.out.print("Un plaer conèixer-te " + nom + ". Amb les dades que m'has donat, mira què he arribat a saber de tu... \n");
        System.out.print("\n\n");

        System.out.print(">>> El teu número de la sort és el " + numSort + "!");
        System.out.print("\n\n");

        System.out.print(">>> El teu equip de fútbol preferit, encara que no ho diguis en veu alta, és el " + equipFutbol + ".");
        System.out.print("\n\n");

        System.out.print(">>> El teu llenguatge de programació més estimat serà " + llenguatgeProgramacio + "!");
        System.out.print("\n\n");

        System.out.print("Torna quan vulguis!\n");
        System.out.print("------------------------------------------------\n\n\n");
    }

    public void prediccio() {
        if (mesNaixement.equals("Gener") || mesNaixement.equals("gener")) {
            gener();
        }
        else if (mesNaixement.equals("Febrer") || mesNaixement.equals("febrer")) {
            febrer();
        }
        else if (mesNaixement.equals("Març") || mesNaixement.equals("març")) {
            marz();
        }
        else if (mesNaixement.equals("Abril") || mesNaixement.equals("abril")) {
            abril();
        }
        else if (mesNaixement.equals("Maig") || mesNaixement.equals("maig")) {
            maig();
        }
        else if (mesNaixement.equals("Juny") || mesNaixement.equals("juny")) {
            juny();
        }
        else if (mesNaixement.equals("Juliol") || mesNaixement.equals("juliol")) {
            juliol();
        }
        else if (mesNaixement.equals("Agost") || mesNaixement.equals("agost")) {
            agost();
        }
        else if (mesNaixement.equals("Septembre") || mesNaixement.equals("septembre")) {
            septembre();
        }
        else if (mesNaixement.equals("Octubre") || mesNaixement.equals("octubre")) {
            octubre();
        }
        else if (mesNaixement.equals("Novembre") || mesNaixement.equals("novembre")) {
            novembre();
        }
        else if (mesNaixement.equals("Decembre") || mesNaixement.equals("decembre")) {
            decembre();
        }
    }

    public void gener() {
        numSort = edat * 3/2;
        equipFutbol = "Bayern de Munich";
        llenguatgeProgramacio = "C++";
    }
    public void febrer() {
        numSort = edat - 4;
        equipFutbol = "Atlético de Madrid";
        llenguatgeProgramacio = "Python";
    }
    public void marz() {
        numSort = edat * 3/2;
        equipFutbol = "Bayern de Munich";
        llenguatgeProgramacio = "C++";
    }
    public void abril() {
        numSort = edat * 3/2;
        equipFutbol = "Bayern de Munich";
        llenguatgeProgramacio = "C++";
    }
    public void maig() {
        numSort = edat * 3/2;
        equipFutbol = "Bayern de Munich";
        llenguatgeProgramacio = "C++";
    }
    public void juny() {
        numSort = edat * 3/2;
        equipFutbol = "Bayern de Munich";
        llenguatgeProgramacio = "C++";
    }
    public void juliol() {
        numSort = edat * 3/2;
        equipFutbol = "Bayern de Munich";
        llenguatgeProgramacio = "C++";
    }
    public void agost() {
        numSort = edat * 3/2;
        equipFutbol = "Bayern de Munich";
        llenguatgeProgramacio = "C++";
    }
    public void septembre() {
        numSort = edat * 3/2;
        equipFutbol = "Bayern de Munich";
        llenguatgeProgramacio = "C++";
    }
    public void octubre() {
        numSort = edat * 3/2;
        equipFutbol = "Bayern de Munich";
        llenguatgeProgramacio = "C++";
    }
    public void novembre() {
        numSort = edat * 3/2;
        equipFutbol = "Bayern de Munich";
        llenguatgeProgramacio = "C++";
    }
    public void decembre() {
        numSort = edat * 3/2;
        equipFutbol = "Bayern de Munich";
        llenguatgeProgramacio = "C++";
    }

    public void leerDatos() {

        //declarem l'element scanner per a poder saber què ens escriu l'usuari
        //per terminal
        Scanner s = new Scanner(System.in);

        //recollim la dada a la variable mesNaixement
        mesNaixement = s.nextLine();

        //demanem a l'usuari el mes en què va nèixer
        System.out.print("\n");
        System.out.print("Com et dius?\n");

        //recollim la dada a la variable nom
        nom = s.nextLine();

        //demanem a l'usuari la seva edat
        System.out.print("\n");
        System.out.print("Per acabar, quants anys tens?\n");
        //recollim la dada a la variable edat
        edat = s.nextInt();

        System.out.print("\n\n");
    }

    public void mostrarMenu() {
        System.out.print("Escriu el mes en què vas nèixer.");
        System.out.print("\n");
        System.out.print("Gener\tFebrer\tMarc\n");
        System.out.print("Abril\tMaig\tJuny\n");
        System.out.print("Juliol\tAgost\tSetembre\n");
        System.out.print("Octubre\tNovembre\tDesembre");
        System.out.print("\n\n");
    }
}



