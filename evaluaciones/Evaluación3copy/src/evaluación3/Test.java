/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluación3;

import java.util.ArrayList;

/**
 *
 * @author MisaoDev
 */
public class Test {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    ArrayList<Artículo> biblioteca = new ArrayList();
    
    biblioteca.add(new Libro(234, "Isuna Hasekura", "4ng02j3", "Spice & Wolf Vol. 1"));
    biblioteca.add(new Libro(372, "Lewis Carroll", "39fnf92", "Alice's Adventures in Wonderland & Through the Looking-Glass"));
    biblioteca.add(new Libro(225, "Alex Korb", "5q021km", "The Upward Spiral"));
    
    biblioteca.add(new Película(6, "j0239f3", "Rocky: Heavyweight Collection "));
    biblioteca.add(new Película(4, "dbs9329", "Indiana Jones - The Ultimate Collection"));
    
    //  Préstamo de un libro a un estudiante, mantiene atraso/multa
    Artículo a = biblioteca.get(0);
    a.setEstadoPréstamo("domicilio");
    a.setFechaPréstamo("2020-09-25");
    a.setDíasAtraso(4);
    Persona pollito = new Persona("17.989.454-7", "Pollito Bonito", "Estudiante", a);
    
    //  Préstamo de una película a un trabajador, sin atraso
    a = biblioteca.get(4);
    a.setEstadoPréstamo("domicilio");
    a.setFechaPréstamo("2020-10-12");
    a.setDíasAtraso(0);
    Persona donSapo = new Persona("16.409.012-6", "Don Sapo", "TRABAJADOR", a);
    
    //  Testeo solicitado
    System.out.println(pollito);
    System.out.println(donSapo);
    
    //  Testeo adicional
    System.out.println("***************************************************");
    pollito.getArtículo().imprimirMulta();
    donSapo.getArtículo().imprimirMulta();
    biblioteca.get(2).imprimirComprobante();
    biblioteca.get(3).imprimirComprobante();
    
  }
  
}
