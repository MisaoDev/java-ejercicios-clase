package sapo.saposlagartos.gamedata;

/**
 *
 * @author MisaoDev <https://github.com/MisaoDev>
 */
public class Skill {
  
  private int id;
  private String name;
  private String description;
  private int spConsumption;

  public Skill(int id, String name, String description, int spConsumption) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.spConsumption = spConsumption;
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

  public int getSpConsumption() {
    return spConsumption;
  }

  public void setSpConsumption(int spConsumption) {
    this.spConsumption = spConsumption;
  }
  
  
  
}
