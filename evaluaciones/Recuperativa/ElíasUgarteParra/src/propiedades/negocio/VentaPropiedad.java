package propiedades.negocio;

/**
 *
 * @author MisaoDev <https://github.com/MisaoDev>
 */
public final class VentaPropiedad extends Propiedad {
  
  public static final double VALOR_UF = 29_084.41;
  
  private int precioVentaUF;
  
  public VentaPropiedad(int precioVentaUF, int númeroDormitorios, int númeroBaños, int metrosCuadrados, String comuna) {
    super(númeroDormitorios, númeroBaños, metrosCuadrados, comuna);
    setPrecioVentaUF(precioVentaUF);
  }

  public VentaPropiedad() {
    super();
    this.precioVentaUF = 1_000;
  }

  public int getPrecioVentaUF() {
    return precioVentaUF;
  }
  
  public long getPrecioVentaPesos() {
    return (long) (precioVentaUF * VALOR_UF);
  }
  
  public void setPrecioVentaUF(int precioVentaUF) {
    if (precioVentaUF > 0) {
      this.precioVentaUF = precioVentaUF;
    } else {
      throw new IllegalArgumentException("El precio de venta debe ser mayor a cero.");
    }
  }
  
  public void setPrecioVentaPesos(long precioVentaPesos) {
    int precioUF = (int) (precioVentaPesos / VALOR_UF);
    this.setPrecioVentaUF(precioUF);
  }
  
}
