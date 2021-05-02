package sapo.saposlagartos.game;

import com.sun.istack.internal.Nullable;

/**
 *
 * @author MisaoDev <https://github.com/MisaoDev>
 */
public class Character {
  
  private Player player;
  private String name;
  private Stats stats;
  private int characterClass;
  private Inventory inventory;

  public Character(Player player, String name, Stats stats, int characterClass, @Nullable Inventory inventory) {
    this.player = player;
    this.name = name;
    this.stats = stats;
    this.characterClass = characterClass;
    this.inventory = (inventory != null) ? inventory : new Inventory();
  }

  public Player getPlayer() {
    return player;
  }

  public void setPlayer(Player player) {
    this.player = player;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Stats getStats() {
    return stats;
  }

  public void setStats(Stats stats) {
    this.stats = stats;
  }

  public int getCharacterClass() {
    return characterClass;
  }

  public void setCharacterClass(int characterClass) {
    this.characterClass = characterClass;
  }

  public Inventory getInventory() {
    return inventory;
  }

  public void setInventory(Inventory inventory) {
    this.inventory = inventory;
  }
  
}
