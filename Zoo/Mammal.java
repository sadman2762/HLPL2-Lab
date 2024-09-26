package Zoo;

public class Mammal extends Animal{
    private int legs;
    public Mammal(String species, Double age, Double weight, int legs) {
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
        return super.toString() + "(number of legs: " + legs + ")";
    }

}
