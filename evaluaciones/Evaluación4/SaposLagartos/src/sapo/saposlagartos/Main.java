package sapo.saposlagartos;

import com.formdev.flatlaf.FlatDarkLaf;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.swing.JDialog;
import javax.swing.JFrame;
import sapo.saposlagartos.gui.LoginForm;

/**
 *
 * @author MisaoDev <https://github.com/MisaoDev>
 */
public class Main {
  
  private static Properties appConfig;
  public static DaoPlayer dao;
  
  private static void loadConfig() {
    appConfig = new Properties();
    String file = "config.ini";
    
    try (InputStream is = new FileInputStream(file)) {
      appConfig.load(is);
    } catch (IOException e) {
    }
  }
  
  public static String getConfig(String key) {
    return appConfig.getProperty(key);
  }
  
  private static void startApp() {
    
    //  Establecer el Look & Feel del programa con FlatLaf <https://www.formdev.com/flatlaf/>
    JFrame.setDefaultLookAndFeelDecorated(true);
    JDialog.setDefaultLookAndFeelDecorated(true);
    FlatDarkLaf.install();
    
    //  Iniciar la ventana principal
    LoginForm gui = new LoginForm();
    gui.setLocationRelativeTo(null);
    gui.setVisible(true);
    
  }
  
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    loadConfig();
    startApp();
  }
  
}
