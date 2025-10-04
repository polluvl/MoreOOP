package lotr;

import kickstrategy.CryStrategy;

public class Hobbit extends Character{
    public Hobbit() {
        super(3, 0, new CryStrategy());
    }


    @Override
    public String toString() {
        return "Hobbit{" + "hp=" + getHp() + ", power=" + getPower() + '}';
    }
}
