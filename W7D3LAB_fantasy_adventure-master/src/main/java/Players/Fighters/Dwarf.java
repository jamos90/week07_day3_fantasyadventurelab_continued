package Players.Fighters;

import Behaviours.IWeapon;
import Skills.Weapon;

public class Dwarf extends Players.Player implements IWeapon {

    protected Weapon weapon;

    public Dwarf(String name, int hp, Weapon weapon){
        super(name, hp);
        this.weapon = weapon;
    }

    public String getWeaponName() {
        return this.weapon.getName();
    }

    public void changeWeapon(Weapon weapon){
        this.weapon = weapon;
    }
}
