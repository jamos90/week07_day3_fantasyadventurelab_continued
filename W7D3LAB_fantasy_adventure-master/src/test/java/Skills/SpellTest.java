package Skills;

import Skills.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellTest {

    Spell spell1;
    Spell spell2;
    Spell spell3;

    @Before
    public void setUp(){
        spell1 = new Spell("Fireball", "Burn", 40);
        spell2 = new Spell("Lightning Strike", "Electricution", 50);
        spell3 = new Spell("Whirlwind", "Drown", 60);
    }

    @Test
    public void hasName(){
        assertEquals("Fireball", spell1.getName());
    }

    @Test
    public void increaseSpellDamage(){
        spell1.increaseDamage(10);
        assertEquals(50,spell1.getDamage());
    }


}
