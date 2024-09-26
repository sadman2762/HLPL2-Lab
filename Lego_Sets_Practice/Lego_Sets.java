package Lego_Sets_Practice;

import java.util.Objects;

public class Lego_Sets implements Comparable <Lego_Sets> {
    private String code;
    private String name;
    private String theme;
    private int pieces;


    public Lego_Sets(String code, String name, String theme, int pieces) {
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
        if (!(o instanceof Lego_Sets)) return false;
        Lego_Sets legoSets = (Lego_Sets) o;
        return getPieces() == legoSets.getPieces() && Objects.equals(getCode(), legoSets.getCode()) && Objects.equals(getName(), legoSets.getName()) && Objects.equals(getTheme(), legoSets.getTheme());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode(), getName(), getTheme(), getPieces());
    }


    @Override
    public int compareTo(Lego_Sets o) {
        if(this.pieces != o.pieces){
            return o.pieces - this.pieces; // Descending Order
        }

        if(!this.theme.equals(o.theme)) {
            return this.theme.compareTo(o.theme); // Ascending Order
        }

        if(!this.name.equals(o.name)) {
            return this.name.compareTo(o.name); // Ascending Order
        }

        return this.code.compareTo(o.code); // Ascending Order
    }

    @Override
    public String toString() {
        return name + " ("+ code + "): " + pieces + " - " + theme;
    }

}
