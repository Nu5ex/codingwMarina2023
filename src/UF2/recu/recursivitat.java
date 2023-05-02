package UF2.recu;

public class recursivitat{
    public static void main(String[] args) {
         jpp(33);
    }
    public static int jpp (int x) {
      if(x >= 0){
          if(x % 2 > 0) {
              System.out.println(x + " es inpar");
              return x + jpp (x-1);
          }
          else{
              System.out.println(x + " es par");
              return x + jpp (x-1);
          }

      }
      else{
          System.out.println();
      }

        return x;
    }
}
