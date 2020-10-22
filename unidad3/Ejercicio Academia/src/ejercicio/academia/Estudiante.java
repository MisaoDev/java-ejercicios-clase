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
public class Estudiante extends Persona {
  
  private boolean alumnoRegular;

  public Estudiante() {
    super();
    alumnoRegular = false;
  }
  
  public Estudiante(boolean alumnoRegular, String rut, String nombre, boolean vacante) {
    super(rut, nombre, vacante);
    this.alumnoRegular = alumnoRegular;
  }

  public boolean isAlumnoRegular() {
    return alumnoRegular;
  }

  public void setAlumnoRegular(boolean alumnoRegular) {
    this.alumnoRegular = alumnoRegular;
  }

  @Override
  public String toString() {
    String t = "";
    t+= String.format("Objeto Estudiante%n============================================%n");
    t+= String.format("%-20s: %s%n", "Rut",               super.getRut());
    t+= String.format("%-20s: %s%n", "Nombre",            super.getNombre());
    t+= String.format("%-20s: %s%n", "Entró por vacante", super.SiNo());
    t+= String.format("%-20s: %s%n", "Alumno regular",    SiNo());
    return t;
  }
  
  @Override
  public String SiNo() {
    return alumnoRegular ? "Sí" : "No";
  }
  
}
