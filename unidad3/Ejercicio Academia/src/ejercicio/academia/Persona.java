/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.academia;

/**
 *
 * @author shiki
 */
public abstract class Persona implements IOperable {
  
  private String rut;
  private String nombre;
  private boolean vacante;

  public Persona() {
    rut = "00000000-0";
    nombre = "N/A";
    vacante = false;
  }
  
  public Persona(String rut, String nombre, boolean vacante) {
    setRut(rut);
    setNombre(nombre);
    this.vacante = vacante;
  }

  public String getRut() {
    return rut;
  }

  public void setRut(String rut) {
    if (rut.length() >= 9 || rut.length() <= 10) {
      this.rut = rut;
    } else {
      throw new IllegalArgumentException("El rut debe tener entre 9 y 10 caracteres");
    }
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    if (! nombre.isEmpty()) {
      this.nombre = nombre;
    } else {
      throw new IllegalArgumentException("El nombre no puede quedar vacío");
    }
  }

  public boolean isVacante() {
    return vacante;
  }

  public void setVacante(boolean vacante) {
    this.vacante = vacante;
  }
  
  @Override
  public String toString() {
    String t = "";
    t+= String.format("Objeto Persona%n============================================%n");
    t+= String.format("%-8s: %s%n", "Rut",      rut);
    t+= String.format("%-8s: %s%n", "Nombre",   nombre);
    t+= String.format("%-8s: %s%n", "Vacante",  SiNo());
    return t;
  }
  
  @Override
  public String SiNo() {
    return vacante ? "Sí" : "No";
  }

  @Override
  public String rutNombre() {
    return rut + " " + nombre;
  }
  
}
