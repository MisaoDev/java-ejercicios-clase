package ejercicio.academia;

/**
 *
 * @author shiki
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Estudiante pollo = new Estudiante(true, "17989404-8", "Pollito", true);
    System.out.println(pollo.toString());
    
    Proyecto casaPantano = new Proyecto("Casa en el pantano");
    Profesor sapo = new Profesor("Fijo", casaPantano, "15992559-2", "Don Sapo", false);
    System.out.println(sapo.toString());
    
  }
  
}
