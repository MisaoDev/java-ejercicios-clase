package ejercicio.cadenas;

/**
 *
 * @author MisaoDev
 */
public class Persona {
  
  private String rut;
  private String nombre;
  private String apellidoPaterno;
  private String apellidoMaterno;

  public Persona() {
  }

  public Persona(String rut, String nombre, String apellidoPaterno, String apellidoMaterno) {
    this.rut = rut;
    this.nombre = nombre;
    this.apellidoPaterno = apellidoPaterno;
    this.apellidoMaterno = apellidoMaterno;
  }

  public String getRut() {
    return rut;
  }

  public void setRut(String rut) {
    this.rut = rut;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidoPaterno() {
    return apellidoPaterno;
  }

  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }

  public String getApellidoMaterno() {
    return apellidoMaterno;
  }

  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }
  
  public void formatoTítulo() {
    String nombre = this.nombre.substring(0, 1).toUpperCase() +
            this.nombre.substring(1).toLowerCase();
    String apellidoPaterno = this.apellidoPaterno.substring(0, 1).toUpperCase() +
            this.apellidoPaterno.substring(1).toLowerCase();
    String apellidoMaterno = this.apellidoMaterno.substring(0, 1).toUpperCase() +
            this.apellidoMaterno.substring(1).toLowerCase();
    
    System.out.printf("%s %s %s%n", nombre, apellidoPaterno, apellidoMaterno);
  }
  
}
