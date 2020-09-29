package ejerciciosclase;

import java.util.Scanner;

/**
 *    Guía 01 Ejercicio 01
 * Obtener la suma de N números ingresados por teclado.
 * N corresponde a una cantidad de números
 * que deberá pedir al iniciar el programa. Usar ciclo for.
 */
public class G0101 {
  
  private static Scanner scan = new Scanner(System.in);
  
  private static int requestInt(String message) {
    
    System.out.print(message + "\n>");
    try {
      int n = Integer.parseInt(scan.nextLine());
      System.out.println("");
      return n;
      
    } catch (NumberFormatException e) {
      System.out.println("\nERROR: Ingrese un número válido");
      return requestInt(message);
      
    }
    
  }
  
  private static String requestStr(String message, boolean optional) {
    
    System.out.print(message + "\n>");
    String s = scan.nextLine();
    System.out.println("");
    
    if (!optional && s.equals("")) {
      System.out.println("ERROR: Respuesta no puede estar en blanco");
      return requestStr(message, false);
    }
    else {
      return s;
    }
    
  }
  
  private static String requestStr(String message) {
    return requestStr(message, false);
  }
  
  public static void main(String[] args) {
    
    int suma = 0;
    int cantidad = requestInt("Ingrese N");
    
    for (int i = 1; i <= cantidad; i++) {
      int número = requestInt("Ingrese el número " + i);
      suma += número;
    }
    
    System.out.println("\nEl resultado de la suma es: " + suma);
    
  }
  
}
