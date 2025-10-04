package kickstrategy;
import java.util.Random;

import lombok.AllArgsConstructor;
import lombok.Data;
import lotr.Character;

@Data
@AllArgsConstructor
public class NobelKickStrategy implements KickStrategy{
    @Override
    public void kick(Character kicker, Character c){
        int enemy_hp = c.getHp();
        c.setHp(enemy_hp- new Random().nextInt(kicker.getHp() + 1));
    }
}
