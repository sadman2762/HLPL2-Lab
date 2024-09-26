package Lego_sets;

import java.util.Objects;

public class Lego_Set implements Comparable<Lego_Set> {
    private String code;
    private String name;
    private String theme;
    private int pieces;

    public Lego_Set(String code, String name, String theme, int pieces) {
        this.code = code;
        this.name = name;
        this.theme = theme;
        this.pieces = pieces;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lego_Set)) return false;
        Lego_Set legoSet = (Lego_Set) o;
        return getPieces() == legoSet.getPieces() && Objects.equals(getCode(), legoSet.getCode()) && Objects.equals(getName(), legoSet.getName()) && Objects.equals(getTheme(), legoSet.getTheme());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode(), getName(), getTheme(), getPieces());
    }

    @Override
    public String toString() {
        return name + " (" + code +"): " + pieces + " - " + theme;
    }

    @Override
    public int compareTo(Lego_Set o) {
        if(this.pieces != o.pieces) {
            return Integer.compare(o.pieces, this.pieces); // descending order
        }
        if(!this.theme.equals(o.theme)) {
            return this.theme.compareTo(o.theme); // ascending order
        }
        if(!this.name.equals(o.name)) {
            return this.name.compareTo(o.name); // ascending order
        }

        return this.code.compareTo(o.code); // ascending order
    }
}
