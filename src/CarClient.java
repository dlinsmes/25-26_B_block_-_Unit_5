public class CarClient {

    public static void main(String [] args) {

        //declare a Car object (one specific example
        //of a car
        //Car is like a custom data type
        Car c1 = new Car();

        c1.doors = 4;
        c1.color = "blue";
        c1.seats = 5;
//        c1.miles = 50000;
        //use the public method to add miles to Car c1
        c1.addMiles(50000);
        c1.brand = "tesla";

//        System.out.println(c1.brand + " " + c1.miles);
        System.out.println(c1.brand + " " + c1.getMiles());

        Car c2 = new Car();
        c2.doors = 1;
        c2.color = "red";
        c2.seats = 10;
//        c2.miles = 9;
        c2.addMiles(9);
        c2.brand = "ford";

//        c2.miles = -100;

        //the addMiles() method will address
        //how to handle negatives
        c2.addMiles(-100);

        c2.addMiles(300);

//        System.out.println(c2.brand + " " + c2.miles);
        System.out.println(c2.brand + " " + c2.getMiles());
    }
}
