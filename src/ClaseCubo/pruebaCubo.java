
package ClaseCubo;

public class pruebaCubo {
  public static void main(String[] args) {
      System.out.println("Calculo del volumen de un cubo");
      cubo p1 = new cubo();
      p1.alto=2;
      p1.ancho=3;
      p1.profundo=6; 
      p1.verDatos();
      System.out.println("El volumen es: "+p1.volumen());
  }
 }

