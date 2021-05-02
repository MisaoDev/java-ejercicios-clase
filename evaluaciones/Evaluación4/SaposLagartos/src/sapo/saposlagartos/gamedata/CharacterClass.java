package sapo.saposlagartos.gamedata;

import com.sun.istack.internal.Nullable;
import java.util.ArrayList;

/**
 *
 * @author MisaoDev <https://github.com/MisaoDev>
 */
public class CharacterClass {
  
  private int id;
  private String name;
  private String description;
  private BaseStats stats;
  private ArrayList<ClassSkill> skills;
  
  public CharacterClass(int id, String name, String description, @Nullable BaseStats stats) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.stats = (stats != null) ? stats : new BaseStats();
    this.skills = new ArrayList<ClassSkill> ();
  }
  
  public int getId() {
    return id;
  }
  
  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BaseStats getStats() {
    return stats;
  }

  public void setStats(BaseStats stats) {
    this.stats = stats;
  }
  
  
  
}
