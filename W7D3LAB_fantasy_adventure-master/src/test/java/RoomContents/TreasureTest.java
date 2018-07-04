package RoomContents;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreasureTest {

    Treasure treasure1;
    Treasure treasure2;

    @Before
    public void setUp(){
        treasure1 = new Treasure("Doubloons", "money", 1, 3);
        treasure2 = new Treasure("Ruby", "gem", 3, 8);
    }

    @Test
    public void hasName(){
        assertEquals("Doubloons", treasure1.getName());
    }

    @Test
    public void hasValue(){
        assertEquals(3, treasure2.getValue());
    }


}
