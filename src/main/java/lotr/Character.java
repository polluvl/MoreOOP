package lotr;
import kickstrategy.KickStrategy;

public abstract class Character {
    private int hp;
    private int power;
    private KickStrategy kick;

    // Manual constructor - replaces @AllArgsConstructor
    public Character(int hp, int power, KickStrategy kick) {
        this.hp = hp;
        this.power = power;
        this.kick = kick;
    }

    public boolean isAlive(){
        return hp > 0;
    }

    public int getHp(){
        return this.hp;
    }

    public void setHp(int hp){
        this.hp = Math.max(0, hp);
    }

    public int getPower(){
        return this.power;
    }

    public void setPower(int p){
        this.power = p;
    }

    public void kick(Character c){
        kick.kick(this, c);
    }
}