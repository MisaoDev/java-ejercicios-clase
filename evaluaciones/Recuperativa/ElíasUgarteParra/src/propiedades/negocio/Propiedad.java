package propiedades.negocio;

/**
 *
 * @author MisaoDev <https://github.com/MisaoDev>
 */
public abstract class Propiedad {
  
  protected int númeroDormitorios;
  protected int númeroBaños;
  protected int metrosCuadrados;
  protected String comuna;

  public Propiedad(int númeroDormitorios, int númeroBaños, int metrosCuadrados, String comuna) {
    setNúmeroDormitorios(númeroDormitorios);
    setNúmeroBaños(númeroBaños);
    setMetrosCuadrados(metrosCuadrados);
    setComuna(comuna);
  }

  public Propiedad() {
    this(0, 0, 10, "Santiago");
  }

  public int getNúmeroDormitorios() {
    return númeroDormitorios;
  }

  public final void setNúmeroDormitorios(int númeroDormitorios) {
    if (númeroDormitorios >= 0) {
      this.númeroDormitorios = númeroDormitorios;
    } else {
      throw new IllegalArgumentException("El número de dormitorios no puede ser negativo.");
    }
  }

  public int getNúmeroBaños() {
    return númeroBaños;
  }

  public final void setNúmeroBaños(int númeroBaños) {
    if (númeroBaños >= 0) {
      this.númeroBaños = númeroBaños;
    } else {
      throw new IllegalArgumentException("El número de baños no puede ser negativo.");
    }
  }

  public int getMetrosCuadrados() {
    return metrosCuadrados;
  }

  public final void setMetrosCuadrados(int metrosCuadrados) {
    if (metrosCuadrados > 0) {
      this.metrosCuadrados = metrosCuadrados;
    } else {
      throw new IllegalArgumentException("Los metros cuadrados deben ser mayores a cero.");
    }
  }

  public String getComuna() {
    return comuna;
  }

  public final void setComuna(String comuna) {
    if (! comuna.isEmpty()) {
      this.comuna = comuna;
    } else {
      throw new IllegalArgumentException("El nombre de la comuna no puede quedar vacío.");
    }
  }
  
}
