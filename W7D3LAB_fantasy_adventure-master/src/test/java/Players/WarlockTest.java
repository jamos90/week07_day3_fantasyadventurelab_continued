package Players;

import Players.Magic.Warlock;
import Skills.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Spell spell1;
    Spell spell2;
    Spell spell3;
    Warlock warlock;

    @Before
    public void setUp(){
        spell1 = new Spell("Fireball", "Burn", 40);
        spell2 = new Spell("Lightning Strike", "Electricution", 50);
        spell3 = new Spell("Whirlwind", "Drown", 60);
        warlock = new Warlock("Walter", 95, 0, spell1);
    }

    @Test
    public void hasName(){
        assertEquals("Walter", warlock.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(95, warlock.getHP());
    }

    @Test
    public void hasSpell(){
        assertEquals("Fireball", warlock.getSpellName());
    }

    @Test
    public void canChangeSpell(){
        warlock.changeSpell(spell2);
        assertEquals("Lightning Strike", warlock.getSpellName());
    }



}
