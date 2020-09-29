package ejercicio2;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author MisaoDev
 * 
 * Unidad 2 Guía 2 Ejercicio 2: Ferrocarriles
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Pasaje p[] = new Pasaje[3];
    
    p[0] = new Pasaje("Don Sapo", LocalDate.parse("2020-10-05"), LocalTime.parse("11:30"),
            "Tokyo", 17, 3, 34_000, true, true);
    
    p[1] = new Pasaje("Don Pollo", LocalDate.parse("2020-12-01"), LocalTime.parse("09:15"),
            "Antofagasta", 56, 7, 15_000, true, false);
    
    for (int i = 0; i < 2; i++) {
      p[i].print();
    }
    
  }
  
}
