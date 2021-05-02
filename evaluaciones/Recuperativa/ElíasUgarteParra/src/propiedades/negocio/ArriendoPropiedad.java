package propiedades.negocio;

/**
 *
 * @author MisaoDev <https://github.com/MisaoDev>
 */
public final class ArriendoPropiedad extends Propiedad {
  
  private int valorArriendo;

  public ArriendoPropiedad(int valorArriendo, int númeroDormitorios, int númeroBaños, int metrosCuadrados, String comuna) {
    super(númeroDormitorios, númeroBaños, metrosCuadrados, comuna);
    setValorArriendo(valorArriendo);
  }

  public ArriendoPropiedad() {
    super();
    this.valorArriendo = 100_000;
  }

  public int getValorArriendo() {
    return valorArriendo;
  }

  public void setValorArriendo(int valorArriendo) {
    if (valorArriendo > 0) {
      this.valorArriendo = valorArriendo;
    } else {
      throw new IllegalArgumentException("El valor del arriendo debe ser mayor a cero.");
    }
  }
  
}
