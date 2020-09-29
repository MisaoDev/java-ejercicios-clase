package ejercicio1;

/**
 *
 * @author MisaoDev
 * 
 * Unidad 2 Guía 2 Ejercicio 1: Inmobiliaria
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Propiedad[] p = new Propiedad[3];
    
    p[0] = new Propiedad("Terreno", 800, "Los Andes", 2500);
    p[1] = new Propiedad("Casa", 420, 3, 2, "Valparaíso", 5600);
    p[2] = new Propiedad("Departamento", 350, 2, 1, "Antofagasta", 7000);
    
    for (int i = 0; i < 3; i++) {
      p[i].print();
    }
    
  }
  
}
