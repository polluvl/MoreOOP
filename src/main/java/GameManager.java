import lotr.Character;

public class GameManager {
    public void fight(Character one, Character two) {
        System.out.println("The fight begins between: " 
                + one.getClass().getSimpleName() + " and " 
                + two.getClass().getSimpleName());

        while (one.isAlive() && two.isAlive()) {
            one.kick(two);
            if (!two.isAlive()) {
                System.out.println("Player " + two.getClass().getSimpleName() +
                        " was defeated. " + one.getClass().getSimpleName() +
                        " celebrates a victory!");
                break;
            }

            two.kick(one);
            if (!one.isAlive()) {
                System.out.println("Player " + one.getClass().getSimpleName() +
                        " was defeated. " + two.getClass().getSimpleName() +
                        " celebrates a victory!");
                break;
            }

            System.out.println("The fight continues...");
        }

        Character winner = one.isAlive() ? one : two;
        System.out.println("The game has ended with the winner: " +
                winner.getClass().getSimpleName());
    }
}
