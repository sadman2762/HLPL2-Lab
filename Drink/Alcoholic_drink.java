package Drink;

public class Alcoholic_drink extends Drink {
    private String alcohol;
    public Alcoholic_drink(String name, String unit, int price, String alcohol) {
        super(name, unit, price);
        this.alcohol = alcohol;
    }

    public String getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(String alcohol) {
        this.alcohol = alcohol;
    }

    @Override
    public String toString() {
        return alcohol + " V/V " + super.toString();
    }
}
