public class StudentClient {

    public static void main(String [] args) {

        //static vars and methods are accessed
        //directly from the class rather than
        //from a specific object/instance
        System.out.println(Student.sequenceNum);

        //declare and instantiate (make an object) of the
        //Student class
        Student s1 = new Student("oliver", 10);

        //can't access private vars from the client
        //System.out.println(s1.name);

        System.out.println(s1.getName());

        //can't call getName() from the whole class
        //-need to call it from a specific object
//        System.out.println(Student.getName());

        //private var
        //s1.grade = 12;

        s1.setGrade(12);

        System.out.println(s1);

        Student s2 = new Student("nick", 10);
        System.out.println(s2);

        //whenever the static value changes
        //(when the constructor gets called),
        //that change is seen for the whole class
        System.out.println(Student.sequenceNum);

        //Math is a built-in class and
        //random() is a static method of that class
        //-we know it's static bc we've never made
        //a Math object
        Math.random();

        //Pi is a static var of the Math class
        System.out.println(Math.PI);

        //private static var
        //System.out.println(Student.onBreak);

        System.out.println(Student.getOnBreak());

        //setting this value for the Student class
        //updates the value for all objects of the class
        Student.setOnBreak(true);

        System.out.println(s1);
        System.out.println(s2);

        //since main() is always static, you can
        //call main() from other classes in the same
        //projects
//        CarClient.main(args);
    }
}
