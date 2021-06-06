
package ClaseCuadrilatero;

public class pruebaCuadrilatero {
  public static void main(String[] args) {
      System.out.println("Calculo del area y perimetro de un rectangulo");
      cuadrilatero cp = new cuadrilatero();
      cp.alto=12;
      cp.base=18;
      cp.verDatos();
      System.out.println("El area es: "+cp.area());
      System.out.println("El perimetro es: "+cp.perimero());
  }
}
