package UF4.figures.Figures;

public class rectangle {
       public int base;
       public int alt;
       public String color;

       public int getBase() {
              return base;
       }

       public void setBase(int base) {
              this.base = base;
       }

       public int getAlt() {
              return alt;
       }

       public void setAlt(int alt) {
              this.alt = alt;
       }

       public String getColor() {
              return color;
       }

       public void setColor(String color) {
              this.color = color;
       }

       public rectangle(String c, int b, int a) {
              c=color;
              b=base;
              a=alt;
       }
}
