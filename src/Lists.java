import java.util.ArrayList;

public class Lists {
    public static void main(String [] args) {

        //arrays - limitation - length can't be
        //changed
        int [] nums = new int [5];

        //arraylists (like lists in csp) - can add or remove
        //items so the size is dynamic
        ArrayList<String> words = new ArrayList<String> ();

        //list is empty to start

        //add() method puts a new value at the end of the list
        words.add("potato"); //index 0
        words.add("hengyi"); //ind 1
        words.add("integer"); //2

        //overloaded add() accepts an index in order to insert
        //a new item in the middle of the list
        //(whatever was at that index previously will get
        //bumped up by one position
        words.add(1, "pumpkin");

        //remove the value at index 0
        words.remove(0);

        //CAN directly print an arraylist
        System.out.println(words);

        //to access just a single value from a list, use
        //.get(index)
        System.out.println(words.get(2));

        //to change/update an existing value, use .set()
        words.set(1, "table");

        System.out.println(words);

        //size() to get how many items are in the list
        System.out.println(words.size());

        //loop through the list and print each value
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }

        System.out.println();

        //for-each loops - same syntax as for arrays
        for (String s: words)
            //s iterates through each value, not each index
            System.out.println(s);

        System.out.println();
        words.add(0, "pumpkin");
        words.add("pumpkin");
        words.add("pumpkin");

        System.out.println(words);

        //use a loop to remove all occurrences of "pumpkin"
        //from the list
        //need to use remove(index) - that's what ap assesses
        //words.remove("pumpkin"); - works but need to be familiar
        //with remove(index)

        //doesn't work bc when you remove from index 0,
        //indexing in the list will automatically update so
        //the second pumpkin is now index 0
        //-but the loop iterates i from 0 to 1 so then the
        //new pumpkin at index 0 won't be checked and won't
        //be removed
//        for (int i = 0; i < words.size(); i++) {
//            if (words.get(i).equals("pumpkin")) {
//                words.remove(i);
//            }
//        }
//
//        System.out.println(words);

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equals("pumpkin")) {
                words.remove(i);
                //counteract the i++ to keep the var at
                //the same value again
                i--;
            }
        }

        System.out.println(words);

        words.add(0, "pumpkin");
        words.add(0, "pumpkin");
        words.add("pumpkin");
        words.add("pumpkin");

        //also works bc there won't be any other occurrences
        //to the right of the one that gets removed when you
        //go through the list backwards
        for (int i = words.size() - 1; i >= 0; i--) {
            if (words.get(i).equals("pumpkin"))
                words.remove(i);
        }

        System.out.println(words);

        //using a for-each loop to remove from a list
        //doesn't work - not tracking indices in the for-each loop

        //ArrayLists can only hold objects, not primitive data
        //primitive types: int, double, booleans
        //ArrayList<int> numbers;

        //workaround - java has wrapper classes to
        //allow you to make objects of primitive data
        ArrayList<Integer> numbers = new ArrayList<Integer> ();
        numbers.add(8);

        //make a blackjackplayer object and
        //give them 2 cards

        BlackjackPlayer p1 = new BlackjackPlayer("anna");
        System.out.println(p1);


        Card c = new Card("spades", 7);

        //addCard() is defined to accept a Card
        //object as an argument
        p1.addCard(c);

        System.out.println(p1);

        Card c2 = new Card("hearts", 13);
        p1.addCard(c2);

        System.out.println(p1);


    }
}
