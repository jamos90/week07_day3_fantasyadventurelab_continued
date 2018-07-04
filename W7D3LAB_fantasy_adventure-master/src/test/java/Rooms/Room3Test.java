package Rooms;

import RoomContents.Enemy;
import RoomContents.Treasure;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Room3Test {

        Room3 room3;
        Enemy enemy;
        Treasure treasure;

        @Before
        public void setUp() {
            enemy = new Enemy("Collecter 933", "Collector",60,20,4);
            enemy = new Enemy("Collecter 933", "Collector",60,20,4);
            treasure = new Treasure("Diamod Ring","Ring",4,3);
            room3 = new Room3("The Flamin' Forest", "Forest", 7, enemy, treasure);
        }


        @Test
        public void hasName(){
            assertEquals("The Flamin' Forest", room3.getName());
        }
}
