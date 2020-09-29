package ejerciciosclase;

import java.util.Scanner;

/**
 *    Guía 02 Ejercicio 02
 * Se ingresan horas, minutos, segundos por separado, validar el correcto ingreso.
 * Finalmente arrojar en formato: HH:MM:SS
 */
public class G0202 {
  
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
    
    int hours, minutes, seconds;
    
    while (true) {
      hours = requestInt("Ingrese las horas. (0-23)");
      if (hours >= 0 && hours < 24) break;
      else System.out.println("ERROR: Valor no válido.");
    }
    
    while (true) {
      minutes = requestInt("Ingrese los minutos. (0-59)");
      if (minutes >= 0 && minutes < 60) break;
      else System.out.println("ERROR: Valor no válido.");;
    }
    
    while (true) {
      seconds = requestInt("Ingrese los segundos (0-59)");
      if (seconds >= 0 && minutes < 60) break;
      else System.out.println("ERROR: Valor no válido.");
    }
    
    String t = String.format("%02d:%02d:%02d", hours, minutes, seconds);
    System.out.println(t);
    
  }
  
}
