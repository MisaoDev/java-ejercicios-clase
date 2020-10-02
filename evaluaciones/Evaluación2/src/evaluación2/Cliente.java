package evaluación2;

/**
 *
 * @author MisaoDev
 */
public class Cliente {
  
  private int edad;
  private String nombre;
  private String rut;
  private char género;
  private boolean turistaFrecuente;

  public Cliente() {
    edad = 0;
    nombre = "";
    rut = "";
    género = 'O';
    turistaFrecuente = false;
  }

  public Cliente(int edad, String nombre, String rut, char género, boolean turistaFrecuente) {
    this.edad = edad;
    this.nombre = nombre;
    this.rut = rut;
    this.género = género;
    this.turistaFrecuente = turistaFrecuente;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    if (edad >= 12 && edad <= 65) {
      this.edad = edad;
    }
    else {
      System.out.printf("ERROR: La edad ingresada (%d) debe estar entre 12 y 65 años.%n", edad);
    }
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

  public char getGénero() {
    return género;
  }

  public void setGénero(char género) {
    this.género = género;
  }

  public boolean isTuristaFrecuente() {
    return turistaFrecuente;
  }

  public void setTuristaFrecuente(boolean turistaFrecuente) {
    this.turistaFrecuente = turistaFrecuente;
  }
  
  public void print() {
    System.out.printf("         | %-18s: %s%n",    "Nombre",            nombre);
    System.out.printf(" Detalle | %-18s: %s%n",    "RUT",               rut);
    System.out.printf("   del   | %-18s: %d%n",    "Edad",              edad);
    System.out.printf(" cliente | %-18s: %s%n",    "Género",            género);
    System.out.printf("         | %-18s: %s%n%n",  "Turista frecuente",
            turistaFrecuente ? "Sí" : "No");
  }
  
}
