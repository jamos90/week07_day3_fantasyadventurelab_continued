package Players.Fighters;

import Behaviours.IWeapon;
import Skills.Weapon;

public class Dwarf extends Players.Player implements IWeapon {

    protected Weapon weapon;

    public Dwarf(String name, int hp, int pot, Weapon weapon){
        super(name, hp, pot);
        this.weapon = weapon;
    }

    public String getWeaponName() {
        return this.weapon.getName();
    }

    public void changeWeapon(Weapon weapon){
        this.weapon = weapon;
    }
}
