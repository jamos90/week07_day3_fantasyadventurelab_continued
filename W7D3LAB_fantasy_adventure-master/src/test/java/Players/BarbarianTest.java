package Players;

import Players.Fighters.Barbarian;
import RoomContents.Enemy;
import Skills.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class BarbarianTest {

        Barbarian barbarian;
        Weapon weapon1;
        Weapon weapon2;
        Enemy enemy;

        @Before
        public void setUp(){
            weapon1 = new Weapon("Stinger", "Sword", 40);
            weapon2 = new Weapon("Smasher", "Hammer", 60);
            enemy = new Enemy("Maleficant","Witch",100,40,9);
            barbarian = new Barbarian("Conan", 90, weapon1,0);
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

        @Test
        public void canTakeDamage(){
            barbarian.takesDamage(enemy);
            assertEquals(50,barbarian.getHP());
        }

        @Test
         public void canGiveDamage(){
            enemy.takesDamage(weapon1);
            assertEquals(60, enemy.getHp());
        }



    }






