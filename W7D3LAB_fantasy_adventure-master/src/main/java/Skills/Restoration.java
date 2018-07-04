package Skills;

import Players.Player;

public class Restoration extends Skill {

    public Restoration(String name, String type, int damage){
        super(name,type,damage);
    }

    public void heal(Player player){
        player.hp -= this.damage;

    }
}
