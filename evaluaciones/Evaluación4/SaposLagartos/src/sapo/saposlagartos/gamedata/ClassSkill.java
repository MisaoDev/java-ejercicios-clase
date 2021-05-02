package sapo.saposlagartos.gamedata;

/**
 *
 * @author MisaoDev <https://github.com/MisaoDev>
 */
public class ClassSkill {
  
  private Skill skill;
  private int levelLearned;

  public ClassSkill(Skill skill, int levelLearned) {
    this.skill = skill;
    this.levelLearned = levelLearned;
  }

  public Skill getSkill() {
    return skill;
  }

  public void setSkill(Skill skill) {
    this.skill = skill;
  }

  public int getLevelLearned() {
    return levelLearned;
  }

  public void setLevelLearned(int levelLearned) {
    this.levelLearned = levelLearned;
  }
  
}
