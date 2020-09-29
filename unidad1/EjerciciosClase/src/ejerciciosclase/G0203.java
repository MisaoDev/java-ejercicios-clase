package ejerciciosclase;

import java.util.Scanner;

/**
 *    Guía 02 Ejercicio 03
 * Se ingresan los precios de N productos, obtener la sumatoria y
 * si el total supera los $20 000 pesos aplicar un descuento del 10%.
 * Mostrar el total y el posible descuento.
 */
public class G0203 {
  
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
    
    int suma = 0, c = 1;
    
    while (true) {
      
      int precio;
      do {
        precio = requestInt("Ingrese el precio del producto " + c + " (0 para terminar)");
        if (precio >= 0) break;
        else System.out.println("El número debe ser positivo.");
      } while (precio < 0);
      
      if (precio == 0) {
        break;
      }
      else {
        suma += precio;
        c++;
      }
      
    }
    
    if (suma > 20000) {
      int descuento = (int) (suma * 0.1);
      String t = String.format(
              "Total neto:      %10d\n" +
              "Descuento 10%%:   %10d\n",
              suma, descuento
      );
      System.out.println(t);
      suma -= descuento;
    }
    
    System.out.println(String.format("Total a pagar:   %10d\n", suma));
    
  }
  
}
