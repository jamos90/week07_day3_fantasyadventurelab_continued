import Players.Player;
import Rooms.Room;

import java.util.ArrayList;

public class Game {

    protected ArrayList<Player> party;
    protected ArrayList<Room> dungeons;

    public Game(){
        party = new ArrayList<>();
        dungeons = new ArrayList<>();
    }


    public int getDungeonCount() {
        return this.dungeons.size();
    }

    public int getPartyCount() {
        return this.party.size();
    }

    public void addToParty(Player player) {
        this.party.add(player);
    }

    public void addToDungeon(Room room) {
        this.dungeons.add(room);
    }

    public Room getRoom(){
        return dungeons.get(0);

    }
}
