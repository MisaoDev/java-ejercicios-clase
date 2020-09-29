package ejerciciosclase;

import java.util.Scanner;

/**
 *    Guía 01 Ejercicio 04
 * Se ingresa un número entero, luego arrojar todos los números
 * anteriores hasta llegar a cero. Usar ciclo a elección.
 */
public class G0104 {
  
  private static Scanner scan = new Scanner(System.in);
  
  private static int requestInt(String message) {
    
    System.out.print(message + "\n>");
    try {
      int n = Integer.parseInt(scan.nextLine());
      System.out.println("");
      return n;
      
    } catch (NumberFormatException e) {
      System.out.println("\nERROR: Ingrese un número entero válido");
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
    
    int n;
    
    //  Validar el ingreso del número
    do {
      n = requestInt("Ingrese un número positivo.");
      if (n > 0) break;
      System.out.println("El número debe ser positivo.");
    } while (n < 0);
    
    //  Preparar variables para facilitar la impresión
    int width = Integer.toString(n).length() + 1;
    int numbersPerRow = (int) (60 / width);
    
    //  Imprimir los números de forma ordenada
    for (int i = n, c = 1; i >= 0; i--, c++) {
      System.out.print(String.format("%" + width + "d", i));
      if (c % numbersPerRow == 0) System.out.println("");
    }
    System.out.println("\n");
    
  }
  
}
