package mvc.model;

import entity.live.enemies.Enemy;
import entity.live.heroes.Hero;
import factory.EntityFactory;
import factory.Level;
import mvc.model.fightstyle.ClassicFight;
import mvc.model.fightstyle.Fight;
import mvc.observer.BasicObservable;
import mvc.observer.Observable;
import mvc.observer.Observer;

public class ClassicFightModel implements FightModel, Observable {

    private final Hero hero;
    private final Enemy enemy;
    private final Fight fight;
    private final Observable fightObservable;

    public ClassicFightModel(Level level) {
        EntityFactory entityCreator = EntityFactory.parseFactory(level);
        this.hero = entityCreator.getHero();
        this.enemy = entityCreator.getEnemy();
        this.fight = new ClassicFight(hero, enemy);
        this.fightObservable = new BasicObservable();
    }

    @Override
    public void fightEntities() {
        fight.fightEntities();
        fightObservable.notifyObservers();
    }

    @Override
    public double getHeroLife() {
        return hero.percentageLife();
    }

    @Override
    public double getEnemyLife() {
        return enemy.percentageLife();
    }

    @Override
    public String getEnemyPath() {
        return enemy.getImagePath();
    }

    @Override
    public String getHeroPath() {
        return hero.getImagePath();
    }

    @Override
    public void addObserver(Observer observer) {
        fightObservable.addObserver(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        fightObservable.deleteObserver(observer);
    }

    @Override
    public void notifyObservers() {
        fightObservable.notifyObservers();
    }

    @Override
    public void deleteObserver(int index) {
        fightObservable.deleteObserver(index);
    }

}
