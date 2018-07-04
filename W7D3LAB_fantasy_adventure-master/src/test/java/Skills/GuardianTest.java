package Skills;

import Skills.Guardian;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuardianTest {

    Guardian guardian;

    @Before
    public void setUp(){
        guardian = new Guardian("Flick","Dragon", 5);
    }

    @Test
    public void hasName(){
        assertEquals("Flick", guardian.getName());
    }

    @Test
    public void hasType(){
        assertEquals("Dragon", guardian.getType());
    }

    @Test
    public void hasDamage(){
        assertEquals(5, guardian.getDamage());
    }

}
