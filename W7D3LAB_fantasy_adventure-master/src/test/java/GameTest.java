import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    Game game;

    @Before
    public void setUp(){
        game = new Game();
    }

    @Test
    public void dungeonsStartEmpty(){
        assertEquals(0,game.getDungeonCount());
    }

    @Test
    public void partyStatsEmpty(){
        assertEquals(0,game.getPartyCount());
    }
}
