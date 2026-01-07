public class AlienClient {

    public static void main(String [] args) {

        //calls a default constructor to make one object of the class

//        Alien a1 = new Alien();
        //variables will default to 0/false/null

        //private variable - can't access here
//        a1.name = "fadsf";

//        a1.setName("hengyi");
//        a1.setArms(2);
//
//        System.out.println(a1.getName());

        //once you define a constructor in a class, the default
        //no-param constructor is no longer available to use

        //when you define a constructor, pass values for each of the
        //params
        //-this makes setting the initial values faster
        Alien a2 = new Alien("sebas", 4, false);

        Alien a3 = new Alien("marv");
        //this particular constructor will default objects to have
        //3 arms and hungry = true

        //by default, if you print an object, the
        //memory location will output (like arrays)
        System.out.println(a3);

        //once you define toString() in a class, that method
        //will get automatically called when you print the object

        int [] nums = new int [10];

        //alien array called aliens that holds 4 objects
        Alien [] aliens = new Alien [4];

        //the above line will create space for 4 objects
        //but doesn't have any actual alien objects in the
        //array yet
        System.out.println(aliens[0]);

        aliens[0] = a2;
        aliens[1] = a3;
        //can call the constructor and directly save to the array
        aliens[2] = new Alien("jack", 1, true);
        aliens[3] = new Alien("niko");

        System.out.println();

        //print the name from each of the objects
        // in the aliens array using a for loop
        for (int i = 0; i < aliens.length; i++) {
            //this will output the toString() of each object
//            System.out.println(aliens[i]);

            System.out.println(aliens[i].getName());
        }

        for (Alien a: aliens) {
            //a is each object in the array (not an index)
            System.out.println(a.getName());
        }

    }

}
