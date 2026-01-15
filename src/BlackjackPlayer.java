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

    public String getName() {
        return name;
    }

    public void addCard(Card newCard) {
        hand.add(newCard);
    }

    //scoring - 2-10 cards are worth their value
    //j, q, k are worth 10
    //ace is 1 or 11, whichever is more beneficial for
    //the player's score
    //goal - get as close to 21 as possible without going over
    public int getScore() {
        int score = 0;
        int aces = 0;
        for (int i = 0; i < hand.size(); i++) {
            Card current = hand.get(i);
            int val = current.getValue();
            if (val >= 2 && val <= 10) {
                score += val;
            }
            else if (val > 10) {
                score += 10;
            }
            else { //ace
                //wait until the rest of the cards scores are counted
                //before determining whether each ace is worth 1 or 11
                aces++;
            }

        }

        //determine the values of any aces
        if (aces >= 1) {

            //for more than one ace, all others should only count as 1
            //in order to stay under 21
            score += (aces - 1);


            //for the remaining ace, determine whether 1 or 11 is better
            //for score
            if (score + 11 > 21) {
                score += 1;
            }
            else {
                score += 11;
            }

        }


        return score;
    }

    public String toString() {
        return "Name: " + name +
                "\nScore: " + getScore() +
                "\nHand: " + hand;
    }
}
