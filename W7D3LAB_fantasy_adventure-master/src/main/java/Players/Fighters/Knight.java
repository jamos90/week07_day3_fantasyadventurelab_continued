package Players.Fighters;

import Behaviours.IWeapon;
import Skills.Weapon;

public class Knight extends Players.Player implements IWeapon {

    protected Weapon weapon;

    public Knight(String name, int hp, Weapon weapon){
        super(name, hp);
        this.weapon = weapon;
    }

    public String getWeaponName() {
        return this.weapon.getName();
    }

    public void changeWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void protectiveArmour(int hpBoost){
        this.hp += hpBoost;
    }
}
