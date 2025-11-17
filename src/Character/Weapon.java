package Character;

public class Weapon {
    String name;
    int wDamage;

    public Weapon(String name, int wDamage){
        this.name = name;
        this.wDamage = wDamage;
    }

    public String getName(){ return name; }
    // public String getwpDamage(){ return wDamage; }
}