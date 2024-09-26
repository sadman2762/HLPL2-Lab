package Practice12Oct;

import java.util.Objects;

public class Rollercoaster implements Comparable<Rollercoaster> {
    private String name;
    private String world;
    private int height;
    private int time;

    public Rollercoaster(String name, String world, int height, int time) {
        this.name = name;
        this.world = world;
        this.height = height;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
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
        if (!(o instanceof Rollercoaster)) return false;
        Rollercoaster that = (Rollercoaster) o;
        return getHeight() == that.getHeight() && getTime() == that.getTime() && Objects.equals(getName(), that.getName()) && Objects.equals(getWorld(), that.getWorld());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getWorld(), getHeight(), getTime());
    }


    @Override
    public int compareTo(Rollercoaster o) {
        if(this.time != o.time) {
            return this.time - o.time; // Ascending Order
        }

        if(this.height != o.height){
            return o.height - this.height; // Ascending Order
        }

        return this.name.compareTo(o.name); // Ascending Order
    }

    @Override
    public String toString() {
        return name + " (" + world + "): " + time;
    }
}
