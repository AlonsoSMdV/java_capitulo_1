import java.util.Scanner;
import java.util.Spliterators.AbstractLongSpliterator;
/**
* Muestra por pantalla tu nombre
*
* 
*/
public class Ejercicio1 { // Clase principal
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Su nombre es: ");
	String nombre = sc.next();
	System.out.print("Buenas "+nombre);
}
}