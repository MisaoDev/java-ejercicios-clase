package sapo.saposlagartos;

import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import org.apache.commons.codec.digest.DigestUtils;
import sapo.saposlagartos.game.Player;

/**
 *
 * @author MisaoDev <https://github.com/MisaoDev>
 */
public class DaoPlayer extends Dao {

  public DaoPlayer() {
    super();
  }
  
  public boolean exists(String name) {
    Connection conn = null;
    PreparedStatement stmt = null;
    
    try {
      conn = getConnection();
      stmt = conn.prepareStatement("SELECT name FROM player WHERE name = ?");
      stmt.setString(1, name);
      
      ResultSet rs = stmt.executeQuery();
      return rs.next();
      
    } catch (Exception e) {
      throw new RuntimeException(e);
      
    } finally {
      close(stmt);
      close(conn);
    }
  }
  
  public Player getPlayer(String name) {
    Connection conn = null;
    PreparedStatement stmt = null;
    
    try {
      conn = getConnection();
      stmt = conn.prepareStatement("SELECT user_rank, coins, premium_coins FROM player WHERE name = ?");
      stmt.setString(1, name);
      
      ResultSet rs = stmt.executeQuery();
      if (rs.next()) {
        Player p = new Player();
        p.setName(name);
        p.setRank(rs.getInt("user_rank"));
        p.setZeni(rs.getLong("coins"));
        p.setCash(rs.getInt("premium_coins"));
        return p;
        
      } else {
        return null;
      }
      
    } catch (Exception e) {
      throw new RuntimeException(e);
      
    } finally {
      close(stmt);
      close(conn);
    }
  }
  
  /**
   * 
   * @param name              Nombre del usuario
   * @param enteredPassword   Contraseña ingresada
   * @return      Devuelve -1 si no se encuentra el usuario, 0 si la contraseña es incorrecta y 1 si es correcta
   */
  public int checkPassword(String name, String enteredPassword) {
    Connection conn = null;
    PreparedStatement stmt = null;
    
    try {
      conn = getConnection();
      stmt = conn.prepareStatement("SELECT password_hash, password_salt FROM player WHERE name = ?");
      stmt.setString(1, name);
      
      ResultSet rs = stmt.executeQuery();
      
      if (rs.next()) {
        
        //  Obtener el hash de la contraseña real y la sal de la base de datos
        String hashedPassword = rs.getString("password_hash");
        byte[] salt = rs.getBytes("password_salt");
        
        //  Generar un hash con la contraseña ingresada y la sal, luego compararlo con el hash original
        String hashedEnteredPassword = DigestUtils.sha256Hex(enteredPassword + new String(salt));
        return hashedPassword.equals(hashedEnteredPassword) ? 1 : 0;
        
      } else {
        //  Si no se encuentran datos el usuario no existe
        return -1;
      }
      
    } catch (Exception e) {
      throw new RuntimeException(e);
      
    } finally {
      close(stmt);
      close(conn);
    }
  }
  
  /**
   * Agrega un jugador nuevo a la base de datos.
   * @param name        Nombre del usuario nuevo
   * @param email       Correo electrónico
   * @param password    Contraseña del usuario en texto plano
   */
  public void insert(String name, String email, String password) {
    Connection conn = null;
    PreparedStatement stmt = null;
    
    try {
      conn = getConnection();
      
      //  Generar la sal
      byte[] salt = new byte[16];
      Random rng = new SecureRandom();
      rng.nextBytes(salt);
      
      //  Generar un hash con la contraseña y la sal
      String hashedPassword = DigestUtils.sha256Hex(password + new String(salt));
      
      stmt = conn.prepareStatement("INSERT INTO player(name, email, password_salt, password_hash) VALUES(?, ?, ?, ?)");
      stmt.setString(1, name);
      stmt.setString(2, email);
      stmt.setBytes(3, salt);
      stmt.setString(4, hashedPassword);
      
      stmt.executeUpdate();
      
    } catch (SQLException e) {
      System.out.println(e.getErrorCode());
      
    } catch (Exception e) {
      throw new RuntimeException(e);
      
    } finally {
      close(stmt);
      close(conn);
    }
  }
  
  /**
   * Actualiza los datos de la cuenta del jugador.
   * @param name        Nombre
   * @param email       Correo electrónico
   * @param password    Contraseña nueva en texto plano
   */
  public void update(String name, String email, String password) {
    Connection conn = null;
    PreparedStatement stmt = null;
    
    try {
      conn = getConnection();
      
      //  Generar la sal
      byte[] salt = new byte[16];
      Random rng = new SecureRandom();
      rng.nextBytes(salt);
      
      //  Generar un hash con la contraseña y la sal
      String hashedPassword = DigestUtils.sha256Hex(password + new String(salt));
      
      stmt = conn.prepareStatement(
              "UPDATE player "
            + "SET name = ?, email = ?, password_salt = ?, password_hash = ? "
            + "WHERE name = ?");
      stmt.setString(1, name);
      stmt.setString(2, email);
      stmt.setBytes (3, salt);
      stmt.setString(4, hashedPassword);
      stmt.setString(5, name);
      
      stmt.executeUpdate();
      
    } catch (Exception e) {
      throw new RuntimeException(e);
      
    } finally {
      close(stmt);
      close(conn);
    }
  }
  
  /**
   * Actualiza los datos de juego del jugador.
   * @param player 
   */
  public void update(Player player) {
    Connection conn = null;
    PreparedStatement stmt = null;
    
    try {
      conn = getConnection();
      
      stmt = conn.prepareStatement("UPDATE player SET rank = ?, zeni = ?, cash = ? WHERE name = ?");
      stmt.setInt(1, player.getRank());
      stmt.setLong(2, player.getZeni());
      stmt.setInt(3, player.getCash());
      stmt.setString(4, player.getName());
      
      stmt.executeUpdate();
      
    } catch (Exception e) {
      throw new RuntimeException(e);
      
    } finally {
      close(stmt);
      close(conn);
    }
  }
  
  public void delete(String name) {
    Connection conn = null;
    PreparedStatement stmt = null;
    
    try {
      conn = getConnection();
      
      stmt = conn.prepareStatement("DELETE FROM player WHERE name = ?");
      stmt.setString(1, name);
      
      stmt.executeUpdate();
      
    } catch (Exception e) {
      throw new RuntimeException(e);
      
    } finally {
      close(stmt);
      close(conn);
    }
  }
  
}
