public class Deck {

    //arrays and objects can be instance variables
    //a deck is composed of 52 cards
    private Card [] cards;

    //keeps track of the current top of the deck
    private int top;

    public Deck() {
        top = 0;

        //set the length of the cards array instance variable
        cards = new Card[52];
        //this sets up the capacity to hold 52 objects, but there
        //aren't any objects saved in the array yet

        int index = 0;

        String [] suits = {"spades", "hearts", "diamonds", "clubs"};
        for (int i = 0; i < suits.length; i++) {
            for (int j = 1; j <= 13; j++) {

                Card c = new Card(suits[i], j);
                cards[index] = c;
                index++;
            }
        }
    }


    public String toString() {
        String output = "";
        for (int i = 0; i < cards.length; i++) {
            output += cards[i].toString() + "\n";
        }
        return output;
    }


    public void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int r = (int) (Math.random() * cards.length);

            Card temp = cards[r];
            cards[r] = cards[i];
            cards[i] = temp;

        }

    }

    //return a Card when you draw from the deck
    public Card draw() {
        if (top < cards.length) {
            Card drawnCard = cards[top];
            top++;
            return drawnCard;
        }
        //make sure you only return a card when top is
        //a valid index
        //otherwise return nothing
        return null;
    }
}
