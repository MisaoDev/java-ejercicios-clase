package evaluación2;

import java.time.LocalDate;

/**
 *
 * @author MisaoDev
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      Cliente[]   clientes    = new Cliente[2];
      Excursión[] excursiones = new Excursión[2];
      
      clientes[0] = new Cliente(28, "Don Sapo", "17.444.901-2", 'M', true);
      excursiones[0] = new Excursión(clientes[0], 26_500, 15, "Monte Myoboku",
              LocalDate.parse("2020-10-07"), false);
      
      clientes[1] = new Cliente(18, "Lalatina Dustiness Ford", "21.568.893-7", 'F', false);
      excursiones[1] = new Excursión(clientes[1], 42_000, 60, "Tierra de osos",
              LocalDate.parse("2021-01-15"), true);
      
      for (int i = 0; i < 2; i++) {
        clientes[i].print();
        excursiones[i].print();
      }
      
      clientes[1].setEdad(10);
      System.out.println("Don Sapo");
      
    }

}
