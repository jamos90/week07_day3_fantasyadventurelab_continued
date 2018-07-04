package Players;

import Players.Fighters.Dwarf;
import Skills.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {
    Dwarf dwarf;
    Weapon weapon1;
    Weapon weapon2;

    @Before
    public void setUp(){
        weapon1 = new Weapon("Smasher","Sword",20);
        weapon2 = new Weapon("Stabber","Sword",40);
        dwarf = new Dwarf("Gimli", 80, weapon1);
    }

    @Test
    public void hasName(){
        assertEquals("Gimli", dwarf.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(80, dwarf.getHP());
    }

    @Test
    public void hasWeapon(){
        assertEquals("Smasher", dwarf.getWeaponName());
    }

    @Test
    public void canChangeWeapon(){
        dwarf.changeWeapon(weapon2);
        assertEquals("Stabber", dwarf.getWeaponName());
    }


}
