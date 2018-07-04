package Players;

import Players.Fighters.Barbarian;
import Skills.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class BarbarianTest {

        Barbarian barbarian;
        Weapon weapon1;
        Weapon weapon2;

        @Before
        public void setUp(){
            weapon1 = new Weapon("Stinger", "Sword", 4);
            weapon2 = new Weapon("Smasher", "Hammer", 6);
            barbarian = new Barbarian("Conan", 90, weapon1);
        }

        @Test
        public void hasName(){
            assertEquals("Conan", barbarian.getName());
        }

        @Test
        public void hasHP(){
            assertEquals(90, barbarian.getHP());
        }

        @Test
        public void hasWeapon(){
            assertEquals("Stinger", barbarian.getWeaponName());
        }

        @Test
        public void canChangeWeapon(){
            barbarian.changeWeapon(weapon2);
            assertEquals("Smasher", barbarian.getWeaponName());
        }

        @Test
        public void overHeadSmashDealsDoubleDamage(){
            barbarian.overHeadSmash();
            assertEquals(8,weapon1.getDamage());
        }


    }






