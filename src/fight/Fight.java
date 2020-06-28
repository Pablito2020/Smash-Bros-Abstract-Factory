package fight;

import acm.program.GraphicsProgram;
import entity.heroes.Hero;
import entity.enemies.Enemy;
public class Fight {

    private GraphicsProgram applicationContext;
    private Hero hero;
    private Enemy enemy;

    public Fight(GraphicsProgram applicationContext, Hero hero, Enemy enemy) {
        this.applicationContext = applicationContext;
        this.hero = hero;
        this.enemy = enemy;
    }

    public void showInfoPlayers() { 
        System.out.println("Fight between " + hero.getName() + " and " + enemy.getName() + " is going to start!");
        System.out.println("[" + hero.getName() + "] " + "life: " + hero.percentageLife());
        System.out.println("[" + enemy.getName() + "] " + "life: " + enemy.percentageLife());
    }

    public void fightPlayers() {
        while(!enemy.hasDied() && !hero.hasDied()) {
            executeFight();
        }
    }

    private void executeFight() {
        enemy.attack(hero);
        System.out.println(hero.percentageLife());
        hero.attack(enemy);
        System.out.println(enemy.percentageLife());
        applicationContext.pause(1000);
    }

}
