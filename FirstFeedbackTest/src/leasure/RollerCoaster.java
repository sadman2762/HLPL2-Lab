package leasure;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class RollerCoaster implements Comparable<RollerCoaster> {
    private final String name;
    private final String world;
    private int height;
    private int time;

    public RollerCoaster(String name, String world, int height, int time) {
        this.name = name;
        this.world = world;
        this.height = height;
        this.time = time;
    }

    public RollerCoaster(String name, String world, int time) {
        this.name = name;
        this.world = world;
        this.time = time;
        height = 120;
    }

    public RollerCoaster(String line) {
        String[] tokens = line.split(";");
        name = tokens[0];
        world = tokens[1];
        height = Integer.parseInt(tokens[2]);
        time = Integer.parseInt(tokens[3]);
    }

    public String getName() {
        return name;
    }

    public String getWorld() {
        return world;
    }

    public int getHeight() {
        return height;
    }

    public int getTime() {
        return time;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return name + " (" + world + "): " + time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RollerCoaster that = (RollerCoaster) o;
        return Objects.equals(name, that.name) && Objects.equals(world, that.world);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, world);
    }


    @Override
    public int compareTo(RollerCoaster o) {
        if (this.time != o.time) {
            return this.time - o.time;
        }
        if (this.height != o.height) {
            return -(this.height - o.height);
        }
        return this.name.compareTo(o.name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RollerCoaster[] coasters = new RollerCoaster[20];
        int length = 0;

        while(true){
            String line = sc.nextLine();
            if(Objects.equals(line,"END")){
                break;
            }
            coasters[length] = new RollerCoaster(line);
            length++;
        }
        Arrays.sort(coasters, 0, length);
        for (int i = 0; i < length; i++) {
            System.out.println(coasters[i]);
        }
    }

}
