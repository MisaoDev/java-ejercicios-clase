package ejercicio2;

import java.time.LocalTime;

/**
 *
 * @author Acer
 */
public class Entrada {
  
  private String código;
  private String película;
  private int asiento;
  private LocalTime horario;
  private boolean incluyeGroupon;
  private int precio;
  
  private Entrada() {
    código = "";
    película = "";
    asiento = 0;
    horario = null;
    incluyeGroupon = false;
    precio = 0;
  }

  public Entrada(String código, String película, int asiento, LocalTime horario, boolean incluyeGroupon, int precio) {
    this.código = código;
    this.película = película;
    this.asiento = asiento;
    this.horario = horario;
    this.incluyeGroupon = incluyeGroupon;
    this.precio = precio;
  }

  public String getCódigo() {
    return código;
  }

  public void setCódigo(String código) {
    this.código = código;
  }

  public String getPelícula() {
    return película;
  }

  public void setPelícula(String película) {
    this.película = película;
  }

  public int getAsiento() {
    return asiento;
  }

  public void setAsiento(int asiento) {
    this.asiento = asiento;
  }

  public LocalTime getHorario() {
    return horario;
  }

  public void setHorario(LocalTime horario) {
    this.horario = horario;
  }

  public boolean isIncluyeGroupon() {
    return incluyeGroupon;
  }

  public void setIncluyeGroupon(boolean incluyeGroupon) {
    this.incluyeGroupon = incluyeGroupon;
  }

  public int getPrecio() {
    return precio;
  }

  public void setPrecio(int precio) {
    this.precio = precio;
  }
  
  public void print() {
    String[] atributo = {"Código", "Película", "N° asiento", "Horario", "Incluye Groupon", "Precio"};
    int precioFinal = incluyeGroupon ? (int) (precio * 0.7) : precio;
    
    System.out.printf("Detalles de la entrada%n========================================%n");
    System.out.printf("%-17s: %s%n",      atributo[0], código);
    System.out.printf("%-17s: %s%n",      atributo[1], película);
    System.out.printf("%-17s: %d%n",      atributo[2], asiento);
    System.out.printf("%-17s: %s%n",      atributo[3], horario);
    System.out.printf("%-17s: %s%n",      atributo[4], incluyeGroupon ? "Sí" : "No");
    System.out.printf("%-17s: $ %,d%n%n", atributo[5], precio);
  }
  
}
