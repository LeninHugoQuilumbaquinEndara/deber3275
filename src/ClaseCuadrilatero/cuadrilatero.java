
package ClaseCuadrilatero;

public class cuadrilatero {
    int alto;
    int base;
public void verDatos(){
System.out.println("Alto: "+this.alto);
System.out.println("Ancho: "+this.base);
}
public int  area(){
   int resultado1 = alto*base;
   return resultado1;
} 
public int perimero(){
    int resultado2 = (2)*(alto+base);
    return resultado2;
}
}
