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
public class Proyecto {
  
  private String nombreProyecto;

  public Proyecto() {
    nombreProyecto = "";
  }

  public Proyecto(String nombreProyecto) {
    this.nombreProyecto = nombreProyecto;
  }

  public String getNombreProyecto() {
    return nombreProyecto;
  }

  public void setNombreProyecto(String nombreProyecto) {
    this.nombreProyecto = nombreProyecto;
  }
  
}
