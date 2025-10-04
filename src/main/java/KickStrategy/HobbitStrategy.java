package kickstrategy;
import lotr.Character;

public class HobbitStrategy implements KickStrategy{
    @Override
    public void kick(Character kicker, Character c){
        System.out.println("Cry...");
    }
}
