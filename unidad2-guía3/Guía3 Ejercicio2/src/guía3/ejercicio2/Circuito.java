package guía3.ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author MisaoDev
 */
public class Circuito {
  
  private String nombreRuta;
  private ArrayList<RegistroPiloto> listaPilotos;

  public Circuito(String nombreRuta) {
    this.nombreRuta = nombreRuta;
    this.listaPilotos = new ArrayList();
  }

  public String getNombre() {
    return nombreRuta;
  }

  public void setNombre(String nombreRuta) {
    this.nombreRuta = nombreRuta;
  }

  public ArrayList<RegistroPiloto> getListaPilotos() {
    return listaPilotos;
  }

  public void setListaPilotos(ArrayList<RegistroPiloto> listaPilotos) {
    this.listaPilotos = listaPilotos;
  }
  
  public void agregarRegistro(Piloto piloto, int tiempo, int velocidadMáxima) {
    listaPilotos.add(new RegistroPiloto(piloto, tiempo, velocidadMáxima));
  }
  
  public void removerRegistro(int index) {
    listaPilotos.remove(index);
  }
  
  public void print() {
    System.out.printf("Detalles del circuito - %s%n", nombreRuta);
    System.out.printf("===============================================%n");
    
    for (RegistroPiloto r : listaPilotos) {
      String nombrePiloto = r.getPiloto().getNombre();
      int segundos = r.getTiempo();
      double velocidadMáxima = r.getVelocidadMáxima();
      
      System.out.printf("%-26s | %02d:%02d:%02d | %.2f%n", nombrePiloto,
              segundos / 3600, (segundos % 3600) / 60, segundos % 60, velocidadMáxima);
    }
    System.out.printf("%n");
    
  }
  
}
