package ejerciciosclase;

import java.util.Scanner;

/**
 *    Unidad 0 Guía 0 Ejercicio 0
 * 
 */
public class Base {
  
  /**
   * Lee un entero por pantalla validando que no se ingrese otra cosa
   * @param message   Mensaje a mostrar para solicitar el entero
   * @return          Devuelve el entero ingresado
   */
  private static int requestInt(String message) {
    
    Scanner scan = new Scanner(System.in);
    System.out.print(message + "\n>");
    try {
      int n = Integer.parseInt(scan.nextLine());
      System.out.println("");
      return n;
      
    } catch (NumberFormatException e) {
      System.out.println("\nERROR: Ingrese un número entero válido.");
      return requestInt(message);
      
    }
    
  }
  
  /**
   * Lee una cadena por pantalla
   * @param message   Mensaje a mostrar para solicitar la cadena
   * @param optional  Si es verdadero se puede ingresar una cadena en blanco
   * @return          La cadena ingresada
   */
  private static String requestStr(String message, boolean optional) {
    
    Scanner scan = new Scanner(System.in);
    System.out.print(message + "\n>");
    String s = scan.nextLine();
    System.out.println("");
    
    if (!optional && s.equals("")) {
      System.out.println("ERROR: Respuesta no puede estar en blanco.");
      return requestStr(message, false);
    }
    else {
      return s;
    }
    
  }
  
  /**
   * Lee una cadena por pantalla, no admite una cadena en blanco
   * @param message   Mensaje a mostrar para solicitar la cadena
   * @return          La cadena ingresada
   */
  private static String requestStr(String message) {
    return requestStr(message, false);
  }
  
  public static void main(String[] args) {
    
    
    
  }
  
}
