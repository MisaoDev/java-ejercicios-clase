package ejercicio1;

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
    
    Zapato[] zapatos = new Zapato[3];
    
    zapatos[0] = new Zapato("Nike",     "Runner",  44, 'M', "Gris",    39_990);
    zapatos[1] = new Zapato("Nike",     "Trainer", 39, 'F', "Calipso", 45_490);
    zapatos[2] = new Zapato("Converse", "Urban",   42, 'M', "Negro",   32_990);
    
    for (int i = 0; i < 3; i++) {
      zapatos[i].print();
    }
    
  }
  
}
