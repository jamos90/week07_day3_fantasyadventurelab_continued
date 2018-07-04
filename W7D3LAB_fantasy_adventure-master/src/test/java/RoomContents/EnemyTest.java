package RoomContents;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Enemy enemy;

    @Before
    public void setUp(){
        enemy = new Enemy("Kreature", "Ogre", 80, 30, 7);
    }

    @Test
    public void hasName(){
        assertEquals("Kreature", enemy.hasName());
    }

    @Test
    public void hasDamage(){
        assertEquals(30, enemy.hasDamage());
    }

}
