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
public class Profesor extends Persona {
  
  private String tipoContrato;
  private Proyecto proyecto;

  public Profesor() {
    super();
    tipoContrato = "";
    proyecto = null;
  }

  public Profesor(String tipoContrato, Proyecto proyecto, String rut, String nombre, boolean vacante) {
    super(rut, nombre, vacante);
    this.tipoContrato = tipoContrato;
    this.proyecto = proyecto;
  }

  public String getTipoContrato() {
    return tipoContrato;
  }

  public void setTipoContrato(String tipoContrato) {
    this.tipoContrato = tipoContrato;
  }

  public Proyecto getProyecto() {
    return proyecto;
  }

  public void setProyecto(Proyecto proyecto) {
    this.proyecto = proyecto;
  }

  @Override
  public String toString() {
    String t = "";
    t+= String.format("Objeto Profesor%n============================================%n");
    t+= String.format("%-20s: %s%n", "Rut",               super.getRut());
    t+= String.format("%-20s: %s%n", "Nombre",            super.getNombre());
    t+= String.format("%-20s: %s%n", "Entró por vacante", super.SiNo());
    t+= String.format("%-20s: %s%n", "Tipo contrato",     tipoContrato);
    t+= String.format("%-20s: %s%n", "Proyecto",          proyecto.getNombreProyecto());
    return t;
  }
  
}
