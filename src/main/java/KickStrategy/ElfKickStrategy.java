package KickStrategy;
import lotr.Character;


public class ElfKickStrategy implements KickStrategy{
    @Override
    public void kick(Character kicker, Character c){
        if (kicker.getPower() > c.getPower()){
            c.setHp(0);
        }
        else{
            c.setPower(c.getPower()-1);
        }
    }
}
