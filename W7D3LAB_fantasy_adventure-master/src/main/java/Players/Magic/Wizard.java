package Players.Magic;

import Behaviours.IMagic;
import Players.Player;
import Skills.Spell;

public class Wizard extends Player implements IMagic {

    protected Spell spell;

    public Wizard(String name, int hp, int pot, Spell spell){
        super(name, hp, pot);
        this.spell = spell;
    }

    public String getSpellName() {
        return this.spell.getName();
    }

    public void changeSpell(Spell spell){
        this.spell = spell;
    }

    public void spellDamageBonus(Spell spell, int damageBonus){
       spell.increaseDamage(damageBonus);
    }

}
