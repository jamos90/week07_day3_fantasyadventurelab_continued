package Skills;

import Skills.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class WeaponTest {

    Weapon weapon1;
    Weapon weapon2;
    Weapon weapon3;

    @Before
    public void setUp(){
        weapon1 = new Weapon("Stinger","Sword", 20);
        weapon2 = new Weapon("Chopper","Axe",40);
        weapon3 = new Weapon("Smasher","Hammer",60);
    }

    @Test
    public void hasName(){
        assertEquals("Stinger", weapon1.getName());
    }

    @Test
    public void hasType(){
        assertEquals("Axe", weapon2.getType());
    }

    @Test
    public void hasDamage(){
        assertEquals(60, weapon3.getDamage());
    }

    @Test
    public void canIncreaseWeaponDamage(){
        weapon1.increaseDamage(10);
        assertEquals(30,weapon1.getDamage());
    }

    @Test
    public void canDealDoubleDamage(){
        weapon1.doubleDamage();
        assertEquals(40,weapon1.getDamage());
    }



}
