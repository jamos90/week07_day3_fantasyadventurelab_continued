package Rooms;

import RoomContents.Enemy;
import RoomContents.Treasure;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Room2Test {


    Room2 room2;
    Enemy enemy;
    Treasure treasure;

    @Before
    public void setUp() {
        enemy = new Enemy("Shrek","Ogre",100,10,3);
        treasure = new Treasure("Dabloons","coins",3,2);
        room2 = new Room2("Upstairs Disaster", "Loft", 3, enemy,treasure );
    }

    @Test
    public void hasName(){
        assertEquals("Upstairs Disaster", room2.getName());
    }

    @Test
    public void hasEnemy(){
        assertEquals("Shrek", room2.getEnemyType());
    }
}

