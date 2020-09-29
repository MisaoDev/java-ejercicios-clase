package ejerciciosclase;

import java.util.Scanner;

/**
 *    Guía 01 Ejercicio 02
 * Arroje la tabla de multiplicar de un entero ingresado con el siguiente
 * formato ejemplo: 7 * 1 = 7 ... 7 * 10 = 70. Usar ciclo while.
 */
public class G0102 {
  
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
    
    int entero = requestInt("Ingrese un número entero");
    
    if (entero < 0) {
      entero = -entero;
      String t = String.format("Número es negativo, mostrando tabla del %d.", entero);
      System.out.println(t);
    }
    
    int len = Integer.toString(entero).length();
    String formato = "%1d x %1d = %1d";
    formato = formato.replace("1", Integer.toString(len));
    
    for (int i = 1; i <= 10; i++) {
      int producto = entero * i;
      String t = String.format(formato, entero, i, producto);
      System.out.println(t);
    }
    
  }
  
}
