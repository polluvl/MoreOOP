package lotr;
import KickStrategy.KickStrategy;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Character {
    private int hp;
    private int power;
    private KickStrategy kick;

    public boolean isAlive(){
        return hp > 0;
    }

    
    public int getHp(){
        return this.hp;
    }
    
    public void setHp(int hp){
        if (hp < 0){
            throw new IllegalArgumentException("HP cannot be negative!");
        }
        else{
            this.hp = hp;
        }
    }
    
    public int getPower(){
        return this.power;
    }
    
    public void setPower(int p){
        this.power = p;
    }
    public void kick(Character c){
        kick.kick(this, c);
    };
}
