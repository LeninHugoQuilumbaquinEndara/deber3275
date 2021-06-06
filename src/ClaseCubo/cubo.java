
package ClaseCubo;

public class cubo {
    int alto;
    int ancho;
    int profundo;
public void verDatos(){
System.out.println("Alto: "+this.alto);
System.out.println("Ancho: "+this.ancho);
System.out.println("Profundo: "+this.profundo);
}
public int  volumen(){
   int resultado = alto*ancho*profundo;
   return resultado;
}
}