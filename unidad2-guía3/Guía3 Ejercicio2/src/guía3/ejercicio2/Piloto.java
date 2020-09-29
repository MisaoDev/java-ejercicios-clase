package guía3.ejercicio2;

/**
 *
 * @author MisaoDev
 */
public class Piloto {
  
  private String nombre;
  private int puntaje;

  public Piloto() {
    nombre = "";
    puntaje = 0;
  }
  
  public Piloto(String nombre, int puntaje) {
    this.nombre = nombre;
    this.puntaje = puntaje;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getPuntaje() {
    return puntaje;
  }

  public void setPuntaje(int puntaje) {
    this.puntaje = puntaje;
  }
  
  public boolean isHabilitado() {
    return puntaje >= 70;
  }
  
  public boolean isGanador() {
    return puntaje > 97;
  }
  
  public void print() {
    System.out.printf("Detalles del piloto - %s%n", nombre);
    System.out.printf("===============================================%n");
    System.out.printf("Puntaje:     %d%n",    puntaje);
    System.out.printf("Habilitado:  %s%n%n",  isHabilitado() ? "Sí" : "No");
  }
  
}
