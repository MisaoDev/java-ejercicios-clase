package guía3.ejercicio1;

/**
 *
 * @author MisaoDev
 * 
 * Unidad 2 Guía 3 Ejercicio 1: Teatro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      Cliente[] clientes = new Cliente[2];
      Venta[] ventas = new Venta[2];
      
      clientes[0] = new Cliente("Don Sapo", "17.090.444-K", 25);
      ventas[0] = new Venta(2500, 4, true, clientes[0]);
              
      clientes[1] = new Cliente("Lalatina Dustiness Ford ♥", "20.123.456-7", 18);
      ventas[1] = new Venta(4800, 2, false, clientes[1]);
      
      for (int i = 0; i < 2; i++) clientes[i].print();
      for (int i = 0; i < 2; i++) ventas[i].print();
      
    }

}
