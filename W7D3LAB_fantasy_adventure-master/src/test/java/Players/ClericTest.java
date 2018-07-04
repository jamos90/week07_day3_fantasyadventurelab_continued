package Players;

import Players.Healers.Cleric;
import Players.Magic.Wizard;
import Skills.Restoration;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Restoration restoration1;
    Restoration restoration2;

    @Before
    public void setUp(){
        restoration1 = new Restoration("Restoration","Healing",-50);
        restoration2 = new Restoration("Minor Restoration","Healing",-30);
        cleric = new Cleric("Dr. James", 100, restoration1);
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

}
