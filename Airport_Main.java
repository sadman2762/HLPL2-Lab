import java.util.*;

class Airport implements Comparable<Airport>{

    String name;
    String city;
    int runways;
    int transferTime;

    public Airport(String name, String city, int runways, int transferTime) {
        this.name = name;
        this.city = city;
        this.runways = runways;
        this.transferTime = transferTime;
    }

    public int compareTo(Airport other) {
        // Compare by runways descending
        int compareRunways = Integer.compare(other.runways, this.runways); // They both subtracting and will result in >0 or <0
        if (compareRunways != 0) {
            return compareRunways;
        }

        // Compare by transfer time (descending)
        int compareTransferTime = Integer.compare(other.transferTime, this.transferTime);
        if (compareTransferTime != 0) {
            return compareTransferTime;
        }

        // Compare by name (ascending)
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + "(" + city + "): " + transferTime;
    }
}

public class Airport_Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        List <Airport> airports = new ArrayList<>(); // Airport is the abstract data type define by the Constructor

        for (int i = 0; i < n; i++) {
            String line = input.nextLine();
            String[] parts = line.split(";");
            String name = parts[0];
            String city = parts[1];
            int runways = Integer.parseInt(parts[2]);
            int transferTime = Integer.parseInt(parts[3]);
            airports.add(new Airport(name, city, runways, transferTime));
        }

        Collections.sort(airports); // This method is part of the Comparable class with the CompareTo function

        for (Airport airport : airports) {
            System.out.println(airport);
        }
    }
}
