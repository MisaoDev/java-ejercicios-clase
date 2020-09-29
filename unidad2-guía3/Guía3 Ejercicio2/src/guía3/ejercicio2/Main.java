package guía3.ejercicio2;

import java.time.LocalTime;

/**
 *
 * @author MisaoDev
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      Piloto[] pilotos = new Piloto[3];
      
      pilotos[0] = new Piloto("Don Sapo", 80);
      pilotos[1] = new Piloto("Lalatina Dustiness Ford", 76);
      pilotos[2] = new Piloto("Megumin", 61);
      
      Circuito[] circuitos = new Circuito[2];
      
      circuitos[0] = new Circuito("Sprint ruta norte");
      circuitos[0].agregarRegistro(pilotos[0], LocalTime.of(1, 37, 22).toSecondOfDay(), 147);
      circuitos[0].agregarRegistro(pilotos[1], LocalTime.of(1, 34, 07).toSecondOfDay(), 152);
      
      circuitos[1] = new Circuito("Ruta patagonia");
      circuitos[1].agregarRegistro(pilotos[0], LocalTime.of(2, 42, 58).toSecondOfDay(), 160);
      circuitos[1].agregarRegistro(pilotos[1], LocalTime.of(3, 01, 10).toSecondOfDay(), 156);
      
      for (int i = 0; i < 3; i++) {
        pilotos[i].print();
      }
      
      for (int i = 0; i < 2; i++) {
        circuitos[i].print();
      }
      
    }

}
