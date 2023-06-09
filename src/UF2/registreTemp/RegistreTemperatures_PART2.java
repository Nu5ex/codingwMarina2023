import java.util.Scanner;

public class RegistreTemperatures_PART2 {
  //Constants
  private static final int MAX_SETMANES = 52;

  //Variables globals
  private int numTemperatures = 0;
  private int[] temperatures = new int[MAX_SETMANES * 7];
  private int dia = 1;
  private int mes = 1;

  //M todes associats al problema general
  public static void main (String[] args) {
    RegistreTemperatures_PART2 programa = new RegistreTemperatures_PART2();
    programa.inici();
  }

  public void inici() {
    llegirTemperaturesTeclat();

  }

  //Mètodes associats al punt 2 
  public void mostrarMenu() {

  }

  public void tractarOpcio() {

  }

  //M todes associats al punt 3
  public void registreTemperaturesSetmanals() {

  }

  public void mostrarMitjana() {

  }

  public void mostrarDiferencia() {

  }

  public void finalitzarExecucio() {

  }

  public void llegirTemperaturesTeclat() {
    System.out.println("Escriu les temperatures d’aquesta setmana:");
    Scanner lector = new Scanner(System.in);
    int numLlegides = 0;
    while (numLlegides < 7) {
      if (lector.hasNextInt()) {
        temperatures[numTemperatures] = lector.nextInt();
        numLlegides++;
        numTemperatures++;
      }
      else {
        lector.next();
      }
    }
    calculaDiferencia();
  }

  public void incrementarData() {
    //Quants dies t  aquest mes?
    int diesAquestMes = 0;
    if (mes == 2) {
      diesAquestMes = 28;
    }
    else if ((mes == 4)||(mes == 6)||(mes == 9 )||(mes == 11)) {
      diesAquestMes = 30;
    }
    else {
      diesAquestMes = 31;
    }
    dia = dia + 7;
    //Hem passat de mes?
    if (dia > diesAquestMes) {
      dia = dia - diesAquestMes;
      mes++;
      //Hem passat d’any?
      if (mes > 12) {
        mes = 1;
      }
    }
  }

  public void mostrarData() {
    System.out.print(dia + " de ");
    switch(mes) {
      case 1:
        System.out.print("Gener");
        break;
      case 2:
        System.out.print("Febrer");
        break;
      case 3:
        System.out.print("Mar ");
        break;
      case 4:
        System.out.print("Abril");
        break;
      case 5:
        System.out.print("Maig");
        break;
      case 6:
        System.out.print("Juny");
        break;
      case 7:
        System.out.print("Juliol");
        break;
      case 8:
        System.out.print("Agost");
        break;
      case 9:
        System.out.print("Setembre");
        break;
      case 10:
        System.out.print("Octubre");
        break;
      case 11:
        System.out.print("Novembre");
        break;
      case 12:
        System.out.print("Desembre");
    }
  }

  public void calculaMitjana() {
    float acumulador = 0;
    for(int i = 0; i < numTemperatures; i++) {
      acumulador = acumulador + temperatures[i];
    }
    System.out.print((acumulador / numTemperatures));
  }

  public void calculaDiferencia() {
    int mayor = temperatures[0];
    int menor = temperatures[0];

    for (int c=1;c<numTemperatures  ;c++) {
      if (temperatures[c]<menor) {
        menor=temperatures[c];
      }
      if (temperatures[c]>mayor) {
        mayor=temperatures[c];
      }
    }
    System.out.println("menor: " + menor + " y mayor: " + mayor);
  }
}
