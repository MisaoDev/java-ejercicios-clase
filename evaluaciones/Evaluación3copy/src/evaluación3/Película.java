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
public class Película extends Artículo {
  
  private int númeroDiscos;

  public Película() {
    super();
  }
  
  public Película(int númeroDiscos, String código, String título) {
    super(código, título);
    this.númeroDiscos = númeroDiscos;
  }
  
  public Película(int númeroDiscos, String código, String título, String fechaPréstamo, int díasAtraso, String estadoPréstamo) {
    super(código, título, fechaPréstamo, díasAtraso, estadoPréstamo);
    this.númeroDiscos = númeroDiscos;
  }
  
  public int getNúmeroDiscos() {
    return númeroDiscos;
  }
  
  public void setNúmeroDiscos(int númeroDiscos) {
    this.númeroDiscos = númeroDiscos;
  }
  
  @Override
  public String toString() {
    String t = "";
    t += super.toString();
    t += String.format("N° de discos:   %d%n",    númeroDiscos);
    return t;
  }
  
}
