public class CardClient {

    public static void main(String [] args) {

        //Queen of clubs
        Card c1 = new Card("clubs", 12);
        System.out.println(c1);

        System.out.println();

        Deck d = new Deck();
        System.out.println(d);

        System.out.println();

        d.shuffle();
        System.out.println(d);


        //draw 5 cards from the deck
        //and print them out
        System.out.println();

        for (int i = 0; i < 5; i++) {
            Card c = d.draw();
            System.out.println(c);
        }

    }
}
