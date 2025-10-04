package lotr;
import java.util.Random;

import kickstrategy.NobelPower;

public class Knight extends Character {

    public Knight() {
        super(new Random().nextInt(7) + 5, new Random().nextInt(7) + 5, new NobelPower());
    }

    @Override
    public String toString() {
        return "Knight{" + "hp=" + getHp() + ", power=" + getPower() + '}';
    }

}
