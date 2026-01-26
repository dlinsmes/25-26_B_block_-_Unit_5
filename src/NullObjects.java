public class NullObjects {
    public static void main(String [] args) {
        Deck d = new Deck();

        //go through the deck and print the rank of every
        //card in the deck

        for (int i = 0; i < 52; i++) {
            Card c = d.draw();
            System.out.println(c.getRank());
        }

        //in the loop - all 52 cards from the deck have been drawn

        //CAN save an object as null
        Card next = d.draw();

        if (next != null) {

            //can't call a method from a null object
            String nextRank = next.getRank();
            System.out.println(nextRank);
        }
    }
}
