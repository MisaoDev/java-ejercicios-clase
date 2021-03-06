package sapo.saposlagartos.game;

/**
 *
 * @author MisaoDev <https://github.com/MisaoDev>
 */
public class Stats {
  
  private int strength;
  private int vitality;
  private int intelligence;
  private int agility;
  private int dexterity;
  private int luck;
  private int currentLevel;
  private int experience;
  private int eqWeapon;
  private int eqShield;
  private int eqArmor;

  public Stats(int strength, int vitality, int intelligence, int agility, int dexterity, int luck, int currentLevel, int experience, int eqWeapon, int eqShield, int eqArmor) {
    this.strength = strength;
    this.vitality = vitality;
    this.intelligence = intelligence;
    this.agility = agility;
    this.dexterity = dexterity;
    this.luck = luck;
    this.currentLevel = currentLevel;
    this.experience = experience;
    this.eqWeapon = eqWeapon;
    this.eqShield = eqShield;
    this.eqArmor = eqArmor;
  }

  public Stats() {
    this(1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0);
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

  public int getCurrentLevel() {
    return currentLevel;
  }

  public void setCurrentLevel(int currentLevel) {
    this.currentLevel = currentLevel;
  }

  public int getExperience() {
    return experience;
  }

  public void setExperience(int experience) {
    this.experience = experience;
  }

  public int getEqWeapon() {
    return eqWeapon;
  }

  public void setEqWeapon(int eqWeapon) {
    this.eqWeapon = eqWeapon;
  }

  public int getEqShield() {
    return eqShield;
  }

  public void setEqShield(int eqShield) {
    this.eqShield = eqShield;
  }

  public int getEqArmor() {
    return eqArmor;
  }

  public void setEqArmor(int eqArmor) {
    this.eqArmor = eqArmor;
  }
  
  
  
}
