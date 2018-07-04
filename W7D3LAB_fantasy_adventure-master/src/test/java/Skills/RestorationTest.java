package Skills;

import Skills.Restoration;
import Skills.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RestorationTest {

    Restoration restoration;


    @Before
    public void setUp(){
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
