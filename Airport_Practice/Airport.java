package Airport_Practice;

public class Airport implements Comparable<Airport>{
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
    public int compareTo(Airport o) {
        if (this.runways != o.runways){
            return o.runways - this.runways; // Descending order
        }

        if (this.time != o.time){
            return o.time - this.time; // Descending Order
        }

        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return name + " (" + city + "): " + time;
    }
}
