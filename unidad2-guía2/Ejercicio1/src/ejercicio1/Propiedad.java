package ejercicio1;

/**
 *
 * @author MisaoDev
 */
public class Propiedad {
  
  private String  tipoPropiedad;
  private int     metrosCuadrados;
  private int     númeroHabitaciones;
  private int     númeroBaños;
  private String  ubicación;
  private int     precioUF;

  public Propiedad() {
    tipoPropiedad = "";
    metrosCuadrados = 0;
    númeroHabitaciones = 0;
    númeroBaños = 0;
    ubicación = "";
    precioUF = 0;
  }
  
  public Propiedad(String tipoPropiedad, int metrosCuadrados, int númeroHabitaciones, int númeroBaños, String ubicación, int precioUF) {
    this.tipoPropiedad = tipoPropiedad;
    this.metrosCuadrados = metrosCuadrados;
    this.númeroHabitaciones = númeroHabitaciones;
    this.númeroBaños = númeroBaños;
    this.ubicación = ubicación;
    this.precioUF = precioUF;
  }
  
  public Propiedad(String tipoPropiedad, int metrosCuadrados, String ubicación, int precioUF) {
    this.tipoPropiedad = tipoPropiedad;
    this.metrosCuadrados = metrosCuadrados;
    this.ubicación = ubicación;
    this.precioUF = precioUF;
  }

  public String getTipoPropiedad() {
    return tipoPropiedad;
  }

  public void setTipoPropiedad(String tipoPropiedad) {
    this.tipoPropiedad = tipoPropiedad;
  }

  public int getMetrosCuadrados() {
    return metrosCuadrados;
  }

  public void setMetrosCuadrados(int metrosCuadrados) {
    this.metrosCuadrados = metrosCuadrados;
  }

  public int getNúmeroHabitaciones() {
    return númeroHabitaciones;
  }

  public void setNúmeroHabitaciones(int númeroHabitaciones) {
    this.númeroHabitaciones = númeroHabitaciones;
  }

  public int getNúmeroBaños() {
    return númeroBaños;
  }

  public void setNúmeroBaños(int númeroBaños) {
    this.númeroBaños = númeroBaños;
  }

  public String getUbicación() {
    return ubicación;
  }

  public void setUbicación(String ubicación) {
    this.ubicación = ubicación;
  }

  public int getPrecioUF() {
    return precioUF;
  }

  public void setPrecioUF(int precioUF) {
    this.precioUF = precioUF;
  }
  
  public int precioEnPesos(double valorUF) {
    return (int) (precioUF * valorUF);
  }
  
  public void print() {
    System.out.printf("Detalles de la propiedad%n==========================================%n");
    System.out.printf("%-18s: %s%n",       "Tipo de propiedad",  tipoPropiedad);
    System.out.printf("%-18s: %d%n",       "Metros cuadrados",   metrosCuadrados);
    System.out.printf("%-18s: %d%n",       "N° habitaciones",    númeroHabitaciones);
    System.out.printf("%-18s: %d%n",       "N° baños",           númeroBaños);
    System.out.printf("%-18s: %s%n",       "Ubicación",          ubicación);
    System.out.printf("%-18s: UF %d%n",    "Precio",             precioUF);
    System.out.printf("%-18s   $ %,d%n%n", "",                   precioEnPesos(precioUF));
  }
  
}
