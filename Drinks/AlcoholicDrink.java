package Drinks;

public class AlcoholicDrink extends Drink{

    private Double alcohol_content;
    public AlcoholicDrink(String name, String unit, int price, Double alcohol_content) {
        super(name, unit, price);
        this.alcohol_content = alcohol_content;
    }

    public Double getAlcohol_content() {
        return alcohol_content;
    }

    public void setAlcohol_content(Double alcohol_content) {
        this.alcohol_content = alcohol_content;
    }

    @Override
    public String toString() {
        return alcohol_content + "% V/V " + super.toString();
    }
}
