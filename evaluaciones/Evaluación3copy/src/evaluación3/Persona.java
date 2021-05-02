/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluación3;

/**
 *
 * @author MisaoDev
 */
public final class Persona {
  
  private String rut;
  private String nombre;
  private String cargo;
  private Artículo artículo;
  
  public Persona() {
    rut = "00000000-0";
    nombre = "";
    cargo = "";
    artículo = null;
  }
  
  public Persona(String rut, String nombre, String cargo, Artículo artículo) {
    this.rut = rut;
    this.nombre = nombre;
    setCargo(cargo);
    setArtículo(artículo);
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
  
  public String getCargo() {
    return cargo;
  }
  
  public void setCargo(String cargo) {
    cargo = cargo.toLowerCase();
    if (cargo.equals("trabajador") || cargo.equals("estudiante")) {
      this.cargo = cargo;
    } else {
      throw new IllegalArgumentException("El cargo solo puede ser \"trabajador\" o \"estudiante\".");
    }
  }
  
  public Artículo getArtículo() {
    return artículo;
  }
  
  public void setArtículo(Artículo artículo) {
    if (artículo.getClass() != Artículo.class) {
      this.artículo = artículo;
    } else {
      throw new IllegalArgumentException("El artículo debe ser de tipo Libro o Película.");
    }
  }
  
  @Override
  public String toString() {
    String t = "";
    t += String.format("==[Detalle de la persona]=======================%n");
    t += String.format("RUT:            %s%n",    rut);
    t += String.format("Nombre:         %s%n",    nombre);
    t += String.format("Cargo:          %s%n%n",  cargo);
    t += artículo;
    return t;
  }
  
}
