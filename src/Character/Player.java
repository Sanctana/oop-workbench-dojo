package Character;

// constructor, encapsulation, toString

public class Player {
    private String name;
    private int level;
    private int health;
    private int mana;

    private Weapon weapon;
    // weapon construct + n its getter
    public Player(String name, int health, int level, int mana){
        this.name = name;
        this.health = health;
        this.level = level;
        this.mana = mana;
    }

    public String getName(){
        return name;
    }
    public int getLevel(){ return level; }
    public int getMana(){ return mana;}
}

