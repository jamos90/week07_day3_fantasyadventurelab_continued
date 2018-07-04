import Players.Fighters.Knight;
import Players.Player;
import Skills.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    Game game;
    Player player1;
    Weapon weapon;

    @Before
    public void setUp(){
        weapon = new Weapon("Smasher","Hammer",30);
        player1 = new Knight("Allan",100,weapon);
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

    @Test
    public void canAddToPary(){
        game.addToParty(player1);
        assertEquals(1,game.getPartyCount());
    }
}
