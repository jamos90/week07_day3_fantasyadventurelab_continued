package Skills;

import Players.Fighters.Knight;
import Players.Player;
import Skills.Restoration;
import Skills.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RestorationTest {

    Restoration restoration;
    Knight knight;
    Weapon weapon;


    @Before
    public void setUp(){
        weapon = new Weapon("Smasher","Hammer",34);
        knight = new Knight("Sir Amos",40, weapon);
        restoration = new Restoration("Restore","Potion", -25);

    }

    @Test
    public void hasName(){
        assertEquals("Restore", restoration.getName());
    }

    @Test
    public void hasType(){
        assertEquals("Potion", restoration.getType());
    }

    @Test
    public void hasDamage(){
        assertEquals(-25, restoration.getDamage());
    }

    }

