package Drinks;

import java.util.Objects;

public class Drink implements Comparable<Drink>{
    public String name;
    protected String unit;
    private int price;

    public Drink(String name, String unit, int price) {
        this.name = name;
        this.unit = unit;
        this.price = price;
    }

    public Drink(int price, String name) {
        this(name, "5 dl", price);
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d Ft",
                name, unit, price );

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Drink)) return false;
        Drink drink = (Drink) o;
        return getPrice() == drink.getPrice() && Objects.equals(name, drink.name) && Objects.equals(unit, drink.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, unit, getPrice());
    }


    @Override
    public int compareTo(Drink o) {
        if(this.price != o.price){
            return o.price - this.price; // Descending Order
        }

        if(this.unit.equals(o.unit)){
            return this.unit.compareTo(o.unit); //Ascending Order
        }

        return this.name.compareTo(o.name); // Ascending order
    }
}
