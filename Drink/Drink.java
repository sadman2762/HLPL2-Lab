package Drink;

import java.util.Objects;

public class Drink implements Comparable<Drink> {
    public String name;
    protected String unit;
    private int price;

    public Drink(String name, String unit, int price) {
        this.name = name;
        this.unit = "5 dl";
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + ", " + unit + ", " + price + " Ft";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Drink)) return false;
        Drink drink = (Drink) o;
        return getPrice() == drink.getPrice() && Objects.equals(name, drink.name) && Objects.equals(getUnit(), drink.getUnit());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, getUnit(), getPrice());
    }


    @Override
    public int compareTo(Drink o) {
        if(this.price != o.price) {
            return o.price - this.price; // Descending Order
        }

        if(!this.unit.equals(o.unit)){
            return this.unit.compareTo(o.unit); // Ascending Order
        }

        return this.name.compareTo(o.name); // Ascending Order
    }

}
