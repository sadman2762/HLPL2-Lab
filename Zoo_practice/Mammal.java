package Zoo_practice;

public class Mammal extends Animal{

    private int legs;
    public Mammal(String species, double age, double weight, int legs) {
        super(species, age, weight);
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" ( number of legs: %d)", legs);
    }
}
