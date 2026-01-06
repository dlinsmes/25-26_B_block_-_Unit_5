//a class is a blueprint of something you want
//to represent with code

public class Car {

    //instance variables
    //every instance (example) of a car has these
    //variables but with different values for
    //each specific car

    int doors;
    String color;
    int seats;

    //a car's number of miles should only be allowed to go up
    //(can't go down or go negative)
    //the private visibility modifier will close read/write access
    //to outside classes
    //-you can only change/view this variable within this class
    private int miles;

    String brand;

    //allow outside classes to get read access to
    //the private variable
    //accessor methods aka get methods aka getters
    // return type matches the private variable type
    // name is getVariable
    // no param
    //method body is just return variable
    public int getMiles() {
        return miles;
    }

    //public method to allow outside classes to
    //change the value of miles in a controlled way
    //(since we can't subtract or go negative)
    public void addMiles(int newMiles) {
        if (newMiles < 0) {
            System.out.println("can't add " + newMiles + " miles");
        }
        else
            miles += newMiles;
    }

    //write a way to control a car's color to only
    //red, blue, black, white
}
