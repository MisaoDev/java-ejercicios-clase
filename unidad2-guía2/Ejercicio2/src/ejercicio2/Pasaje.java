package ejercicio2;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author MisaoDev
 */
public class Pasaje {
  
  private String nombrePasajero;
  private LocalDate fechaSalida;
  private LocalTime horaSalida;
  private String destino;
  private int númeroAsiento;
  private int númeroVagón;
  private int precio;
  private boolean conEquipaje;
  private boolean vagónVIP;

  public Pasaje() {
    nombrePasajero = "";
    fechaSalida = LocalDate.now();
    horaSalida = LocalTime.now();
    destino = "";
    númeroAsiento = 0;
    númeroVagón = 0;
    precio = 0;
    conEquipaje = false;
  }

  public Pasaje(String nombrePasajero, LocalDate fechaSalida, LocalTime horaSalida, String destino,
          int númeroAsiento, int númeroVagón, int precio, boolean conEquipaje, boolean vagónVIP) {
    this.nombrePasajero = nombrePasajero;
    this.fechaSalida = fechaSalida;
    this.horaSalida = horaSalida;
    this.destino = destino;
    this.númeroAsiento = númeroAsiento;
    this.númeroVagón = númeroVagón;
    this.precio = precio;
    this.conEquipaje = conEquipaje;
    this.vagónVIP = vagónVIP;
  }

  public String getNombrePasajero() {
    return nombrePasajero;
  }

  public void setNombrePasajero(String nombrePasajero) {
    this.nombrePasajero = nombrePasajero;
  }

  public LocalDate getFechaSalida() {
    return fechaSalida;
  }

  public void setFechaSalida(LocalDate fechaSalida) {
    this.fechaSalida = fechaSalida;
  }

  public LocalTime getHoraSalida() {
    return horaSalida;
  }

  public void setHoraSalida(LocalTime horaSalida) {
    this.horaSalida = horaSalida;
  }

  public String getDestino() {
    return destino;
  }

  public void setDestino(String destino) {
    this.destino = destino;
  }

  public int getNúmeroAsiento() {
    return númeroAsiento;
  }

  public void setNúmeroAsiento(int númeroAsiento) {
    this.númeroAsiento = númeroAsiento;
  }

  public int getNúmeroVagón() {
    return númeroVagón;
  }

  public void setNúmeroVagón(int númeroVagón) {
    this.númeroVagón = númeroVagón;
  }

  public int getPrecio() {
    return precio;
  }

  public void setPrecio(int precio) {
    this.precio = precio;
  }

  public boolean isConEquipaje() {
    return conEquipaje;
  }

  public void setConEquipaje(boolean conEquipaje) {
    this.conEquipaje = conEquipaje;
  }

  public boolean isVagónVIP() {
    return vagónVIP;
  }

  public void setVagónVIP(boolean vagónVIP) {
    this.vagónVIP = vagónVIP;
  }
  
  public int precioFinal() {
    return precio + (conEquipaje ? 12_000 : 0) + (vagónVIP ? (int) (precio * 0.5) : 0);
  }
  
  public void print() {
    System.out.printf("Detalles del pasaje%n==========================================%n");
    System.out.printf("%-20s: %s%n",      "Nombre cliente",   nombrePasajero);
    System.out.printf("%-20s: %s%n",      "Fecha salida",     fechaSalida);
    System.out.printf("%-20s: %s%n",      "Hora salida",      horaSalida);
    System.out.printf("%-20s: %s%n",      "Destino",          destino);
    System.out.printf("%-20s: %d%n",      "N° asiento",       númeroAsiento);
    System.out.printf("%-20s: %d%n",      "N° vagón",         númeroVagón);
    System.out.printf("%-20s: %s%n",      "Vagón VIP",        vagónVIP ? "Sí" : "No");
    System.out.printf("%-20s: %s%n",      "Con equipaje",     conEquipaje ? "Sí" : "No");
    System.out.printf("%n");
    System.out.printf("%-20s: $ %,d%n",   "Precio",           precio);
    System.out.printf("%-20s: $ %,d%n",   "Cargo equipaje",   conEquipaje ? 12_000 : 0);
    System.out.printf("%-20s: $ %,.0f%n", "Cargo vagón VIP",  vagónVIP ? precio * 0.5 : 0);
    System.out.printf("%-20s: $ %,d%n",   "Total a pagar",    precioFinal());
    System.out.printf("%n");
  }

}
