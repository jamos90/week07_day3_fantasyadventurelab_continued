package Players;

import Players.Fighters.Knight;
import Players.Healers.Cleric;
import Players.Magic.Wizard;
import Skills.Restoration;
import Skills.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class ClericTest {

    Cleric cleric;
    Knight knight;
    Restoration restoration1;
    Restoration restoration2;
    Weapon weapon;

    @Before
    public void setUp(){
        restoration1 = new Restoration("Restoration","Healing",-50);
        restoration2 = new Restoration("Minor Restoration","Healing",-30);
        cleric = new Cleric("Dr. James", 100, 0, restoration1);
        weapon = new Weapon("Stabber", "Sword",34);
        knight = new Knight("Sir David",50, weapon,0);
    }

    @Test
    public void hasName(){
        assertEquals("Dr. James", cleric.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(100, cleric.getHP());
    }

    @Test
    public void hasPotion(){
        assertEquals("Restoration", cleric.getPotionName());
    }

    @Test
    public void canChangeWeapon(){
        cleric.changePotion(restoration2);
        assertEquals("Minor Restoration", cleric.getPotionName());
    }

    @Test
    public void canHealPlayers(){
        cleric.heal(knight);
        assertEquals(100, knight.getHP());

    }

}
