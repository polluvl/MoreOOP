package lotr;
import java.util.Random;

import kickstrategy.NobelPower;


public class King extends Character {

    public King() {
        super(new Random().nextInt(10) + 5, new Random().nextInt(10) + 5, new NobelPower());
    }

    @Override
    public String toString() {
        return "King{" + "hp=" + getHp() + ", power=" + getPower() + '}';
    }

}
