package Players.Healers;

import Behaviours.IHeal;
import Players.Player;
import Skills.Restoration;

public class Cleric extends Player implements IHeal {

    protected Restoration restoration;

    public Cleric(String name, int hp, Restoration restoration){
        super(name, hp);
        this.restoration = restoration;

    }

    public String getPotionName() {
        return this.restoration.getName();
    }

    public void changePotion(Restoration restoration){
        this.restoration = restoration;
    }
}
