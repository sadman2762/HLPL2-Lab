package Drink_Practice;

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

    public Drink(String name, int price) {
        this(name, "5 dl", price);
    }

    public String getUnit() {
        return unit;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        // return name + ", " + unit + ", " + price + " Ft";
        return String.format("%s, %s, %d Ft", name, unit, price);
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
        if(this.price != o.price){
            return o.price - this.price; // Descending Order
        }

        if(!this.unit.equals(o.unit)){
            return this.unit.compareTo(o.unit); // Ascending Order
        }

        return this.name.compareTo(o.name); // Ascending Order
    }
}
