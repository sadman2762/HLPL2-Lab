package Airport;

import java.util.Objects;

public class Airport implements Comparable<Airport> {
    private String name;
    private String city;
    private int runways;
    private int time;

    public Airport(String name, String city, int runways, int time) {
        this.name = name;
        this.city = city;
        this.runways = runways;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRunways() {
        return runways;
    }

    public void setRunways(int runways) {
        this.runways = runways;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airport)) return false;
        Airport airport = (Airport) o;
        return Objects.equals(getName(), airport.getName()) && Objects.equals(getCity(), airport.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCity());
    }

    @Override
    public String toString() {
        return name + " (" + city + ") " + time ;
    }

    @Override
    public int compareTo(Airport o) {
        if(this.runways != o.runways) {
            return -(this.runways - o.runways); // Descending Order
        }

        if(this.time != o.time) {
            return Integer.compare(o.time, this.time); //Descending Order
        }

        return this.name.compareTo(o.name);
    }
}
