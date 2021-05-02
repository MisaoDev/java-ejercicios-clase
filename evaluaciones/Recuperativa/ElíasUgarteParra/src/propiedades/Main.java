package propiedades;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.JDialog;
import javax.swing.JFrame;
import propiedades.gui.VentanaPrincipal;
import propiedades.negocio.ListaPropiedad;

/**
 *
 * @author MisaoDev <https://github.com/MisaoDev>
 */
public class Main {
  
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    //  Establecer el estilo del programa con FlatLaf <https://www.formdev.com/flatlaf/>
    JFrame.setDefaultLookAndFeelDecorated(true);
    JDialog.setDefaultLookAndFeelDecorated(true);
    FlatDarkLaf.install();
    
    //  Crear la ventana principal y pasarle una lista de propiedades vacía
    ListaPropiedad datos = new ListaPropiedad();
    VentanaPrincipal gui = new VentanaPrincipal(datos);
    gui.setVisible(true);
    
    //  Centrar la ventana
    gui.setLocationRelativeTo(null);
    
  }
  
}
