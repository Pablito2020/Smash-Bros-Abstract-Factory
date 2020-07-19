package mvc.model;

public interface FightModel extends Model {

    void fightEntities();

    double getHeroLife();

    double getEnemyLife();

    String getEnemyPath();

    String getHeroPath();

}
