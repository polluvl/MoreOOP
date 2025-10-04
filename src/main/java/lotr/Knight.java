package lotr;
import java.util.Random;

import KickStrategy.NobelKickStrategy;

public class Knight extends Character {

    public Knight() {
        super(new Random().nextInt(7) + 5, new Random().nextInt(7) + 5, new NobelKickStrategy());
    }

}
