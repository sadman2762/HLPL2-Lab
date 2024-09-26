import java.util.Objects;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.setPlate("ABC1213");
        car.setPower(155);
        car.setAutomatic(false);
        System.out.println(car);
        // System.out.println(Car.count);
        //To print the object in a plain text format
        System.out.println(car.getPlate() + " " + car.getPower() + " " + car.isAutomatic());

        Car car2 = new Car("ABC1213", 155, false);
        System.out.println(car2);
        // Make the object to string
        System.out.println(car2.toString());

        //Referring to the new car class with 2 arguments
        Car car3 = new Car("ABC123", 80);
        System.out.println(car3);

        System.out.println(car == car2);
        Car car4 = car2;
        System.out.println(car2 == car4);
        //Check if all the fields are the same
        System.out.println(car2.equals(car));
        System.out.println(car.equals(car2));
        System.out.println("-------------");
        System.out.println("apple".equals("apple"));
        System.out.println("banana".equals("banana"));
        System.out.println(Objects.equals(car, car2));
        System.out.println("Count: "+ Car.count);
        System.out.println(car.isCoolCar());
        Car coolCar = new Car("cool01", 300);
        System.out.println(Car.whichIsTheCooler(car, coolCar));
    }
}
