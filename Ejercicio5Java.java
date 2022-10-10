import java.util.Scanner;

import javax.print.DocFlavor.STRING;
/**
* 
*
*  Escribe un programa que muestre tu horario de clase ahora con colores
* 
*
*/
public class Ejercicio5Java {
    public static void main(String[] args) {
    String verde = "\033[0;32m";
    String cian = "\033[0;36m";
    String amarillo = "\033[0;33m";
    String azul = "\033[0;34m";
    String morado = "\033[0;35m";
    String rojo = "\033[0;31m";
    System.out.println("Lunes\tMartes\tMiérc.\tJueves.\tViernes");
    System.out.println("======\t=======\t======\t=======\t=======");
    System.out.println(azul+"PROG"+rojo+"\tSI"+morado+"\tED"+azul+"\tPROG"+amarillo+"\tFOL");
    System.out.println(azul+"PROG"+rojo+"\tSI"+morado+"\tED"+azul+"\tPROG"+amarillo+"\tFOL");
    System.out.println(cian+"LM"+rojo+"\tSI"+azul+"\tPROG"+cian+"\tLM"+amarillo+"\tFOL");
    System.out.println(cian+"LM"+azul+"\tPROG\tPROG"+cian+"\tLM"+rojo+"\tSI");
    System.out.println(verde+"BBDD"+azul+"\tPROG"+verde+"\tBBDD\tBBDD"+rojo+"\tSI");
    System.out.println(verde+"BBDD"+morado+"\tED"+verde+"\tBBDD\tBBDD"+rojo+"\tSI");
    }
}
