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
public class Libro extends Artículo {
  
  private int númeroPáginas;
  private String autor;

  public Libro() {
    super();
    númeroPáginas = 0;
    autor = "";
  }
  
  public Libro(int númeroPáginas, String autor, String código, String título, String fechaPréstamo, int díasAtraso, String estadoPréstamo) {
    super(código, título, fechaPréstamo, díasAtraso, estadoPréstamo);
    this.númeroPáginas = númeroPáginas;
    this.autor = autor;
  }
  
  public Libro(int númeroPáginas, String autor, String código, String título) {
    super(código, título);
    this.númeroPáginas = númeroPáginas;
    this.autor = autor;
  }

  public int getNúmeroPáginas() {
    return númeroPáginas;
  }

  public void setNúmeroPáginas(int númeroPáginas) {
    this.númeroPáginas = númeroPáginas;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  @Override
  public String toString() {
    String t = "";
    t += super.toString();
    t += String.format("N° de páginas:  %d%n",    númeroPáginas);
    t += String.format("Autor:          %s%n",    autor);
    return t;
  }
  
}
