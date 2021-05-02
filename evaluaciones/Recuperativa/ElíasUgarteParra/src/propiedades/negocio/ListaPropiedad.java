package propiedades.negocio;

import java.util.ArrayList;

/**
 *
 * @author MisaoDev <https://github.com/MisaoDev>
 */
public class ListaPropiedad {
  
  private ArrayList<Propiedad> propiedades;

  public ListaPropiedad(ArrayList<Propiedad> propiedades) {
    this.propiedades = propiedades;
  }

  public ListaPropiedad() {
    propiedades = new ArrayList<> ();
  }
  
  public ArrayList<Propiedad> getPropiedades() {
    return propiedades;
  }
  
  public void setPropiedades(ArrayList<Propiedad> propiedades) {
    this.propiedades = propiedades;
  }
  
  public void add(Propiedad propiedad) {
    propiedades.add(propiedad);
  }
  
  public Propiedad get(int índice) {
    return propiedades.get(índice);
  }
  
  public Propiedad remove(int índice) {
    return propiedades.remove(índice);
  }

  @Override
  public String toString() {
    String t = "";
    for (int i = 0; i < propiedades.size(); i++) {
      Propiedad p = propiedades.get(i);
      t += String.format("%d %s%n", i, p.getComuna());
    }
    return t;
  }
  
  
  
}
