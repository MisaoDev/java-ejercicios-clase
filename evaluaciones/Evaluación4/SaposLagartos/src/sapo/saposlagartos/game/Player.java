package sapo.saposlagartos.game;

import java.util.ArrayList;

/**
 *
 * @author MisaoDev <https://github.com/MisaoDev>
 */
public class Player {
  
  private String name;
  private int rank;
  private long zeni;
  private int cash;
  private ArrayList<Character> characters;
  
  public Player(String name, int rank, long zeni, int cash) {
    this.name = name;
    this.rank = rank;
    this.zeni = zeni;
    this.cash = cash;
    characters = new ArrayList<Character> ();
  }
  
  public Player(String name) {
    this(name, 0, 0, 0);
  }

  public Player() {
    this("", 0, 0, 0);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRank() {
    return rank;
  }

  public void setRank(int rank) {
    this.rank = rank;
  }

  public long getZeni() {
    return zeni;
  }

  public void setZeni(long zeni) {
    this.zeni = zeni;
  }

  public int getCash() {
    return cash;
  }

  public void setCash(int cash) {
    this.cash = cash;
  }

  public ArrayList<Character> getCharacters() {
    return characters;
  }

  public void setCharacters(ArrayList<Character> characters) {
    this.characters = characters;
  }
  
}
