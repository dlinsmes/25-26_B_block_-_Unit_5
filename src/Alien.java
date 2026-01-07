public class Alien {

    private String name;
    private int arms;
    private boolean hungry;

    //define a constructor so that it's easier to set
    //initial values for Alien objects
    //a constructor is a special method that allows you
    //to create new objects
    public Alien(String newName, int arms, boolean h) {
        //when this constructor gets used, a value for name, arms, and hungry will
        //get passed

        name = newName;

        //when the param has the same name as the instance variable,
        //use the "this" keyword to refer to the instance var
        this.arms = arms;

        //"this" is not necessary (but doesn't hurt) in this case
        //bc the param has a different name
        this.hungry = h;
    }

    //can have multiple overloaded constructors
    public Alien(String name) {
        this.name = name;

        //regardless of params, constructors should initialize
        //values for all instance variables
        arms = 3;
        hungry = true;
    }

    public String getName() { return name; }
    public int getArms() { return arms; }
    public boolean getHungry() { return hungry; }

    public void setName(String newName) { name = newName; }
    public void setArms(int newArms) { arms = newArms; }
    public void setHungry() {
        hungry = !hungry;
    }

    public void eat() {
//        setHungry();
        //the private variables can be directly accessed
        //in the same class
        //OR you can use the other defined methods
        hungry = false;
        arms++;
    }

    //this method will get implicitly called
    //when you print an object of this class
    //-return information about the object in
    //a string format
    public String toString() {
        return "Name: " + name +
                "\nArms: " + arms +
                "\nHungry: " + hungry;
    }
}
