package Players;

import RoomContents.Enemy;
import Skills.Spell;
import Skills.Weapon;

public class Player {

    protected  String name;
    public  int hp;

    public Player(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return this.name;
    }

    public int getHP() {
        return this.hp;
    }

    public void takesDamage(Enemy enemy){
        this.hp -= enemy.hasDamage();

    }

    public int giveDamage(Weapon weapon){
         return weapon.getDamage();
    }
}
