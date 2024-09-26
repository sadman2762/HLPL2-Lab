public class Truck extends Car {
    protected int capacity;


    public Truck(String plate, int power, boolean automatic, int capacity) {
        super(plate, power, automatic);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString() + " " + capacity;
    }
}
