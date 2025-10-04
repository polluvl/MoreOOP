package lotr;

import KickStrategy.ElfKickStrategy;

public class Elf extends Character {

    public Elf(int power, int hp) {
        super(10, 10, new ElfKickStrategy());
    }
}