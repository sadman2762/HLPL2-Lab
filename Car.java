import java.util.Objects;
import static java.util.Objects.hash;
public class Car {
    private String plate;
    private int power;
    private boolean automatic;
    public static int count = 0;
    public static final int COOL_LIMIT = 150;

    public Car(String plate, int power, boolean automatic) {
        this.plate = plate;
        this.power = power;
        this.automatic = automatic;
        count++;
    }

    public Car() {
        count++;
    }

    public Car(String plate, int power) {
        this(plate, power, true);
        this.plate = plate;
        this.power = power;
        this.automatic = true;
    }

    @Override
    public String toString() {
        return "Car{" +
                "plate='" + plate + '\'' +
                ", power=" + power +
                ", automatic=" + automatic +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return power == car.power && automatic == car.automatic && Objects.equals(plate, car.plate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plate, power, automatic);
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    public boolean isCoolCar() {
        return power > COOL_LIMIT;
    }

    public static Car whichIsTheCooler(Car leftCar, Car rightCar) {
        if(leftCar.power > rightCar.power){
            return leftCar;
        } else {
            return rightCar;
        }
    }
}
