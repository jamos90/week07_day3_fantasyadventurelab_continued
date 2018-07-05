package Players;

import Players.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    Player player;

    @Before
    public void setUp(){
        player = new Player("Ben", 100,0);
    }

    @Test
    public void hasName(){
        assertEquals("Ben", player.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(100, player.getHP());
    }



}
