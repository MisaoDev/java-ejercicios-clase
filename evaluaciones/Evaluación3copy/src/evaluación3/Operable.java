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
public interface Operable {
  
  static final int VALOR_MULTA_DÍA = 100;
  
  public int pagoPorMulta();
  
  public void imprimirComprobante();
  
  public void imprimirMulta();
  
}
