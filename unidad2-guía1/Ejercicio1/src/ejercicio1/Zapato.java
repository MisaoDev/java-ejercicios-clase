/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Acer
 */
public final class Zapato {
  
  private String  marca;
  private String  modelo;
  private int     talla;
  private char    género;
  private String  color;
  private int     precio;

  public Zapato() {
    marca = "";
    modelo = "";
    talla = 0;
    género = '\u0000';
    color = "";
    precio = 0;
  }
  
  public Zapato(String marca, String modelo, int talla, char género, String color, int precio) {
    this.marca = marca;
    this.modelo = modelo;
    this.talla = talla;
    this.género = género;
    this.color = color;
    this.precio = precio;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getTalla() {
    return talla;
  }

  public void setTalla(int talla) {
    if (talla < 30 || talla > 48) {
      throw new IllegalArgumentException("Atributo talla debe estar entre 30 y 48.");
    }
    this.talla = talla;
  }

  public char getGénero() {
    return género;
  }

  public void setGénero(char género) {
    this.género = género;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getPrecio() {
    return precio;
  }

  public void setPrecio(int precio) {
    if (precio <= 1000) {
      throw new IllegalArgumentException("Atributo precio debe ser mayor a 1000.");
    }
    this.precio = precio;
  }
  
  public void print() {
    String t = String.format(
            "Detalles del zapato%n" +
            "=====================================%n" +
            "Marca:   %s%n" +
            "Modelo:  %s%n" +
            "Talla:   %d%n" +
            "Género:  %s%n" +
            "Color:   %s%n" +
            "Precio:  $ %,d%n",
            marca, modelo, talla, género, color, precio
    );
    System.out.println(t);
  }
  
  public int precioConDescuento() {
    return (int) (precio * 0.9);
  }
  
}
