package guía3.ejercicio2;

/**
 *
 * @author MisaoDev
 */
public class RegistroPiloto {
  
  private Piloto piloto;
  private int tiempo;
  private double velocidadMáxima;
  
  public RegistroPiloto() {
    piloto = null;
    tiempo = 0;
    velocidadMáxima = 0;
  }
  
  public RegistroPiloto(Piloto piloto, int tiempo, double velocidadMáxima) {
    this.piloto = piloto;
    this.tiempo = tiempo;
    this.velocidadMáxima = velocidadMáxima;
  }

  public Piloto getPiloto() {
    return piloto;
  }

  public void setPiloto(Piloto piloto) {
    this.piloto = piloto;
  }

  public int getTiempo() {
    return tiempo;
  }

  public void setTiempo(int tiempo) {
    this.tiempo = tiempo;
  }

  public double getVelocidadMáxima() {
    return velocidadMáxima;
  }

  public void setVelocidadMáxima(double velocidadMáxima) {
    this.velocidadMáxima = velocidadMáxima;
  }
  
}
