package ejercicio2;

import java.time.LocalTime;

/**
 *
 * @author Don Sapo
 * 
 * Unidad 2 Guía 1 Ejercicio 1
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Entrada[] entradasVendidas = new Entrada[2];
    
    entradasVendidas[0] = new Entrada("0021402", "Rocky",         42, LocalTime.of(15, 30), false, 3000);
    entradasVendidas[1] = new Entrada("0021403", "Hello Dolly!",  19, LocalTime.of(10, 15), true,  3500);
    
    for (Entrada entrada : entradasVendidas) {
      entrada.print();
    }
    
  }
  
}
