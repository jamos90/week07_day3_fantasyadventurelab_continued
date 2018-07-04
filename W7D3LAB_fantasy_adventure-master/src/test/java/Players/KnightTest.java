package Players;

import Players.Fighters.Knight;
import Skills.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


    public class KnightTest {
        Knight knight;
        Weapon weapon1;
        Weapon weapon2;

        @Before
        public void setUp(){
            weapon1 = new Weapon("Smasher","Sword",20);
            weapon2 = new Weapon("Stabber","Sword",40);
            knight = new Knight("Sir Galahad", 70, weapon1);
        }

        @Test
        public void hasName(){
            assertEquals("Sir Galahad", knight.getName());
        }

        @Test
        public void hasHP(){
            assertEquals(70, knight.getHP());
        }

        @Test
        public void hasWeapon(){
            assertEquals("Smasher", knight.getWeaponName());
        }

        @Test
        public void canChangeWeapon(){
            knight.changeWeapon(weapon2);
            assertEquals("Stabber", knight.getWeaponName());
        }

        @Test
        public void armourIncreasesHP(){
            knight.protectiveArmour(10);
            assertEquals(80,knight.getHP());
        }

    }


