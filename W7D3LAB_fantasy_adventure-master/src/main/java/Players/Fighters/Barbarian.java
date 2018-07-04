package Players.Fighters;

import Behaviours.IWeapon;
import Skills.Weapon;

public class Barbarian extends Players.Player implements IWeapon {

    private Weapon weapon;

    public Barbarian(String name, int hp, Weapon weapon){
        super(name,hp);
        this.weapon = weapon;
    }

    public void changeWeapon(Weapon weapon){
        this.weapon = weapon;

    }

    public String getWeaponName() {
        return this.weapon.getName();
    }

    public void overHeadSmash(){
        this.weapon.doubleDamage();
    }
}
