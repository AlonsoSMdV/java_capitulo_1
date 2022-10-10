import java.util.Scanner;
/**
* Muestra por pantalla tu nombre
*
* 
*/
public class Ejercicio1Java {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su nombre: ");
        String nombre = sc.next();
        System.out.print("Buenas "+nombre);
    }
}
