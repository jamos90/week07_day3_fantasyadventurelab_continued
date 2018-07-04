import Players.Fighters.Knight;
import Players.Player;
import RoomContents.Enemy;
import RoomContents.Treasure;
import Rooms.Room;
import Rooms.Room2;
import Skills.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    Game game;
    Player player1;
    Weapon weapon;
    Room room1;
    Room room2;
    Enemy enemy1;
    Enemy enemy2;
    Treasure treasure;

    @Before
    public void setUp(){
        weapon = new Weapon("Smasher","Hammer",30);
        enemy1 = new Enemy("Sovreign","Reaper",100,40,3);
        enemy1 = new Enemy("Harbinger","Reaper",100,60,6);
        treasure = new Treasure("Dabloons","coins",4,3);
        room1 = new Room("Sad Room","Hard Dungeon",4, enemy1, treasure);
        room2 = new Room("Pain Room","Hard Dungeon",6, enemy2, treasure);
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

    @Test
    public void cannAddtoDungeoun(){
        game.addToDungeon(room1);
        assertEquals(1,game.getDungeonCount());
    }

    @Test
    public void canGetDungeonFromList(){
        game.addToDungeon(room1);
        game.addToDungeon(room2);
        assertEquals(room1,game.getRoom());
    }
}
