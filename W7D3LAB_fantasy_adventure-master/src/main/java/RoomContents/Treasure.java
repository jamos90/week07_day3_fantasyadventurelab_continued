package RoomContents;

public class Treasure {

    protected String name;
    protected String type;
    protected int value;
    protected int rarity;

    public Treasure(String name, String type, int value, int rarity){
        this.name = name;
        this.type = type;
        this.value = value;
        this.rarity = rarity;
    }

    public String getName() {
        return this.name;
    }

    public int getValue() {
        return this.value;
    }
}
