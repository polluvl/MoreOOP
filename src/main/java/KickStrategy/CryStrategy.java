package kickstrategy;
import lotr.Character;

public class CryStrategy implements KickStrategy{
    @Override
    public void kick(Character kicker, Character c){
        System.out.println("Cry...");
    }
}
