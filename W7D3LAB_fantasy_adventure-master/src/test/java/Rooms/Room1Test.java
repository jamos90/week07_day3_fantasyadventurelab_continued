package Rooms;

import RoomContents.Enemy;
import RoomContents.Treasure;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Room1Test {

    Room1 room1;
    Enemy enemy;
    Treasure treasure;

    @Before

    public void setUp() {
        enemy = new Enemy("Sovrign", "Reaper",200,40,9);
        room1 = new Room1("Downstairs Disaster", "Dungeon", 4,enemy,treasure);
    }

    @Test
    public void hasName(){
        assertEquals("Downstairs Disaster", room1.getName());
    }
}
