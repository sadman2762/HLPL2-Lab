package aviation;

import leasure.RollerCoaster;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Airport implements Comparable<Airport> {
    private final String name;
    private final String city;
    private int runways;
    private int time;

    public Airport(String name, String city, int runways, int time) {
        this.name = name;
        this.city = city;
        this.runways = runways;
        this.time = time;
    }

    public Airport(String name, String city, int time) {
        this.name = name;
        this.city = city;
        this.time = time;
        runways = 1;
    }

    public Airport(String line) {
        String[] tokens = line.split(";");
        this.name = tokens[0];
        this.city = tokens[1];
        this.runways = Integer.parseInt(tokens[2]);
        this.time = Integer.parseInt(tokens[3]);

    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getRunways() {
        return runways;
    }

    public void setRunways(int runways) {
        this.runways = runways;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        return name + " (" + city + "): " + time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(name, airport.name) && Objects.equals(city, airport.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city);
    }


    @Override
    public int compareTo(Airport o) {
        if(this.runways != o.runways){
            return -(this.runways - o.runways);
        }
        if(this.time != o.time){
            return -(this.time - o.time);
        }
        return this.name.compareTo(o.name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Airport[] airports = new Airport[20];
        int length = 0;

        while(true){
            String line = sc.nextLine();
            if(Objects.equals(line,"END")){
                break;
            }

            airports[length] = new Airport(line);
            length++;

        }
        Arrays.sort(airports,0,length);

        for (int i = 0; i < length; i++) {
            System.out.println(airports[i]);

        }
    }
}
