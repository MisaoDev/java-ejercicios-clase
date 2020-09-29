package ejerciciosclase;

import java.util.Scanner;

/**
 *    Guía 02 Ejercicio 01
 * Arrojar la serie de números consecutiva ingresando el valor de inicio y final.
 * Para ello mostrará usando for, luego la misma serie usando while,
 * finalmente se repita nuevamente la serie usando do while.
 */
public class G0201 {
  
  private static Scanner scan = new Scanner(System.in);
  
  private static int requestInt(String message) {
    
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
  
  private static String requestStr(String message, boolean optional) {
    
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
  
  private static String requestStr(String message) {
    return requestStr(message, false);
  }
  
  public static void main(String[] args) {
    
    int end, start = requestInt("Ingrese el número inicial.");
    
    //  Validar que el número final sea mayor al inicial
    do {
      end = requestInt("Ingrese el número final.");
      if (end > start) break;
      System.out.println("ERROR: Número final debe ser mayor al número inicial.");
    } while (true);
    
    //  Preparar variables para facilitar la impresión
    int startLength   = String.valueOf(start).length();
    int endLength     = String.valueOf(end).length();
    int width         = (startLength > endLength ? startLength : endLength) + 1;
    int numbersPerRow = (int) (58 / width);
    
    //  Imprimir usando FOR
    for (int i = start, c = 1; i <= end; i++, c++) {
      System.out.print(String.format("%" + width + "d", i));
      if (c % numbersPerRow == 0) System.out.println("");
    }
    System.out.println("\n");
    
    //  Imprimir usando WHILE
    {
      int i = start - 1, c = 1;
      while (++i <= end) {
        System.out.print(String.format("%" + width + "d", i));
        if (c++ % numbersPerRow == 0) System.out.println("");
      }
    }
    System.out.println("\n");
    
    //  Imprimir usando DO-WHILE
    {
      int i = start, c = 1;
      do {
        System.out.print(String.format("%" + width + "d", i));
        if (c++ % numbersPerRow == 0) System.out.println("");
      }
      while (++i <= end);
    }
    System.out.println("\n");
    
  }
  
}
