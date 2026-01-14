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


    }
}
