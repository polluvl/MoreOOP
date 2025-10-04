package lotr;

import KickStrategy.HobbitStrategy;

public class Hobbit extends Character{
    public Hobbit(int power, int hp) {
        super(10, 10, new HobbitStrategy());
    }
}
