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
public class Artículo implements Operable {
  
  private String código;
  private String título;
  private String fechaPréstamo;
  private int díasAtraso;
  private String estadoPréstamo;

  public Artículo() {
    código = "0000000";
    título = "";
    fechaPréstamo = "2000-01-01";
    díasAtraso = 0;
    estadoPréstamo = "biblioteca";
  }

  public Artículo(String código, String título) {
    setCódigo(código);
    this.título = título;
    this.fechaPréstamo = "2020-01-01";
    this.díasAtraso = 0;
    this.estadoPréstamo = "biblioteca";
  }
  
  public Artículo(String código, String título, String fechaPréstamo, int díasAtraso, String estadoPréstamo) {
    setCódigo(código);
    this.título = título;
    this.fechaPréstamo = fechaPréstamo;
    this.díasAtraso = díasAtraso;
    this.estadoPréstamo = estadoPréstamo;
  }

  public String getCódigo() {
    return código;
  }

  public final void setCódigo(String código) {
    if (código.length() == 7) {
      this.código = código;
    } else {
      throw new IllegalArgumentException("El código del artículo debe tener exactamente 7 dígitos.");
    }
  }

  public String getTítulo() {
    return título;
  }

  public void setTítulo(String título) {
    this.título = título;
  }

  public String getFechaPréstamo() {
    return fechaPréstamo;
  }

  public void setFechaPréstamo(String fechaPréstamo) {
    this.fechaPréstamo = fechaPréstamo;
  }

  public int getDíasAtraso() {
    return díasAtraso;
  }

  public void setDíasAtraso(int díasAtraso) {
    this.díasAtraso = díasAtraso;
  }

  public String getEstadoPréstamo() {
    return estadoPréstamo;
  }

  public void setEstadoPréstamo(String estadoPréstamo) {
    this.estadoPréstamo = estadoPréstamo;
  }
  
  @Override
  public String toString() {
    String t = "";
    t += String.format("==[Detalle del artículo]=======================%n");
    t += String.format("Código:         %s%n",    código);
    t += String.format("Título:         %s%n",    título);
    t += String.format("Fecha préstamo: %s%n",    fechaPréstamo);
    t += String.format("Días de atraso: %d%n",    díasAtraso);
    t += String.format("Estado:         %s%n",    "en " + estadoPréstamo);
    t += String.format("Valor multa:    $%,d%n",    pagoPorMulta());
    return t;
  }
  
  @Override
  public int pagoPorMulta() {
    if (estadoPréstamo.equals("domicilio") && díasAtraso > 0) {
      return VALOR_MULTA_DÍA * díasAtraso;
    } else {
      return 0;
    }
  }
  
  @Override
  public void imprimirComprobante() {
    System.out.println(toString());
  }

  @Override
  public void imprimirMulta() {
    System.out.printf("==[Detalle de la multa]========================%n");
    int multa = pagoPorMulta();
    if (multa == 0) {
      System.out.printf("No existe multa asociada a este artículo.%n%n");
    } else {
      System.out.printf("Días de atraso: %d%n",   díasAtraso);
      System.out.printf("Valor diario:   $%,d%n",   VALOR_MULTA_DÍA);
      System.out.printf("Valor multa:    $%,d%n%n", multa);
    }
  }
  
  
  
}
