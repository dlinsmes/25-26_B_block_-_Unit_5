import java.util.ArrayList;

public class BlackjackPlayer {

    private String name;
    private ArrayList<Card> hand;

    public BlackjackPlayer(String name) {
        this.name = name;

        //important - need to call the constructor
        //for arraylist to be able to use the list to
        //add items
        hand = new ArrayList<Card> ();
    }

    public void addCard(Card newCard) {
        hand.add(newCard);
    }

    public int getScore() {
        //update later
        return 0;
    }

    public String toString() {
        return "Name: " + name +
                "\nScore: " + getScore() +
                "\nHand: " + hand;
    }
}
