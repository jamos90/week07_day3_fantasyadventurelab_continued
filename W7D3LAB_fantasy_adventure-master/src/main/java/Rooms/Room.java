package Rooms;

import Players.Player;
import RoomContents.Enemy;
import RoomContents.Treasure;

import java.util.ArrayList;

public class Room {

    protected String name;
    protected String type;
    protected int difficulty;
    protected ArrayList<Player> players;
    protected Enemy enemy;
    protected Treasure treasure;

    public Room(String name, String type, int difficulty, Enemy enemy, Treasure treasure){
        this.name = name;
        this.type = type;
        this.difficulty = difficulty;
        this.players = new ArrayList<Player>();
        this.enemy = enemy;
        this.treasure = treasure;
    }


    public String getName() {
        return this.name;
    }

    public String getEnemyType() {
        return this.enemy.hasName();
    }

    public int getTreasureValue(){
        return this.treasure.getValue();
    }
}
