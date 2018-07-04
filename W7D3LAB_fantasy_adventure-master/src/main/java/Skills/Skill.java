package Skills;

public abstract class Skill {
    protected String name;
    protected String type;
    protected int damage;


    public Skill(String name, String type, int damage){
        this.name = name;
        this.type = type;
        this.damage = damage;
    }

    public String getName(){
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public int getDamage() {
        return this.damage;
    }

    public void increaseDamage(int damageIncrease){
        this.damage += damageIncrease;
    }

    public void doubleDamage(){
         int damageIncrease = (this.damage *2);
         this.damage = damageIncrease;

    }
}
