package RoomContents;

public class Enemy {
    protected String name;
    protected String type;
    protected int hp;
    protected int damage;
    protected int difficulty;

    public Enemy(String name, String type, int hp, int damage, int difficulty){
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.damage = damage;
        this.difficulty = difficulty;
    }

    public String hasName() {
        return this.name;
    }

    public int hasDamage() {
        return this.damage;
    }
}
