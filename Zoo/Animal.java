package Zoo;

import java.util.Objects;

public class Animal implements Comparable<Animal>{
    public String species;
    protected double age; // rational number = double data type
    private double weight;

    public Animal(String species, double age, double weight) {
        this.species = species;
        this.age = age;
        this.weight = weight;
    }

    // Constructor to set the default value for the age 0.0
    public Animal(String species, double weight) { // Still doesn't give
        this(species, 0.0, weight);
    }

    public double getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return species + ": " + age + "ages, " + weight + " kg";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Double.compare(getAge(), animal.getAge()) == 0 && Double.compare(getWeight(), animal.getWeight()) == 0 && Objects.equals(species, animal.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, getAge(), getWeight());
    }


    @Override
    public int compareTo(Animal o) {

        if(!this.species.equals(o.species)){
            return -this.species.compareTo(o.species); // Descending Order
        }

        if(this.age != o.age) {
            return Double.compare(o.age, this.age); // Descending Order
        }

        return Double.compare(this.weight, o.weight);  // Ascending Order

    }
}
