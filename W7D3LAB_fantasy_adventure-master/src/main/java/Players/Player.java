package Players;

import Skills.Spell;

public class Player {

    protected  String name;
    protected  int hp;

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

}
