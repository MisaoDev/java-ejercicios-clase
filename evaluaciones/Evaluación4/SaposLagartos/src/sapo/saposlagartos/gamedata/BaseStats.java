package sapo.saposlagartos.gamedata;

/**
 *
 * @author MisaoDev <https://github.com/MisaoDev>
 */
public class BaseStats {
  
  private int strength;
  private int vitality;
  private int intelligence;
  private int agility;
  private int dexterity;
  private int luck;
  
  public BaseStats(int strength, int vitality, int intelligence, int agility, int dexterity, int luck) {
    this.strength = strength;
    this.vitality = vitality;
    this.intelligence = intelligence;
    this.agility = agility;
    this.dexterity = dexterity;
    this.luck = luck;
  }
  
  public BaseStats() {
    this(10, 10, 10, 10, 10, 10);
  }

  public int getStrength() {
    return strength;
  }

  public void setStrength(int strength) {
    this.strength = strength;
  }

  public int getVitality() {
    return vitality;
  }

  public void setVitality(int vitality) {
    this.vitality = vitality;
  }

  public int getIntelligence() {
    return intelligence;
  }

  public void setIntelligence(int intelligence) {
    this.intelligence = intelligence;
  }

  public int getAgility() {
    return agility;
  }

  public void setAgility(int agility) {
    this.agility = agility;
  }

  public int getDexterity() {
    return dexterity;
  }

  public void setDexterity(int dexterity) {
    this.dexterity = dexterity;
  }

  public int getLuck() {
    return luck;
  }

  public void setLuck(int luck) {
    this.luck = luck;
  }
  
  
  
}
