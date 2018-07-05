package Players;

import RoomContents.Enemy;
import Rooms.Room;
import Skills.Spell;
import Skills.Weapon;

public class Player {

    protected  String name;
    public  int hp;
    protected int pot;

    public Player(String name, int hp, int pot){
        this.name = name;
        this.hp = hp;
        this.pot = pot;
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

    public void giveDamage(Enemy enemy, Weapon weapon){
         enemy.takesDamage(weapon);
    }

    public int getPot() {
        return this.pot;
    }

    public void takeTreasue(Room room) {
        this.pot += room.getTreasureValue();
    }
}
