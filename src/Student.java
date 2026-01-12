public class Student {

    //instance vars - each object (example) we make from this
    //class will have these vars but with different values
    private String name;
    private int grade;


    int id;

    //each id should be a unique identifying number
    //where no two students have the same id

    //static means that the var or method belongs to
    //the whole class, not one specific object
    static int sequenceNum = 0;

    //static bc either all students are on break or none are
    //(individual students can't have different statuses)
    private static boolean onBreak = false;

    public static boolean getOnBreak() { return onBreak; }
    public static void setOnBreak(boolean status) {
        onBreak = status;
    }

    //constructor - what gets called to create a new object
    public Student (String n, int grade) {
        name = n;
        //"this" refers to the instance var when the param
        //is named the same
        this.grade = grade;

        //even though there are only two params, a constructor
        //should initialize values for ALL instance vars
        //id = 0;

        sequenceNum++;
        id = sequenceNum;
    }

    //accessor aka get methods - return type matches the var type
    public String getName() { return name; }
    public int getGrade() { return grade; }
    public int getID() { return id; }

    //mutator aka set method
    //-param type matches the var type
    public void setGrade(int grade) {
        //can include logic to validate the param value is usable
        this.grade = grade;
    }

    //toString() defines what gets output when you
    //print an object
    public String toString() {
        return "name: " + name + ", grade: " + grade
                + ", id: " + id + ", on break: " + onBreak;
    }


}
