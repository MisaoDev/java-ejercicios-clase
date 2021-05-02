package sapo.saposlagartos.gamedata;

/**
 *
 * @author MisaoDev <https://github.com/MisaoDev>
 */
public class Item {
  
  private int id;
  private String name;
  private String description;
  private int itemType;
  private boolean stackable;
  private int weight;

  public Item(int id, String name, String description, int itemType, boolean stackable, int weight) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.itemType = itemType;
    this.stackable = stackable;
    this.weight = weight;
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

  public int getItemType() {
    return itemType;
  }

  public void setItemType(int itemType) {
    this.itemType = itemType;
  }

  public boolean isStackable() {
    return stackable;
  }

  public void setStackable(boolean stackable) {
    this.stackable = stackable;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }
  
  
  
}
