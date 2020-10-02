package evaluación2;

import java.time.LocalDate;

/**
 *
 * @author MisaoDev
 */
public class Excursión {
  
  private Cliente cliente;
  private int precioDiario;
  private int duraciónDías;
  private String ubicación;
  private LocalDate fechaInicio;
  private boolean incluyeHospedaje;
  
  public Excursión() {
    cliente = null;
    precioDiario = 0;
    duraciónDías = 0;
    ubicación = "";
    fechaInicio = LocalDate.MIN;
    incluyeHospedaje = false;
  }
  
  public Excursión(Cliente cliente, int precioDiario, int duraciónDías, String ubicación, LocalDate fechaInicio, boolean incluyeHospedaje) {
    this.cliente = cliente;
    this.precioDiario = precioDiario;
    this.duraciónDías = duraciónDías;
    this.ubicación = ubicación;
    this.fechaInicio = fechaInicio;
    this.incluyeHospedaje = incluyeHospedaje;
  }
  
  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }
  
  public int getPrecioDiario() {
    return precioDiario;
  }

  public void setPrecioDiario(int precioDiario) {
    this.precioDiario = precioDiario;
  }

  public int getDuraciónDías() {
    return duraciónDías;
  }

  public void setDuraciónDías(int duraciónDías) {
    this.duraciónDías = duraciónDías;
  }

  public String getUbicación() {
    return ubicación;
  }

  public void setUbicación(String ubicación) {
    this.ubicación = ubicación;
  }

  public LocalDate getFechaInicio() {
    return fechaInicio;
  }

  public void setFechaInicio(LocalDate fechaInicio) {
    this.fechaInicio = fechaInicio;
  }

  public boolean isIncluyeHospedaje() {
    return incluyeHospedaje;
  }

  public void setIncluyeHospedaje(boolean incluyeHospedaje) {
    this.incluyeHospedaje = incluyeHospedaje;
  }
  
  public int calcularTotal(boolean calcularConDescuento) {
    int total = precioDiario * duraciónDías;
    if (calcularConDescuento && total > 700_000) {
      total -= (int) (total * 0.1);
    }
    return total;
  }
  
  public boolean isConDescuento() {
    return precioDiario * duraciónDías > 700_000;
  }
  
  public void print() {
    System.out.printf("         | %-18s: %s%n",     "Cliente",           cliente.getNombre());
    System.out.printf("         | %-18s: %s%n",     "Ubicación",         ubicación);
    System.out.printf(" Detalle | %-18s: %s%n",     "Fecha inicio",      fechaInicio);
    System.out.printf("  de la  | %-18s: %d%n",     "Duración en días",  duraciónDías);
    System.out.printf("excursión| %-18s: %s%n",     "Incluye hospedaje",
            incluyeHospedaje ? "Sí" : "No");
    System.out.printf("         | %-18s: $ %,d%n",  "Precio por día",    precioDiario);
    System.out.printf("         | %-18s: $ %,d%n",  "Total neto",        calcularTotal(false));
    
    if (isConDescuento()) {
      System.out.printf("         | %-18s: $ %,.0f%n", "Descuento 10%", calcularTotal(false) * 0.1);
      System.out.printf("         | %-18s: $ %,d%n",   "Total a pagar", calcularTotal(true));
    }
    
    System.out.println("");
  }
  
}
