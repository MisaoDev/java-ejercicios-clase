package ejerciciosclase;

import java.util.Scanner;

/**
 *    Guía 01 Ejercicio 03
 * Obtener la sumatoria, solo de valores positivos ingresados,
 * de lo contrario arrojará un mensaje indicando que no se admiten
 * valores negativos. Validar con “do while” hasta que ingrese correctamente
 */
public class G0103 {
  
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
    
    int suma = 0;
    int contador = 0;
    
    while (true) {
      
      int n;
      
      //  Validar ingreso de n
      do {
        n = requestInt("Ingrese un número (0 para salir)");
        if (n >= 0) break;
        System.out.println("ERROR: No se admiten números negativos.");
      } while (n < 0);
      
      //  Si n es 0 salir del ciclo, caso contrario agregar a la suma
      if (n == 0) {
        break;
      }
      else {
        suma += n;
        contador += 1;
        System.out.println("Suma parcial: " + suma);
      }
      
    }
    
    if (contador == 0) {
      System.out.println("\n\nNo se ingresaron números así que... ¡no se sumó nada!");
    }
    else {
      System.out.println("\n\nSe sumaron " + contador + " números.\n" +
              "El resultado de la suma es: " + suma);
    }
    
  }
  
}
