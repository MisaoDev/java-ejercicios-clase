package ejerciciosclase;

import java.util.Scanner;

/**
 *    Guía 01 Ejercicio 05
 * Genere un programa que permita arrojar el siguiente menú de opciones:
 * 
 * 1. Calcular área Circulo
 * 2. Calcular área Triángulo
 * 3. Calcularárea rectángulo
 * 4. Salir
 * 
 * Los valores a ingresar deben ser positivos.
 * La única manera que finalice el programa es con la opción: 4 Salir,
 * por lo cual debe ejecutar las demás opciones las veces que ser requiera.
 * Utilice las estructuras más adecuadas para resolver el problema.
 * 
 */
public class G0105 {
  
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
    
    cicloMenú: while (true) {
      
      System.out.println(
        "1. Calcular área circulo\n" +
        "2. Calcular área triángulo\n" +
        "3. Calcular área rectángulo\n" +
        "4. Salir\n"
      );
      
      int opción = requestInt("Ingrese una opción");
      
      switch (opción)
      {
        case 1:
        {
          int radio   = requestInt("Ingrese el radio del círculo");
          double área = Math.PI * radio * radio;
          String t    = String.format("Área = %.2f", área);
          System.out.println(t);
          break;
        }
          
        case 2:
        {
          int base    = requestInt("Ingrese la base del triángulo");
          int altura  = requestInt("Ingrese la altura del triángulo");
          double área = base * altura / (double) 2;
          String t    = String.format("Área = %.2f", área);
          System.out.println(t);
          break;
        }
          
        case 3:
        {
          int longitud  = requestInt("Ingrese la longitud del rectángulo");
          int altura    = requestInt("Ingrese la altura del rectángulo");
          int área      = longitud * altura;
          String t      = String.format("Área = %d", área);
          System.out.println(t);
          break;
        }
          
        case 4:
          break cicloMenú;
          
        default:
          System.out.println("ERROR: Opción inválida\n");;
      }
      
    }
    
  }
  
}
