package guía3.ejercicio1;

/**
 *
 * @author MisaoDev
 */
public class Cliente {
  
  private String nombre;
  private String rut;
  private int edad;
  
  public Cliente() {
    nombre = "";
    rut = "";
    edad = 18;
  }
  
  public Cliente(String nombre, String rut, int edad) {
    this.nombre = nombre;
    this.rut = rut;
    setEdad(edad);
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getRut() {
    return rut;
  }

  public void setRut(String rut) {
    this.rut = rut;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    if (edad >= 18) {
      this.edad = edad;
    }
    else {
      throw new IllegalArgumentException("Edad debe ser mayor a 18.");
    }
  }
  
  public void print() {
    System.out.printf("         || %-7s: %s%n",   "Nombre", nombre);
    System.out.printf("Cliente  || %-7s: %s%n",   "RUT",    rut);
    System.out.printf("         || %-7s: %d%n%n", "Edad",   edad);
  }
  
}
