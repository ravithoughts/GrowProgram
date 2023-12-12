package collectionspackage;

import java.util.Comparator;

public class Checker implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Players player1 = (Players) o1;
        Players player2 = (Players) o2;

        if (player1.score < player2.score) {
            return 1;
        } else if (player1.score > player2.score) {
            return -1;
        } else {
            return player1.name.compareTo(player2.name);
        }
    }
}