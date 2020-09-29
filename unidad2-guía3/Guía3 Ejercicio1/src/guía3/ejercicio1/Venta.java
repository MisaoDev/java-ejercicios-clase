package guía3.ejercicio1;

/**
 *
 * @author MisaoDev
 */
public class Venta {
  
  private int precio;
  private int cantidad;
  private boolean conDescuento;
  private Cliente cliente;
  
  public Venta() {
    precio = 0;
    cantidad = 0;
    conDescuento = false;
    cliente = null;
  }
  
  public Venta(int precio, int cantidad, boolean conDescuento, Cliente cliente) {
    this.precio = precio;
    this.cantidad = cantidad;
    this.conDescuento = conDescuento;
    this.cliente = cliente;
  }

  public int getPrecio() {
    return precio;
  }

  public void setPrecio(int precio) {
    this.precio = precio;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  public boolean isConDescuento() {
    return conDescuento;
  }

  public void setConDescuento(boolean conDescuento) {
    this.conDescuento = conDescuento;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }
  
  public int totalAPagar() {
    int total = precio * cantidad;
    total -= conDescuento ? total * 0.10 : 0;
    return total;
  }
  
  public void print() {
    System.out.printf("       || %-18s: %s%n",    "Cliente",           cliente.getNombre());
    System.out.printf("       || %-18s: %,d%n",   "Precio",            precio);
    System.out.printf("Venta  || %-18s: %d%n",    "Cantidad",          cantidad);
    System.out.printf("       || %-18s: %s%n",    "Incluye descuento", conDescuento ? "Sí" : "No");
    System.out.printf("       || %-18s: %,d%n%n", "Total a pagar",     totalAPagar());
  }
  
}
