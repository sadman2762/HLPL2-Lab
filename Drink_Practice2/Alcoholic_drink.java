package Drink_Practice2;

public class Alcoholic_drink extends Drink{

    private double alcohol_content;
    public Alcoholic_drink(String name, String unit, int price, double alcohol_content) {
        super(name, unit, price);
        this.alcohol_content = alcohol_content;
    }

    public double getAlcohol_content() {
        return alcohol_content;
    }

    public void setAlcohol_content(double alcohol_content) {
        this.alcohol_content = alcohol_content;
    }

    @Override
    public String toString() {
        return String.format("%.2f %% V/V", alcohol_content) + super.toString();
    }
}
