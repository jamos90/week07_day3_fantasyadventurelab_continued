package Players;

import Players.Magic.Warlock;
import Players.Magic.Wizard;
import Skills.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Spell spell1;
    Spell spell2;
    Spell spell3;
    Wizard wizard;

    @Before
    public void setUp(){
        spell1 = new Spell("Fireball", "Burn", 40);
        spell2 = new Spell("Lightning Strike", "Electricution", 50);
        spell3 = new Spell("Whirlwind", "Drown", 60);
        wizard = new Wizard("Dumbledore", 100, spell1);
    }

    @Test
    public void hasName(){
        assertEquals("Dumbledore", wizard.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(100, wizard.getHP());
    }

    @Test
    public void hasSpell(){
        assertEquals("Fireball", wizard.getSpellName());
    }

    @Test
    public void canChangeSpell(){
        wizard.changeSpell(spell2);
        assertEquals("Lightning Strike", wizard.getSpellName());
    }

    @Test
    public void canIncreaseSpellDamage(){
        wizard.spellDamageBonus(spell1,10);
        assertEquals(50, spell1.getDamage());
    }

}
