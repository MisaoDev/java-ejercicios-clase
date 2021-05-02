package sapo.saposlagartos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author MisaoDev <https://github.com/MisaoDev>
 */
public class Dao {
  
  protected String dbURL;
  protected String dbDatabase;
  protected String dbUser;
  protected String dbPass;
  
  public Dao() {
    dbURL       = Main.getConfig("database.url");
    dbDatabase  = Main.getConfig("database.database");
    dbUser      = Main.getConfig("database.user");
    dbPass      = Main.getConfig("database.password");
  }
  
  protected Connection getConnection() {
    try {
      return DriverManager.getConnection(dbURL + dbDatabase, dbUser, dbPass);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
  
  protected void close(Connection conn) {
    if (conn != null) {
      try {
        conn.close();
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
  }
  
  protected void close(Statement stmt) {
    if (stmt != null) {
      try {
        stmt.close();
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
  }
  
}
